package leanor.java_qa.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("user");
    hello ("Kitty");
    Square s = new Square(7);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
    Rectangle r = new Rectangle(10,8);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
  }

	public static void hello (String somebody) {

    System.out.println("Hello, " + somebody + "!");

  }


}