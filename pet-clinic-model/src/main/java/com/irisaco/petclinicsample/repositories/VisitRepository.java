package com.irisaco.petclinicsample.repositories;

import com.irisaco.petclinicsample.model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<Visit , Long> {
}
