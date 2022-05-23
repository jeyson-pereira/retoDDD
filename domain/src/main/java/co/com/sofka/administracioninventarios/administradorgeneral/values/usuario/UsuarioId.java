package co.com.sofka.administracioninventarios.administradorgeneral.values.usuario;

import co.com.sofka.domain.generic.Identity;

public class UsuarioId extends Identity {
    public UsuarioId() {
    }

    public UsuarioId(String id) {
        super(id);
    }

    public static UsuarioId of(String id) {
        return new UsuarioId(id);
    }
}
