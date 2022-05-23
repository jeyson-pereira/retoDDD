package co.com.sofka.administracioninventarios.catalogorepuestos.commands;

import co.com.sofka.generic.values.CatalogoRepuestosId;
import co.com.sofka.administracioninventarios.catalogorepuestos.values.RepuestoLocalId;
import co.com.sofka.domain.generic.Command;

public class EliminarRepuestoLocal extends Command {
    private final CatalogoRepuestosId catalogoRepuestosId;
    private final RepuestoLocalId repuestoId;

    public EliminarRepuestoLocal(CatalogoRepuestosId catalogoRepuestosId, RepuestoLocalId repuestoId) {
        this.catalogoRepuestosId = catalogoRepuestosId;
        this.repuestoId = repuestoId;
    }

    public CatalogoRepuestosId getCatalogoRepuestosId() {
        return catalogoRepuestosId;
    }

    public RepuestoLocalId getRepuestoId() {
        return repuestoId;
    }
}
