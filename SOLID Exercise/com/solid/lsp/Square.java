package com.solid.lsp;

public class Square implements Rectangle {
	private int side

    Square(int side) {
        this.setSide(side);
    }

    public void setSide(int side) {
        this.setSide = side;
    }

    public void getSide(int side) {
		return side
    }
	
	public int getArea() {
		return side*side
	}
