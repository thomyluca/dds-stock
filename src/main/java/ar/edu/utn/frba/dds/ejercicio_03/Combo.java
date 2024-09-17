package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@DiscriminatorValue(value = "combo")
public class Combo extends Producto {

  @ManyToMany()
  @JoinTable(name = "producto_x_combo",
  joinColumns = @JoinColumn(name = "combo_id", referencedColumnName = "id"),
          inverseJoinColumns = @JoinColumn(name = "producto_id", referencedColumnName = "id")
  )
  private List<Producto> productos;

  // ponele
  @Column(name = "precio")
  private Double precio;

  public Combo(){
      this.productos = new ArrayList<Producto>();
  }

  public void agregarProducto(Producto producto){
    this.productos.add(producto);
  }

  public Double precio(){
    return this.productos.stream().mapToDouble(p-> p.precio()).sum();
  }
}
