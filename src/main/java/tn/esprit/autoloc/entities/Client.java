package tn.esprit.autoloc.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;


@Entity
@Table(name = "client")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idClient;
     String nom;
     String prenom;

    @Column(unique = true)
     String email;
     String telephone;
     String numPermis;
     LocalDate dateInscription;

    @OneToMany(mappedBy = "client")
    Set<Reservation> reservations ;
}
