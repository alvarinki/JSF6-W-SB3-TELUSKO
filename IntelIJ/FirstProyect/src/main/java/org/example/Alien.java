package org.example;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Alien {

    @Id
    private int aid;

    private String aname;


    private String tech;

}
