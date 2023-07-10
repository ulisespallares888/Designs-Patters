package org.example.CreationalPatterns.Singlenton;


import org.example.CreationalPatterns.Singlenton.domain.Window;

public class AppSinglenton {
    public static void main(String[] args) {
        System.out.println("Singlenton Pattern");
        Window window1 = Window.getInstance(1.1, 1.1);
        System.out.println(window1.toString());

        Window window2 = Window.getInstance(2.2,2.2);
        System.out.println(window2.toString());
        if (window1.equals(window2)){
            System.out.println("es el mismo");
        }else {
            System.out.println("no es el mismo");
        }

    }
}
