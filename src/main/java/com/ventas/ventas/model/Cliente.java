package com.ventas.ventas.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;

    @NotNull
    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 3, max = 70, message = "El nombre debe ser mayor a 3 caracteres / menor a 70")
    @Column(name = "nombres", nullable = false, length = 70)
    private String nombres;

    @NotNull
    @NotBlank(message = "El Apellido es obligatorio")
    @Size(min = 3, max = 70, message = "El Apellido debe ser mayor a 3 caracteres / menor a 70")
    @Column(name = "apellidos", nullable = false, length = 70)
    private String apellidos;

    @Column(name = "direccion", nullable = false, length = 70)
    private String direccion;

    @Column(name = "telefono", nullable = false, length = 70)
    private String telefono;

    @NotNull
    @NotBlank(message = "El email es obligatorio")
    @Size(min = 3, message = "El email debe ser de al menos 3 caracteres ")
    @Email(message = "El email enviado no tiene un formato valido")
    @Column(name = "email", nullable = false, length = 70)
    private String email;
}
