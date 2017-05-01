package com.cs525.canvas;

import java.awt.event.MouseEvent;

import com.cs525.shape.TwoEndShape;
import com.cs525.tool.Tool;

public class TwoEndsTool implements Tool {
	
	TwoEndShape twoEndShape;
	
	public TwoEndsTool(TwoEndShape twoEndShape){
		this.twoEndShape=twoEndShape;
	}

	@Override
	public void mousePressed(ScribbleCanvasListener scl, MouseEvent e) {
		twoEndShape.mousePressed(scl, e);
		
	}

	@Override
	public void mouseReleased(ScribbleCanvasListener scl, MouseEvent e) {
		twoEndShape.mouseReleased(scl, e);
		
	}

	@Override
	public void mouseDragged(ScribbleCanvasListener scl, MouseEvent e) {
		twoEndShape.mouseDragged(scl, e);
		
	}

	

}
