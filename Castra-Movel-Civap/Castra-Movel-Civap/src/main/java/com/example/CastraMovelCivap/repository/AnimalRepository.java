package com.example.CastraMovelCivap.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.CastraMovelCivap.model.Animal;


public interface AnimalRepository extends JpaRepository<Animal, Long>{

	List<Animal> findByTipo(Long tipos);

}
