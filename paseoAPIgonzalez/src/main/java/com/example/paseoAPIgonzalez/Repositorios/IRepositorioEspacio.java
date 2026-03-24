package com.example.paseoAPIgonzalez.Repositorios;

import com.example.paseoAPIgonzalez.modelos.Espacio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IRepositorioEspacio extends JpaRepository<Espacio, UUID> {

}
