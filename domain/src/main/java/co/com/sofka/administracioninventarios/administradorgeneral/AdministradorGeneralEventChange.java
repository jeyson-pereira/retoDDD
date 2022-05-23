package co.com.sofka.administracioninventarios.administradorgeneral;

import co.com.sofka.administracioninventarios.administradorgeneral.events.AdministradorGeneralCreado;
import co.com.sofka.administracioninventarios.administradorgeneral.events.CatalogoMotocicletasAgregado;
import co.com.sofka.administracioninventarios.administradorgeneral.events.CatalogoRepuestosAgregado;
import co.com.sofka.administracioninventarios.administradorgeneral.events.UsuarioAgregado;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashMap;

public class AdministradorGeneralEventChange extends EventChange {
    public AdministradorGeneralEventChange(AdministradorGeneral administradorGeneral) {
        apply((AdministradorGeneralCreado event) -> {
            administradorGeneral.usuarios = new HashMap<>();
            administradorGeneral.direccion = event.getDireccion();
        });

        apply((UsuarioAgregado event) -> {
            var usuarioId = event.getUsuarioId();
            var usuario = new Usuario(usuarioId, event.getUsuario().nombres,event.getUsuario().apellidos);
            administradorGeneral.usuarios.put(usuarioId, usuario);
        });

        apply((CatalogoMotocicletasAgregado event) -> {
            var catalogoId = event.getCatalogoMotocicletasId();
            administradorGeneral.catalogosMotocicletas.add(catalogoId);
        });

        apply((CatalogoRepuestosAgregado event) -> {
            var catalogoId = event.getCatalogoRepuestosId();
            administradorGeneral.catalogosRepuestos.add(catalogoId);
        });
    }
}
