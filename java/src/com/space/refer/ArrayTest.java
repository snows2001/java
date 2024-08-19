package com.space.refer;
public class ArrayTest {
public static void main(String[] args) {	
  Point[] points = new Point[3];
  points[0] = new Point(32, 64);
  points[1] = new Point(16, 79);
  points[2] = new Point(82, 52);
  
  Rectangle[] recs = new Rectangle[4];
  
  Rectangle r1 = new Rectangle();
  Rectangle r2 = new Rectangle(points[2]);
  Rectangle r3 = new Rectangle(50, 100);	  
  Rectangle r4 
         = new Rectangle(points[0], 100, 200);
  
  recs[0] = r1;
  recs[1] = r2;
  recs[2] = r3;
  recs[3] = r4;
  
  //points 배열의 x값의 합, y값의 합을 출력해 보세요~
  
 }
}













