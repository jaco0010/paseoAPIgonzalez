package com.example.paseoAPIgonzalez.servicios;

import com.example.paseoAPIgonzalez.Repositorios.IRepositorioEspacio;
import com.example.paseoAPIgonzalez.modelos.Espacio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EspacioServicio {
    @Autowired
    private IRepositorioEspacio repositorioEspacio;

    public Boolean guardarEspacioEnBD(Espacio datos){return false;}

    public Boolean modificarEspacioEnBD(Espacio datos, UUID id){return false;}

    public Boolean eliminarEspacioEnBD(UUID id){return false;}

    public Boolean buscarEspacioEnBD(){return false;}
}
