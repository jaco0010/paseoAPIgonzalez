package com.example.paseoAPIgonzalez.servicios;

import com.example.paseoAPIgonzalez.Repositorios.IRepositorioReserva;
import com.example.paseoAPIgonzalez.modelos.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ReservaServicio {
    @Autowired
    private IRepositorioReserva repositorioReserva;

    public Boolean guardarReservaEnBD(Reserva datos){return false;}

    public Boolean modificarReservaEnBD(Reserva datos, UUID id){return false;}

    public Boolean eliminarReservaEnBD(UUID id){return false;}

    public Boolean buscarReservaEnBD(){return false;}
}
