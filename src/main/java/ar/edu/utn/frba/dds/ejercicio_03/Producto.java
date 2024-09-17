package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_producto")
public abstract class Producto extends EntidadPersistente {

    @Column(name = "nombre")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "marca_id", referencedColumnName = "id")
    private Marca marca;

    public Producto() {

    }

    public Double precio() {

        return 0.0;
    }

    public Integer stock() {

        return 0;
    }
}
