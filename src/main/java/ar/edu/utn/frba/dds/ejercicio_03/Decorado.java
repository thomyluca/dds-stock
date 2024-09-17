package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_decorado")
public abstract class Decorado extends EntidadPersistente {

  @ManyToOne()
  @JoinColumn(name = "producto_id", referencedColumnName = "id")
  protected Producto producto;

  public Double precio() {
    return this.producto.precio();
  }


}
