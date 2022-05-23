package co.com.sofka.administracioninventarios.catalogorepuestos.commands;

import co.com.sofka.administracioninventarios.catalogorepuestos.RepuestoLocal;
import co.com.sofka.generic.values.CatalogoRepuestosId;
import co.com.sofka.administracioninventarios.catalogorepuestos.values.RepuestoLocalId;
import co.com.sofka.domain.generic.Command;

public class AgregarRepuestoLocal extends Command {
    private final CatalogoRepuestosId catalogoRepuestosId;
    private final RepuestoLocalId repuestoId;
    private final RepuestoLocal repuesto;

    public AgregarRepuestoLocal(CatalogoRepuestosId catalogoRepuestosId, RepuestoLocalId repuestoId, RepuestoLocal repuesto) {
        this.catalogoRepuestosId = catalogoRepuestosId;
        this.repuestoId = repuestoId;
        this.repuesto = repuesto;
    }

    public CatalogoRepuestosId getCatalogoRepuestosId() {
        return catalogoRepuestosId;
    }

    public RepuestoLocalId getRepuestoId() {
        return repuestoId;
    }

    public RepuestoLocal getRepuesto() {
        return repuesto;
    }
}
