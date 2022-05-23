package co.com.sofka.administracioninventarios.administradorgeneral.events;

import co.com.sofka.administracioninventarios.administradorgeneral.Direccion;
import co.com.sofka.administracioninventarios.administradorgeneral.Usuario;
import co.com.sofka.domain.generic.DomainEvent;

public class AdministradorGeneralCreado extends DomainEvent {
    private final Direccion direccion;
    public AdministradorGeneralCreado(Direccion direccion) {
        super("co.com.sofka.administracioninventarios.AdministradorGeneralCreado");
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
