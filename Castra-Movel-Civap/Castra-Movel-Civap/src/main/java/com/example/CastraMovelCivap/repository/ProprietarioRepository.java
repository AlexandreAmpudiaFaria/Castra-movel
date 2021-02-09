package com.example.CastraMovelCivap.repository;





import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CastraMovelCivap.model.Proprietario;

@Repository
public interface ProprietarioRepository extends JpaRepository<Proprietario, Long>{

	List<Proprietario> findByCidade(Long cidade);


}
