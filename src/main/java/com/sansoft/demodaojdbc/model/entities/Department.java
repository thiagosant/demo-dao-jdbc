package com.sansoft.demodaojdbc.model.entities;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Department implements Serializable {
    @Serial private static final long serialVersionUID = 1L;
    private Integer id;
    @EqualsAndHashCode.Exclude private String name;
}
