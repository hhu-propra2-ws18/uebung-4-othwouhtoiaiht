package de.hhu.propra.db.entities;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data // Lombok - Generiert Getter, Setter, toString, ...
@Entity
public class Kunde {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String stadt;
    private Integer plz;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn
    List<Auto> autos;
}
