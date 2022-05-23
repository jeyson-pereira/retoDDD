package co.com.sofka.administracioninventarios.catalogorepuestos.commands;


import co.com.sofka.administracioninventarios.catalogorepuestos.RepuestoProveedor;
import co.com.sofka.generic.values.CatalogoRepuestosId;
import co.com.sofka.administracioninventarios.catalogorepuestos.values.RepuestoProveedorId;
import co.com.sofka.domain.generic.Command;

public class AgregarRepuestoProveedor extends Command {
    private final CatalogoRepuestosId catalogoRepuestosId;
    private final RepuestoProveedorId repuestoId;
    private final RepuestoProveedor repuesto;

    public AgregarRepuestoProveedor(CatalogoRepuestosId catalogoRepuestosId, RepuestoProveedorId repuestoId, RepuestoProveedor repuesto) {
        this.catalogoRepuestosId = catalogoRepuestosId;
        this.repuestoId = repuestoId;
        this.repuesto = repuesto;
    }

    public CatalogoRepuestosId getCatalogoRepuestosId() {
        return catalogoRepuestosId;
    }

    public RepuestoProveedorId getRepuestoId() {
        return repuestoId;
    }

    public RepuestoProveedor getRepuesto() {
        return repuesto;
    }
}
