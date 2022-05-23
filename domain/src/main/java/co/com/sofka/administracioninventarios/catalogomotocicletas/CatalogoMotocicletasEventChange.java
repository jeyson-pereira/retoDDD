package co.com.sofka.administracioninventarios.catalogomotocicletas;

import co.com.sofka.administracioninventarios.catalogomotocicletas.events.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashMap;

public class CatalogoMotocicletasEventChange extends EventChange {
    public CatalogoMotocicletasEventChange(CatalogoMotocicletas catalogoMotocicletas) {

        apply((CatalogoMotocicletasCreado event)->{
            catalogoMotocicletas.tipoCatalogo = event.getTipoCatalogo();
            catalogoMotocicletas.motocicletasProveedor = new HashMap<>();
            catalogoMotocicletas.motocicletasLocal = new HashMap<>();
            catalogoMotocicletas.motocicletasUsadas = new HashMap<>();
        });

        apply((MotocicletaProveedorAgregada event)->{
            var motocicletaId = event.getMotocicletaId();
            var motocicleta = event.getMotocicleta();
            catalogoMotocicletas.motocicletasProveedor.put(motocicletaId,motocicleta);
        });

        apply((MotocicletaLocalAgregada event)->{
            var motocicletaId = event.getMotocicletaId();
            var motocicleta = event.getMotocicleta();
            catalogoMotocicletas.motocicletasLocal.put(motocicletaId,motocicleta);
        });

        apply((MotocicletaUsadaAgregada event)->{
            var motocicletaId = event.getMotocicletaId();
            var motocicleta = event.getMotocicleta();
            catalogoMotocicletas.motocicletasUsadas.put(motocicletaId,motocicleta);
        });

        apply((MotocicletaProveedorEliminada event) -> {
            var motocicletaId = event.getMotocicletaId();
            catalogoMotocicletas.motocicletasProveedor.remove(motocicletaId);
        });

        apply((MotocicletaLocalEliminada event) -> {
            var motocicletaId = event.getMotocicletaId();
            catalogoMotocicletas.motocicletasLocal.remove(motocicletaId);
        });

        apply((MotocicletaUsadaEliminada event) -> {
            var motocicletaId = event.getMotocicletaId();
            catalogoMotocicletas.motocicletasUsadas.remove(motocicletaId);
        });
    }
}
