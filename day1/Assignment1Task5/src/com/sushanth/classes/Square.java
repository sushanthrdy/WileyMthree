package com.sushanth.classes;

import com.sushanth.interfaces.Drawable;
import com.sushanth.interfaces.Fillable;

public class Square implements Drawable, Fillable {

	@Override
	public void fillingColor() {
		System.out.println("Filling color of Square");

	}

	@Override
	public void size() {
		System.out.println("Size of Square");

	}

	@Override
	public void drawingColor() {
			System.out.println("Drawing color of Square");

	}

	@Override
	public void thickness() {
		System.out.println("Thickness of Square");

	}

}
