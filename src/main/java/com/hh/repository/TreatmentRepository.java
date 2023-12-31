package com.hh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hh.entity.Patient;
import com.hh.entity.Treatment;

@Repository
public interface TreatmentRepository extends JpaRepository<Treatment, Integer> {
	List<Treatment> findByPatient(Patient patient);
}
