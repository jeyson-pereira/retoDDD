package co.com.sofka.administracioninventarios.catalogorepuestos;

import co.com.sofka.administracioninventarios.catalogorepuestos.events.*;
import co.com.sofka.administracioninventarios.catalogorepuestos.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.CatalogoRepuestosId;

import java.util.List;
import java.util.Map;

public class CatalogoRepuestos extends AggregateEvent<CatalogoRepuestosId> {
    protected CategoriaRepuestos categoriaCatalogo;
    protected Map<RepuestoProveedorId, RepuestoProveedor> repuestosProveedor;
    protected Map<RepuestoLocalId, RepuestoLocal> repuestosLocal;
    protected Map<RepuestoTerceroId, RepuestoTercero> repuestosTercero;

    public CatalogoRepuestos(CatalogoRepuestosId entityId, CategoriaRepuestos categoriaCatalogo) {
        super(entityId);
        appendChange(new CatalogoRepuestosCreado(categoriaCatalogo)).apply();
        subscribe(new CatalogoRepuestosEventChange(this));
    }

    public CatalogoRepuestos(CatalogoRepuestosId entityId) {
        super(entityId);
        subscribe(new CatalogoRepuestosEventChange(this));
    }

    public static CatalogoRepuestos from(CatalogoRepuestosId entityId, List<DomainEvent> events){
        var catalogoRepuestos = new CatalogoRepuestos(entityId);
        events.forEach(catalogoRepuestos::applyEvent);
        return catalogoRepuestos;
    }

    public void agregarRepuestoProveedor(RepuestoProveedor repuesto){
        var repuestoProveedorId = new RepuestoProveedorId();
        appendChange(new RepuestoProveedorAgregado(repuestoProveedorId, repuesto)).apply();
    }

    public void agregarRepuestoLocal(RepuestoLocal repuesto){
        var repuestoLocalId = new RepuestoLocalId();
        appendChange(new RepuestoLocalAgregado(repuestoLocalId, repuesto)).apply();
    }

    public void agregarRepuestoTercero(RepuestoTercero repuesto){
        var repuestoTerceroId = new RepuestoTerceroId();
        appendChange(new RepuestoTerceroAgregado(repuestoTerceroId, repuesto)).apply();
    }

    public void eliminarRepuestoProveedor(RepuestoProveedorId repuestoId){
        appendChange(new RepuestoProveedorEliminado(repuestoId)).apply();
    }

    public void eliminarRepuestoLocal(RepuestoLocalId repuestoId){
        appendChange(new RepuestoLocalEliminado(repuestoId)).apply();
    }

    public void eliminarRepuestoTercero(RepuestoTerceroId repuestoId){
        appendChange(new RepuestoTerceroEliminado(repuestoId)).apply();
    }
}
