package com.ApiRest.SkillChallengeApiRest.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "vendedor")
@Data
@NoArgsConstructor
public class Vendedor {
    @Id
    @Column(name = "id")
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idVendedor;
    @Column
    @NotEmpty(message = "El nombre no puede estar en blanco")
    private String nombre;
    @Column
    @NotEmpty(message = "El correo no puede estar en blanco")
    private String email;
    @Column
    @NotEmpty(message = "La contraseña no puede estar en blanco")
    private String contrasenia;
    @Column
    private int estatus;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "vendedor_id")
    private List<Producto> productos;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "vendedor_id")
    private List<PerfilTienda> perfilTiendas;
}
