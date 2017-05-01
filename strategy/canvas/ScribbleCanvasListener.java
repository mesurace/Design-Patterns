package com.cs525.canvas;



import java.awt.*;
import java.awt.event.*;
import com.cs525.Lab1;
import com.cs525.tool.Tool;

public class ScribbleCanvasListener
        implements MouseListener, MouseMotionListener {


    protected Lab1 drawframe;
    protected ScribbleCanvas canvas;
    protected int xStart, yStart;
    protected Graphics onscreen, offscreen;
    private Tool tool;

    public ScribbleCanvasListener(ScribbleCanvas canvas, Lab1 drawframe) {
        this.canvas = canvas;
        this.drawframe = drawframe;
    }

    public void mousePressed(MouseEvent e) {
        drawframe.getCurrentTool().mousePressed(this, e);
    }

    public void mouseReleased(MouseEvent e) {
        drawframe.getCurrentTool().mouseReleased(this, e);
    }

    public void mouseDragged(MouseEvent e) {
        drawframe.getCurrentTool().mouseDragged(this, e);
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
    }

}

