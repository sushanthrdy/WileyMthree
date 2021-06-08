package com.sushanth.classes;

import com.sushanth.interfaces.Drawable;
import com.sushanth.interfaces.Fillable;

public class Line implements Drawable, Fillable {

	@Override
	public void fillingColor() {
		System.out.println("Filling color of line");

	}

	@Override
	public void size() {
		System.out.println("Size of line");

	}

	@Override
	public void drawingColor() {
			System.out.println("Drawing color of line");

	}

	@Override
	public void thickness() {
		System.out.println("Thickness of line");

	}

}
