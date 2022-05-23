package co.com.sofka.administracioninventarios.catalogorepuestos.commands;


import co.com.sofka.generic.values.CatalogoRepuestosId;
import co.com.sofka.administracioninventarios.catalogorepuestos.values.RepuestoProveedorId;
import co.com.sofka.domain.generic.Command;

public class EliminarRepuestoProveedor extends Command {
    private final CatalogoRepuestosId catalogoRepuestosId;
    private final RepuestoProveedorId repuestoId;

    public EliminarRepuestoProveedor(CatalogoRepuestosId catalogoRepuestosId, RepuestoProveedorId repuestoId) {
        this.catalogoRepuestosId = catalogoRepuestosId;
        this.repuestoId = repuestoId;
    }

    public CatalogoRepuestosId getCatalogoRepuestosId() {
        return catalogoRepuestosId;
    }

    public RepuestoProveedorId getRepuestoId() {
        return repuestoId;
    }
}
