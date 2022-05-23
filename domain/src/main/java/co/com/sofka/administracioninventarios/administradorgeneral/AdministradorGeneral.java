package co.com.sofka.administracioninventarios.administradorgeneral;

import co.com.sofka.administracioninventarios.administradorgeneral.events.AdministradorGeneralCreado;
import co.com.sofka.administracioninventarios.administradorgeneral.events.CatalogoMotocicletasAgregado;
import co.com.sofka.administracioninventarios.administradorgeneral.events.CatalogoRepuestosAgregado;
import co.com.sofka.administracioninventarios.administradorgeneral.events.UsuarioAgregado;
import co.com.sofka.administracioninventarios.administradorgeneral.values.AdministradorGeneralId;
import co.com.sofka.administracioninventarios.administradorgeneral.values.usuario.UsuarioId;
import co.com.sofka.generic.values.CatalogoMotocicletasId;
import co.com.sofka.generic.values.CatalogoRepuestosId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class AdministradorGeneral extends AggregateEvent<AdministradorGeneralId> {
    protected Map<UsuarioId,Usuario> usuarios;
    protected Set<CatalogoMotocicletasId> catalogosMotocicletas;
    protected Set<CatalogoRepuestosId> catalogosRepuestos;
    protected Direccion direccion;

    public AdministradorGeneral(AdministradorGeneralId entityId, Direccion direccion) {
        super(entityId);
        appendChange(new AdministradorGeneralCreado(direccion)).apply();
        subscribe(new AdministradorGeneralEventChange(this));
    }

    public AdministradorGeneral(AdministradorGeneralId entityId) {
        super(entityId);
        subscribe(new AdministradorGeneralEventChange(this));
    }

    public static AdministradorGeneral from(AdministradorGeneralId entityId, List<DomainEvent> events){
        var administradorGeneral = new AdministradorGeneral(entityId);
        events.forEach(administradorGeneral::applyEvent);
        return administradorGeneral;
    }

    public Map<UsuarioId, Usuario> Usuarios() {
        return usuarios;
    }

    public Direccion Direccion() {
        return direccion;
    }

    public void agregarUsuario(Usuario usuario){
        var usuarioId = new UsuarioId();
        appendChange(new UsuarioAgregado(usuarioId, usuario)).apply();
    }

    public void agregarCatalogoMotocicletas(CatalogoMotocicletasId catalogoId){
        appendChange(new CatalogoMotocicletasAgregado(catalogoId)).apply();
    }

    public void agregarCatalogoRepuestos(CatalogoRepuestosId catalogoId){
        appendChange(new CatalogoRepuestosAgregado(catalogoId)).apply();
    }
}
