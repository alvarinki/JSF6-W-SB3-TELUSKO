package org.example;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Laptop {

    @Id
    private Long lid;

    private String brand;
    private String model;
    private int ram;
}
