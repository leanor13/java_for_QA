package leanor.java_qa.sandbox;

/**
 * Created by leanor on 23.07.2016.
 */
public class Lesson_1_Task_2 {
  public static void main(String[] args) {
    Point p1 = new Point(1, 0);
    Point p2 = new Point(0, 1);
    System.out.println("Расстояние между точками (" + p1.x + "," + p1.y + ") и ("
            + p2.x + "," + p2.y + ") = " + p1.distance(p2));

    Point p4 = new Point(4, 0);
    Point p5 = new Point(1, 4);
    System.out.println("Расстояние между точками (" + p4.x + "," + p4.y + ") и ("
            + p5.x + "," + p5.y + ") = " + p5.distance(p4));


  }


}
