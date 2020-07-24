package com.irisaco.petclinicsample.repositories;

import com.irisaco.petclinicsample.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit , Long> {
}
