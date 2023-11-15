package com.ApiRest.SkillChallengeApiRest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "comprador")
@Data
@NoArgsConstructor
public class Comprador {

    @Id
    @Column(name = "id")
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    @NotEmpty(message = "El nombre no puede estar en blanco")
    private String nombre;
    @Column
    @NotEmpty(message = "El apellido paterno no puede estar en blanco")
    private String AppPaterno;
    @Column
    @NotEmpty(message = "El apellido materno no puede estar en blanco")
    private String appMaterno;
    @Column
    private String telefono;
    @Column
    @NotEmpty(message = "El correo no puede estar en blanco")
    private String email;
    @Column
    @NotEmpty(message = "La contraseña es obligatoria")
    private String contrasenia;
    @Column
    private int estatus;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "comprador_id")
    private List<Resenia> Resenias;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "comprador_id")
    private List<Carrito> carritos;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "comprador_id")
    private List<Transaccion> transacciones;

}
