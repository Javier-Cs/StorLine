package com.example.StorLine.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "client_tbl", schema = "stor")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name_lastname", nullable = false, length = 100)
    private String name;

    @Column(name = "fecha_regist", nullable = false)
    private Date fecha;

    @Column(name = "ci", nullable = false, length = 15)
    private String CI;

    @Column(name = "telefono", length = 15)
    private String telf;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Factura> facturas;


}
