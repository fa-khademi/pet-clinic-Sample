package com.irisaco.petclinicsample.repositories;

import com.irisaco.petclinicsample.model.Vet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VetRepository extends JpaRepository<Vet, Long> {
}
