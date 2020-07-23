package com.irisaco.petclinicsample.repositories;

import com.irisaco.petclinicsample.model.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialityRepository extends JpaRepository<Speciality , Long> {
}
