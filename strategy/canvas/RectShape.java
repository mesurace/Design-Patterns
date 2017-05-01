package com.cs525.canvas;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;

import com.cs525.shape.TwoEndShape;

public class RectShape implements TwoEndShape {
	 public void mousePressed(ScribbleCanvasListener scl, MouseEvent e) {
	        Point p = e.getPoint();
	        scl.canvas.mouseButtonDown = true;
	        scl.xStart = scl.canvas.x = p.x;
	        scl.yStart = scl.canvas.y = p.y;
	        scl.onscreen = scl.canvas.getGraphics();
	        scl.onscreen.setXORMode(Color.darkGray);
	        scl.onscreen.setColor(Color.lightGray);
	        scl.onscreen.drawRect(scl.xStart, scl.yStart, 1, 1);
	    }

	    public void mouseReleased(ScribbleCanvasListener scl, MouseEvent e) {
	        Point p = e.getPoint();
	        scl.canvas.mouseButtonDown = false;
	        scl.onscreen.setPaintMode();
	        scl.offscreen = scl.canvas.getOffScreenGraphics();
	        scl.offscreen.drawRect(scl.xStart, scl.yStart, p.x - scl.xStart + 1, p.y - scl.yStart + 1);
	        scl.canvas.repaint();
	    }

	    public void mouseDragged(ScribbleCanvasListener scl, MouseEvent e) {
	        Point p = e.getPoint();
	        if (scl.canvas.mouseButtonDown) {
	            scl.onscreen.drawRect(scl.xStart, scl.yStart, scl.canvas.x - scl.xStart + 1, scl.canvas.y - scl.yStart + 1);
	            scl.onscreen.drawRect(scl.xStart, scl.yStart, p.x - scl.xStart + 1, p.y - scl.yStart + 1);
	        }
	        scl.canvas.x = p.x;
	        scl.canvas.y = p.y;
	    }
	}
