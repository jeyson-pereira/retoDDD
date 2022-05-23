package co.com.sofka.administracioninventarios.administradorgeneral.commands;

import co.com.sofka.administracioninventarios.administradorgeneral.Usuario;
import co.com.sofka.administracioninventarios.administradorgeneral.values.usuario.UsuarioId;
import co.com.sofka.domain.generic.Command;

public class AgregarUsuario extends Command {
    private final UsuarioId usuarioId;
    private final Usuario usuario;

    public AgregarUsuario(UsuarioId usuarioId, Usuario usuario) {
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
