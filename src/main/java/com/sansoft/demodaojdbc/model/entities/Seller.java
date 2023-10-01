package com.sansoft.demodaojdbc.model.entities;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Seller implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @EqualsAndHashCode.Include
    private Integer id;

    private String name;
    private String email;
    private Date birthDate;
    private Double baseSalary;
    private Department department;



}
