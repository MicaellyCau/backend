package br.edu.ifba.demo.backend.api.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.edu.ifba.demo.backend.api.model.*;
@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
}