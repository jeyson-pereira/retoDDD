package co.com.sofka.administracioninventarios.catalogorepuestos;

import co.com.sofka.administracioninventarios.catalogorepuestos.events.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashMap;

public class CatalogoRepuestosEventChange extends EventChange {
    public CatalogoRepuestosEventChange(CatalogoRepuestos catalogoRepuestos) {
        //Crear catalogo
        apply((CatalogoRepuestosCreado event)->{
            catalogoRepuestos.categoriaCatalogo = event.getCategoriaCatalogo();
            catalogoRepuestos.repuestosProveedor = new HashMap<>();
            catalogoRepuestos.repuestosLocal = new HashMap<>();
            catalogoRepuestos.repuestosTercero = new HashMap<>();
        });

        //Agregar repuestos a catalogo
        apply((RepuestoProveedorAgregado event)->{
            var repuestoId = event.getRepuestoId();
            var repuesto = event.getRepuesto();
            catalogoRepuestos.repuestosProveedor.put(repuestoId,repuesto);
        });

        apply((RepuestoLocalAgregado event)->{
            var repuestoId = event.getRepuestoId();
            var repuesto = event.getRepuesto();
            catalogoRepuestos.repuestosLocal.put(repuestoId,repuesto);
        });

        apply((RepuestoTerceroAgregado event)->{
            var repuestoId = event.getRepuestoId();
            var repuesto = event.getRepuesto();
            catalogoRepuestos.repuestosTercero.put(repuestoId,repuesto);
        });

        //Eliminar repuesto de catalogo
        apply((RepuestoProveedorEliminado event) -> {
            var repuestoId = event.getRepuestoId();
            catalogoRepuestos.repuestosProveedor.remove(repuestoId);
        });

        apply((RepuestoLocalEliminado event) -> {
            var repuestoId = event.getRepuestoId();
            catalogoRepuestos.repuestosLocal.remove(repuestoId);
        });

        apply((RepuestoTerceroEliminado event) -> {
            var repuestoId = event.getRepuestoId();
            catalogoRepuestos.repuestosTercero.remove(repuestoId);
        });
    }
}
