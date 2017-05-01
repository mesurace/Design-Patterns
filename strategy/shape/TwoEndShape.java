package com.cs525.shape;

import java.awt.event.MouseEvent;

import com.cs525.canvas.ScribbleCanvasListener;

public interface TwoEndShape {

	void mousePressed(ScribbleCanvasListener scl, MouseEvent e);
    void mouseReleased(ScribbleCanvasListener scl, MouseEvent e);
    void mouseDragged(ScribbleCanvasListener scl, MouseEvent e);
}
