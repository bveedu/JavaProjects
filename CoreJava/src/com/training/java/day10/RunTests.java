package com.training.java.day10;

import java.lang.annotation.*;
import java.lang.reflect.Method;
/**
 * Indicates that the annotated method is a test method.
 * This annotation should be used only on parameter less static methods.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test { }

class Foo {
    @Test public static void m1() { }
    public static void m2() { }
    @Test public static void m3() {
        throw new RuntimeException("Boom");
    }
    public static void m4() { }
    @Test public static void m5() { }
    public static void m6() { }
    @Test public static void m7() {
        throw new RuntimeException("Crash");
    }
    public static void m8() { }
}
public class RunTests {
	   public static void main(String[] args) throws Exception {
	      int passed = 0, failed = 0;
	      for (Method m : Class.forName("com.training.java.day10.Foo").getMethods()) {
	         if (m.isAnnotationPresent(Test.class)) {
	            try {
	               m.invoke(null);
	               passed++;
	            } catch (Throwable ex) {
	               System.out.printf("Test %s failed: %s %n", m, ex.getCause());
	               failed++;
	            }
	         }
	      }
	      System.out.printf("Passed: %d, Failed %d%n", passed, failed);
	   }
	}
