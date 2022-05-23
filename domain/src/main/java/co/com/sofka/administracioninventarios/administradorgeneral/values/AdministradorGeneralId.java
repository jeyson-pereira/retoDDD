package co.com.sofka.administracioninventarios.administradorgeneral.values;

import co.com.sofka.domain.generic.Identity;

public class AdministradorGeneralId extends Identity {
    public AdministradorGeneralId(String id) {
        super(id);
    }

    public static AdministradorGeneralId of(String id) {
        return new AdministradorGeneralId(id);
    }
}
