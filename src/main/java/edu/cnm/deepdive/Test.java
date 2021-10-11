package edu.cnm.deepdive;

public class Test {
  public static void main(String[] args) {
    GrayWolf k9;
    k9 = new Dog();
    k9.vocalize();
    k9 = new GrayWolf();
    k9.vocalize();
  }
}
