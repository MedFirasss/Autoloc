package tn.esprit.autoloc.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Table(name = "maintenance")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idMaintenance;
     LocalDate dateDebut;
     LocalDate dateFin;

     String description;
     @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
     @JoinColumn(name = "vehicule_id")
     Vehicule vehicule;

}
