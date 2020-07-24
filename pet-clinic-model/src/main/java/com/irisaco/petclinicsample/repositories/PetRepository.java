package com.irisaco.petclinicsample.repositories;

import com.irisaco.petclinicsample.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet ,Long> {
}
