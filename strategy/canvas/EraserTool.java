package com.cs525.canvas;


import java.awt.*;
import java.awt.event.MouseEvent;

import com.cs525.tool.Tool;

public class EraserTool implements Tool {

    public void mousePressed(ScribbleCanvasListener scl, MouseEvent e) {
        Point p = e.getPoint();
        scl.canvas.mouseButtonDown = true;
        scl.canvas.x = p.x;
        scl.canvas.y = p.y;
        scl.offscreen = scl.canvas.getOffScreenGraphics();
        scl.offscreen.setColor(Color.white);
    }

    public void mouseReleased(ScribbleCanvasListener scl, MouseEvent e) {
        Point p = e.getPoint();
        scl.canvas.mouseButtonDown = false;
        scl.canvas.setPenColor(scl.canvas.penColor);
    }

    public void mouseDragged(ScribbleCanvasListener scl, MouseEvent e) {
        Point p = e.getPoint();
        if (scl.canvas.mouseButtonDown) {
            int xs, ys, dx, dy;
            xs = Math.min(scl.canvas.x, p.x) - 2;
            ys = Math.min(scl.canvas.y, p.y) - 2;
            dx = Math.abs(p.x - scl.canvas.x) + 6;
            dy = Math.abs(p.y - scl.canvas.y) + 6;
            scl.offscreen.fillRect(xs, ys, dx, dy);
            scl.canvas.repaint(xs, ys, dx, dy);
            scl.canvas.x = p.x;
            scl.canvas.y = p.y;
        }
    }
}
