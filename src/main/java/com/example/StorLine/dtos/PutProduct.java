package com.example.StorLine.dtos;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public class PutProduct {
//    @NotBlank(message = "El campo no puede ser nulo o vacio ")
//    @Size(min = 3, max = 30, message = "El nombre debe tener entre 3 y 30 caracteres.")
//    private String name;

    @NotNull(message = "El precio no puede ser nulo")
    @DecimalMin(value = "0.01", message = "El precio debe ser mayor a 0 ")
    private BigDecimal price;

    @NotNull(message = "El stock no puede ser nulo")
    @Min(value = 1, message = "el valor de stock debe ser positivo")
    private Integer stock;

    @NotNull(message = "El campo no puede ser nulo")
    private boolean estado;

//    @NotNull(message = "la fech")
//    private Date date;
}
