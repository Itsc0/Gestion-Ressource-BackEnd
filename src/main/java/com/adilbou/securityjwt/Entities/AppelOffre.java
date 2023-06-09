package com.adilbou.securityjwt.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AppelOffre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String datePub;
    private Boolean isAffected;
    @OneToMany
    private Collection<Besoin> besoins= new ArrayList<>();

    @OneToMany(mappedBy = "appelOffre" , fetch = FetchType.LAZY)
    private List<Offre> offres = new ArrayList<>();

}