package org.example.CreationalPatterns.Builder.domain;


import lombok.*;

import org.example.CreationalPatterns.Builder.domain.components.Engine;
import org.example.CreationalPatterns.Builder.domain.components.Transmission;
import org.example.CreationalPatterns.Builder.domain.components.TypeCar;
import org.example.CreationalPatterns.Builder.domain.components.Wheel;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Car {
    private String model;
    private String color;
    private String brand;
    private Engine engine;
    private Transmission transmission;
    private TypeCar typeCar;
    private Wheel wheel;
    }
