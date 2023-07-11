package org.example.CreationalPatterns.Builder;


import org.example.CreationalPatterns.Builder.builders.Builder;
import org.example.CreationalPatterns.Builder.builders.impl.BuilderCar;
import org.example.CreationalPatterns.Builder.director.Director;
import org.example.CreationalPatterns.Builder.domain.Car;

public class AppBuilder {
    public static void main(String[] args) {
        System.out.println("Builder Pattern");

        // La actual clase, AppBuilder, juega el rol de "Cliente"
        // en la estrutura del petrón builder

        Builder builder = new BuilderCar();
        Director director = new Director();

        director.buildCityCarManual(builder);
        Car cityCarManual = builder.getResult();
        director.buildSuvCarAutomatic(builder);
        Car suvCarAutomatic = builder.getResult();

        System.out.println(cityCarManual.toString());
        System.out.println(suvCarAutomatic.toString());
    }
}
