package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "vuelos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Aereolinia {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    private String nombre;

    @ManyToMany
    @JoinTable(
            name = "vuelos_aerolineas",
            joinColumns = @JoinColumn(name = "aerolinea_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "vuelo_id", referencedColumnName = "id")
    )
    private List<Vuelo> vuelos = new ArrayList<Vuelo>();
    public void addVuelo(Vuelo vuelo) {
        this.vuelos.add(vuelo);
    }

}
