package leanor.java_qa.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by leanor on 09.08.2016.
 */
public class Collections {
  public static void main(String[] args) {
    String[] langs = {"Java", "C#", "Python", "PHP"};

    List languages = Arrays.asList("Java", "C#", "Python", "PHP");

    for (Object l : languages) {
      System.out.println("Я хочу выучить " + l);
    }

  }

}
