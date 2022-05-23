package co.com.sofka.administracioninventarios.administradorgeneral.commands;

import co.com.sofka.administracioninventarios.administradorgeneral.Direccion;
import co.com.sofka.administracioninventarios.administradorgeneral.values.AdministradorGeneralId;
import co.com.sofka.domain.generic.Command;

public class CrearAdministradorGeneral extends Command {
    private final AdministradorGeneralId administradorGeneralId;
    private final Direccion direccion;

    public CrearAdministradorGeneral(AdministradorGeneralId administradorGeneralId, Direccion direccion) {
        this.administradorGeneralId = administradorGeneralId;
        this.direccion = direccion;
    }

    public AdministradorGeneralId getAdministradorGeneralId() {
        return administradorGeneralId;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
