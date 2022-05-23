package co.com.sofka.administracioninventarios.administradorgeneral.events;

import co.com.sofka.administracioninventarios.administradorgeneral.Usuario;
import co.com.sofka.administracioninventarios.administradorgeneral.values.usuario.UsuarioId;
import co.com.sofka.domain.generic.DomainEvent;

public class UsuarioAgregado extends DomainEvent {
    private final UsuarioId usuarioId;
    private final Usuario usuario;

    public UsuarioAgregado(UsuarioId usuarioId, Usuario usuario) {
        super("co.com.sofka.administracioninventarios.UsuarioAgregado");
        this.usuarioId = usuarioId;
        this.usuario = usuario;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
