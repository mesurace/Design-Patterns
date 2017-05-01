package com.cs525.canvas;

import java.awt.*;
import java.awt.event.MouseEvent;

import com.cs525.tool.Tool;

public class ScribbleTool implements Tool{
    public void mousePressed(ScribbleCanvasListener scl, MouseEvent e) {
        Point p = e.getPoint();
        scl.canvas.mouseButtonDown = true;
        scl.canvas.x = p.x;
        scl.canvas.y = p.y;
    }

    public void mouseReleased(ScribbleCanvasListener scl, MouseEvent e) {
        scl.canvas.mouseButtonDown = false;
    }

    public void mouseDragged(ScribbleCanvasListener scl, MouseEvent e) {
        Point p = e.getPoint();
        if (scl.canvas.mouseButtonDown) {
            scl.canvas.getOffScreenGraphics().drawLine(scl.canvas.x, scl.canvas.y, p.x, p.y);
            int xs = Math.min(scl.canvas.x, p.x);
            int ys = Math.min(scl.canvas.y, p.y);
            int dx = Math.abs(p.x-scl.canvas.x) +1;
            int dy = Math.abs(p.y-scl.canvas.y) +1;
            scl.canvas.repaint(xs, ys, dx, dy);
            scl.canvas.x = p.x;
            scl.canvas.y = p.y;
        }
    }
}
