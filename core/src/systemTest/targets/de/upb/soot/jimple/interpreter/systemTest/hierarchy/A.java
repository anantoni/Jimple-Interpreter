package de.upb.soot.jimple.interpreter.systemTest.hierarchy;

class A extends B {

  // Returns a string literal
  public String methodA() {
    return "Return from methodA of class A";
  }

  // Returns an integer value
  public int method_intA() {
    return 7;
  }
}