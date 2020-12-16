import java.awt.*;
// (hello.class) Byte Code --> Java Virtual MAchine --> Native Code

// void means function will not return anything
// javac hello.java -- to complile java file
// java hello -- to run

/**
 * hello
 */

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(x:1,y:1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }
}

// primitive types vs reference types (stores reference to object)
//