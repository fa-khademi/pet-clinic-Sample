package com.irisaco.petclinicsample.repositories;

import com.irisaco.petclinicsample.model.PetType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetTypeRepository extends JpaRepository<PetType , Long> {
}
