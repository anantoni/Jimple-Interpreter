package de.upb.soot.jimple.interpreter.systemTest.inheritance;

class B extends A {
  protected int a = 5;
  protected int b = 3;

  public void print() {
    System.out.println("printB");
  }

  public void methodB() {
    System.out.println("methodB");
  }
}
