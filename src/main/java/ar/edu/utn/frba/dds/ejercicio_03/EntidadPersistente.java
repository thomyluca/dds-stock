package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@MappedSuperclass
@Data
@NoArgsConstructor
public class EntidadPersistente {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "activo")
    private boolean activo = true;
}
