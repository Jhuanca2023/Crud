package edu.pe.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.pe.cibertec.model.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
