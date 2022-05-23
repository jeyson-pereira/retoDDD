package co.com.sofka.administracioninventarios.catalogorepuestos.commands;

import co.com.sofka.administracioninventarios.catalogorepuestos.RepuestoTercero;
import co.com.sofka.generic.values.CatalogoRepuestosId;
import co.com.sofka.administracioninventarios.catalogorepuestos.values.RepuestoTerceroId;
import co.com.sofka.domain.generic.Command;

public class AgregarRepuestoTercero extends Command {
    private final CatalogoRepuestosId catalogoRepuestosId;
    private final RepuestoTerceroId repuestoId;
    private final RepuestoTercero repuesto;

    public AgregarRepuestoTercero(CatalogoRepuestosId catalogoRepuestosId, RepuestoTerceroId repuestoId, RepuestoTercero repuesto) {
        this.catalogoRepuestosId = catalogoRepuestosId;
        this.repuestoId = repuestoId;
        this.repuesto = repuesto;
    }

    public CatalogoRepuestosId getCatalogoRepuestosId() {
        return catalogoRepuestosId;
    }

    public RepuestoTerceroId getRepuestoId() {
        return repuestoId;
    }

    public RepuestoTercero getRepuesto() {
        return repuesto;
    }
}
