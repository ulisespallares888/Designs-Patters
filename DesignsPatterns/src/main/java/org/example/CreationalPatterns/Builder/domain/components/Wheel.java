package org.example.CreationalPatterns.Builder.domain.components;

import lombok.*;
import lombok.Builder;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Wheel {
    private double width;
    private double high;
}
