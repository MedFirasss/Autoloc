package tn.esprit.autoloc.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.autoloc.entities.enums.CategorieVehicule;
import tn.esprit.autoloc.entities.enums.StatutVehicule;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "vehicule")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idVehicule;
    @Column(unique = true,nullable = false)
    String immatriculation;
    String marque;
    String modele;

    @Enumerated(EnumType.STRING)
    CategorieVehicule categorie;
    BigDecimal tarifjournalier;

    @Enumerated(EnumType.STRING)
    StatutVehicule statut;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "agence_id")
    Agence agence;

    @OneToMany(mappedBy = "vehicule")
    Set<Maintenance> maintenances ;

    @OneToMany(mappedBy = "vehicule")
    Set<Equipement> equipements ;

    @OneToMany(mappedBy = "vehicule")
    Set<Reservation> reservations ;






}
