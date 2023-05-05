package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(
        name = "patients",
        schema = "pfa",
        uniqueConstraints = {
        @UniqueConstraint(
                name = "email_unique",
                columnNames = "email"
        ),
        @UniqueConstraint(
                name = "tel_unique",
                columnNames = "telephone"
        )
}
)


public class Patient {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY

    )

   private Long Id;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String prenom;
    @Column(nullable = false)
    private String email;
    @Column(name = "telephone")
    private String tel;
    private String adresse;
    private String imageUrl;
    private LocalDate date_naissance;
    private LocalDateTime last_Update;

    public Patient(String nom,String prenom,String email){
        this.setEmail(email);
        this.setNom(nom);
        this.setPrenom(prenom);
    }

}
