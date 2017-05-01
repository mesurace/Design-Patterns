package com.cs525.canvas;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;

import com.cs525.shape.TwoEndShape;

public class LineShape implements TwoEndShape {

	@Override
	public void mousePressed(ScribbleCanvasListener scl, MouseEvent e) {
		Point p = e.getPoint();
		scl.canvas.mouseButtonDown = true;
		scl.xStart = scl.canvas.x = p.x;
		scl.yStart = scl.canvas.y = p.y;
		scl.onscreen = scl.canvas.getGraphics();
		scl.onscreen.setXORMode(Color.darkGray);
		scl.onscreen.setColor(Color.lightGray);
		scl.onscreen.drawLine(scl.xStart, scl.yStart, scl.xStart, scl.yStart);
		
	}

	@Override
	public void mouseReleased(ScribbleCanvasListener scl, MouseEvent e) {
		Point p = e.getPoint();
		scl.canvas.mouseButtonDown = false;
		scl.onscreen.setPaintMode();
		scl.offscreen = scl.canvas.getOffScreenGraphics();
		scl.offscreen.drawLine(scl.xStart, scl.yStart, p.x, p.y);
		scl.canvas.repaint();
		
	}

	@Override
	public void mouseDragged(ScribbleCanvasListener scl, MouseEvent e) {
		Point p = e.getPoint();
		if (scl.canvas.mouseButtonDown) {
			scl.onscreen.drawLine(scl.xStart, scl.yStart, scl.canvas.x, scl.canvas.y);
			scl.onscreen.drawLine(scl.xStart, scl.yStart, p.x, p.y);
		}
		scl.canvas.x = p.x;
		scl.canvas.y = p.y;
		
	}

	

}
