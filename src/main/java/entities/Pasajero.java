package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "pasajeros")
@NoArgsConstructor
@AllArgsConstructor
public class Pasajero {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String NID;

    @OneToOne(fetch = FetchType.EAGER )
    @JoinColumn(name = "pasaporte_id")
    private Pasaporte pasaporte;

    @OneToMany(mappedBy = "reserva")
    private Set<Reserva> reservas;

}
