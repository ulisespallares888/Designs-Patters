package org.example.CreationalPatterns.Builder.director;

import org.example.CreationalPatterns.Builder.builders.Builder;
import org.example.CreationalPatterns.Builder.domain.components.Engine;
import org.example.CreationalPatterns.Builder.domain.components.Transmission;
import org.example.CreationalPatterns.Builder.domain.components.TypeCar;
import org.example.CreationalPatterns.Builder.domain.components.Wheel;

public class Director {
   public void buildSuvCarManual(Builder builder){
       builder.setModel("Hiliux");
       builder.setBrand("Toyota");
       builder.setColor("Red");
       builder.setTypeCar(TypeCar.SUV);
       builder.setTransmission(Transmission.MANUAL);
       builder.setEngine(Engine.builder().pound(2000).power(100).build());
       builder.setWheel(Wheel.builder().width(30).high(45).build());
   }

    public void buildSuvCarAutomatic(Builder builder){
        builder.setModel("S10");
        builder.setBrand("Chebrolet");
        builder.setColor("Blue");
        builder.setTypeCar(TypeCar.SUV);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(Engine.builder().pound(2000).power(100).build());
        builder.setWheel(Wheel.builder().width(30).high(45).build());
    }

    public void buildCityCarManual(Builder builder){
        builder.setModel("Fiesta");
        builder.setBrand("Ford");
        builder.setColor("white");
        builder.setTypeCar(TypeCar.CITY_CAR);
        builder.setTransmission(Transmission.MANUAL);
        builder.setEngine(Engine.builder().pound(2000).power(100).build());
        builder.setWheel(Wheel.builder().width(30).high(45).build());
    }


}
