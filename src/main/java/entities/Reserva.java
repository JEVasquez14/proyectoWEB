package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "reservas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @Column(nullable = false)
    private UUID CodigoReserva;

    @ManyToOne
    @JoinColumn(name = "pasajero_id", referencedColumnName = "id")
    private Pasajero pasajero;

    @ManyToOne
    @JoinColumn(name = "vuelo_id", referencedColumnName = "id")
    private Vuelo vuelo;



}
