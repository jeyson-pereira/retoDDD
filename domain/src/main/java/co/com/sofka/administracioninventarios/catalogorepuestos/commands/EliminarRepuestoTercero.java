package co.com.sofka.administracioninventarios.catalogorepuestos.commands;

import co.com.sofka.generic.values.CatalogoRepuestosId;
import co.com.sofka.administracioninventarios.catalogorepuestos.values.RepuestoTerceroId;
import co.com.sofka.domain.generic.Command;

public class EliminarRepuestoTercero extends Command {
    private final CatalogoRepuestosId catalogoRepuestosId;
    private final RepuestoTerceroId repuestoId;

    public EliminarRepuestoTercero(CatalogoRepuestosId catalogoRepuestosId, RepuestoTerceroId repuestoId) {
        this.catalogoRepuestosId = catalogoRepuestosId;
        this.repuestoId = repuestoId;
    }

    public CatalogoRepuestosId getCatalogoRepuestosId() {
        return catalogoRepuestosId;
    }

    public RepuestoTerceroId getRepuestoId() {
        return repuestoId;
    }
}
