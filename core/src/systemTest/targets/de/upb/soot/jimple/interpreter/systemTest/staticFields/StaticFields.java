package de.upb.soot.jimple.interpreter.systemTest.staticFields;

public class StaticFields {
    public static void static_fields() {
        A.methodA();
        System.out.println(A.a + A.b);
    }
}
