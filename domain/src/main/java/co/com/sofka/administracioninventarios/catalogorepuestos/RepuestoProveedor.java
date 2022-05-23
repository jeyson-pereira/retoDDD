package co.com.sofka.administracioninventarios.catalogorepuestos;

import co.com.sofka.administracioninventarios.catalogorepuestos.values.Repuesto;
import co.com.sofka.administracioninventarios.catalogorepuestos.values.RepuestoProveedorId;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.generic.values.Referencia;

public class RepuestoProveedor extends Entity<RepuestoProveedorId> {
    protected Referencia referencia;
    protected Repuesto repuesto;

    public RepuestoProveedor(RepuestoProveedorId entityId) {
        super(entityId);
    }

    public RepuestoProveedor(RepuestoProveedorId entityId, Referencia referencia) {
        super(entityId);
        this.referencia = referencia;
    }

    public Referencia referencia() {
        return referencia;
    }

    public Repuesto repuesto() {
        return repuesto;
    }
}
