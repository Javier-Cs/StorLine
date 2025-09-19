package com.example.StorLine.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "product_tbl", schema = "stor")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "price", nullable = false, precision = 18, scale = 2)
    private BigDecimal price;

    @Column(name = "code", nullable = false, length = 200)
    private String code;

    @Column(name = "stock", nullable = false)
    private Integer stock;

    @Column(name = "estado")
    private boolean estado;

    @Column(name = "fech_actu", nullable = false)
    private Date fechaActual;

    @Column(name = "aviso", nullable = false, length = 20)
    private String aviso;


}
