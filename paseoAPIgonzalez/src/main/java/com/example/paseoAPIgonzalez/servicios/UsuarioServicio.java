package com.example.paseoAPIgonzalez.servicios;

import com.example.paseoAPIgonzalez.Repositorios.IRepositorioUsuario;
import com.example.paseoAPIgonzalez.modelos.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.UUID;

@Service
public class UsuarioServicio {

    //Inyectando una dependencia al repositorioUsuario
    @Autowired
    private IRepositorioUsuario repositorioUsuario;

    public Boolean guardarUsuarioEnBD (Usuario datos){

        //condiciones logicas para validar datos a guardar

        //1. validar que correo a registrar no se haya guardado previamente

        if (repositorioUsuario.findByCorreo(datos.getCorreo()).isPresent()) {

            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "Ya existe un correo registrado igual al que me entregas"
            );

        }

        return false;
    }

    public Boolean modificarUsuarioEnBD(Usuario datos, UUID id){
        //validar que datos me envian y si estos cumplen las reglas del negocio
        //Modificar los datos EnBD con ayuda del repositorio
        return false;
    }

    public Boolean eliminarUsuarioEnBD(UUID id){
        //buscar y validar si el ID que me envian existe
        //Elimino el registro en BD
        return false;
    }

    public Boolean buscarUsuariosEnBD(){
        //***Dependiendo del parametro de busqueda debo implementar validaciones
        //Devuelvo los usuarios o su usuario que encuentre en BD
        return false;
    }
}
