package org.example.CreationalPatterns.Builder.builders;

import org.example.CreationalPatterns.Builder.domain.Car;
import org.example.CreationalPatterns.Builder.domain.components.Engine;
import org.example.CreationalPatterns.Builder.domain.components.Transmission;
import org.example.CreationalPatterns.Builder.domain.components.TypeCar;
import org.example.CreationalPatterns.Builder.domain.components.Wheel;

public interface Builder {

    void setModel(String model);
    void setBrand(String brand);
    void setColor(String color);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTypeCar(TypeCar typeCar);
    void setWheel(Wheel wheel);
    Car getResult();
}
