package org.example.CreationalPatterns.Builder.builders.impl;

import lombok.*;
import org.example.CreationalPatterns.Builder.builders.Builder;
import org.example.CreationalPatterns.Builder.domain.Car;
import org.example.CreationalPatterns.Builder.domain.components.Engine;
import org.example.CreationalPatterns.Builder.domain.components.Transmission;
import org.example.CreationalPatterns.Builder.domain.components.TypeCar;
import org.example.CreationalPatterns.Builder.domain.components.Wheel;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class BuilderCar implements Builder {
    private String model;
    private String color;
    private String brand;
    private Engine engine;
    private Transmission transmission;
    private TypeCar typeCar;
    private Wheel wheel;

    public BuilderCar(){}

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTypeCar(TypeCar typeCar) {
        this.typeCar = typeCar;
    }

    @Override
    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
    @Override
    public Car getResult(){
        return Car.builder()
                .model(model)
                .brand(brand)
                .engine(engine)
                .typeCar(typeCar)
                .color(color)
                .transmission(transmission)
                .wheel(wheel)
                .build();
    }


}
