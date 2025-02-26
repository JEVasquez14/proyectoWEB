package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "pasaportes")
@NoArgsConstructor
@AllArgsConstructor
public class Pasaporte {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String numero;

    @OneToOne(mappedBy = "pasaporte")
    private Pasajero pasajero;

}
