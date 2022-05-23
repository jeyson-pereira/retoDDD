package co.com.sofka.administracioninventarios.administradorgeneral;

import co.com.sofka.administracioninventarios.administradorgeneral.values.usuario.Apellidos;
import co.com.sofka.administracioninventarios.administradorgeneral.values.usuario.Nombres;
import co.com.sofka.administracioninventarios.administradorgeneral.values.usuario.UsuarioId;
import co.com.sofka.domain.generic.Entity;

public class Usuario extends Entity<UsuarioId> {
    protected Nombres nombres;
    protected Apellidos apellidos;

    public Usuario(UsuarioId entityId, Nombres nombres, Apellidos apellidos) {
        super(entityId);
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
}
