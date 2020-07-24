package com.irisaco.petclinicsample.repositories;

import com.irisaco.petclinicsample.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
