package com.example.CastraMovelCivap.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.CastraMovelCivap.model.Animal;


public interface AnimalRepository extends JpaRepository<Animal, Long>{

	List<Animal> findByProprietarioId(Long id);

	List<Animal> findByProprietarioBairro(String bairro);

	List<Animal> findByProprietarioCidadeId(Long id);

}
