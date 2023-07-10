package org.example.CreationalPatterns.Singlenton.domain;


import lombok.Getter;

@Getter
public class Window {
    private static Window windowInstance;
    private Double height;
    private Double width;

    private Window(){};

    private Window(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    public static Window getInstance(double height, double width){
        if(windowInstance == null) {
            windowInstance = new Window(height, width);
        }
        return windowInstance;
    }

    @Override
    public String toString() {
        return "Window{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}

