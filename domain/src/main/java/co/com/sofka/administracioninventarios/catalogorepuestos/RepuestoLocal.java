package co.com.sofka.administracioninventarios.catalogorepuestos;

import co.com.sofka.administracioninventarios.catalogorepuestos.values.Repuesto;
import co.com.sofka.administracioninventarios.catalogorepuestos.values.RepuestoLocalId;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.generic.values.Referencia;

public class RepuestoLocal extends Entity<RepuestoLocalId> {
    protected Referencia referencia;
    protected Repuesto repuesto;

    public RepuestoLocal(RepuestoLocalId entityId) {
        super(entityId);
    }

    public RepuestoLocal(RepuestoLocalId entityId, Referencia referencia) {
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
