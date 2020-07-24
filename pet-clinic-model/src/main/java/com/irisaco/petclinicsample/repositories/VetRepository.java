package com.irisaco.petclinicsample.repositories;

import com.irisaco.petclinicsample.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
