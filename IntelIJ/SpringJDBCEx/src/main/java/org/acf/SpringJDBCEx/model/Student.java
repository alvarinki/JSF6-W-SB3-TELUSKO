package org.acf.SpringJDBCEx.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@Scope("prototype")
public class Student {
    private int roll_No;
    private String name;
    private int Marks;
}
