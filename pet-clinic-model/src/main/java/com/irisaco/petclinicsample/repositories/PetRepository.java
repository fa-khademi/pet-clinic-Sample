package com.irisaco.petclinicsample.repositories;

import com.irisaco.petclinicsample.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet ,Long> {
}
