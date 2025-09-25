package com.example.StorLine.dtos;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class GetProduct {
    private String name;

    private BigDecimal price;

    private Integer stock;

//    @NotNull(message = "El campo no puede ser nulo")
//    private boolean estado;
//
//    @NotNull(message = "la fech")
//    private Date date;
}
