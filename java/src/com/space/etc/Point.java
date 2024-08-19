package com.space.etc;

import java.util.Objects;

public class Point {
	int x;
	int y;
	
	public Point() {}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y); //10 
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) //point1.equals(point1);
			return true;
		if (obj == null) //point1.equals(null);
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}
	
}
