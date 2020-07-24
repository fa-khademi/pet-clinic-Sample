package com.irisaco.petclinicsample.repositories;

import com.irisaco.petclinicsample.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType , Long> {
}
