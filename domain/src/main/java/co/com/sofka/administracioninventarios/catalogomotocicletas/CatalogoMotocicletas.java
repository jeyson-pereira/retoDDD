package co.com.sofka.administracioninventarios.catalogomotocicletas;

import co.com.sofka.administracioninventarios.catalogomotocicletas.events.*;
import co.com.sofka.generic.values.CatalogoMotocicletasId;
import co.com.sofka.administracioninventarios.catalogomotocicletas.values.MotocicletaLocalId;
import co.com.sofka.administracioninventarios.catalogomotocicletas.values.MotocicletaProveedorId;
import co.com.sofka.administracioninventarios.catalogomotocicletas.values.MotocicletaUsadaId;
import co.com.sofka.administracioninventarios.catalogomotocicletas.values.TipoCatalogo;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Map;

public class CatalogoMotocicletas extends AggregateEvent<CatalogoMotocicletasId> {

    protected Map<MotocicletaProveedorId, MotocicletaProveedor> motocicletasProveedor;
    protected Map<MotocicletaLocalId, MotocicletaLocal> motocicletasLocal;
    protected Map<MotocicletaUsadaId, MotocicletaUsada> motocicletasUsadas;
    protected TipoCatalogo tipoCatalogo;

    public CatalogoMotocicletas(CatalogoMotocicletasId entityId, TipoCatalogo tipoCatalogo) {
        super(entityId);
        appendChange(new CatalogoMotocicletasCreado(tipoCatalogo)).apply();
        subscribe(new CatalogoMotocicletasEventChange(this));
    }

    public CatalogoMotocicletas(CatalogoMotocicletasId entityId) {
        super(entityId);
        subscribe(new CatalogoMotocicletasEventChange(this));
    }


    public static CatalogoMotocicletas from(CatalogoMotocicletasId entityId, List<DomainEvent> events){
        var catalogoMotocicletas = new CatalogoMotocicletas(entityId);
        events.forEach(catalogoMotocicletas::applyEvent);
        return catalogoMotocicletas;
    }

    public void agregarMotocicletaProveedor(MotocicletaProveedor motocicleta){
        var motocicletaProveedorId = new MotocicletaProveedorId();
        appendChange(new MotocicletaProveedorAgregada(motocicletaProveedorId, motocicleta)).apply();
    }

    public void agregarMotocicletaLocal(MotocicletaLocal motocicleta){
        var motocicletaLocalId = new MotocicletaLocalId();
        appendChange(new MotocicletaLocalAgregada(motocicletaLocalId, motocicleta)).apply();
    }

    public void agregarMotocicletaUsada(MotocicletaUsada motocicleta){
        var motocicletaUsadaId = new MotocicletaUsadaId();
        appendChange(new MotocicletaUsadaAgregada(motocicletaUsadaId, motocicleta)).apply();
    }

    public void eliminarMotocicletaProveedor(MotocicletaProveedorId motocicletaId){
        appendChange(new MotocicletaProveedorEliminada(motocicletaId)).apply();
    }

    public void eliminarMotocicletaLocal(MotocicletaLocalId motocicletaId){
        appendChange(new MotocicletaLocalEliminada(motocicletaId)).apply();
    }

    public void eliminarMotocicletaLocal(MotocicletaUsadaId motocicletaId){
        appendChange(new MotocicletaUsadaEliminada(motocicletaId)).apply();
    }
}
