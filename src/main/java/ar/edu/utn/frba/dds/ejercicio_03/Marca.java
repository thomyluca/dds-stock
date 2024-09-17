package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Marca extends EntidadPersistente {

    @Column(name = "nombre")
    private String nombre;
}
