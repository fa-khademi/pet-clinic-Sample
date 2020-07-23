package com.irisaco.petclinicsample.repositories;

import com.irisaco.petclinicsample.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
