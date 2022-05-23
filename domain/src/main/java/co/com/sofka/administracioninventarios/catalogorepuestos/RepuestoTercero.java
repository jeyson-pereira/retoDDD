package co.com.sofka.administracioninventarios.catalogorepuestos;

import co.com.sofka.administracioninventarios.catalogorepuestos.values.Repuesto;
import co.com.sofka.administracioninventarios.catalogorepuestos.values.RepuestoTerceroId;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.generic.values.Referencia;

public class RepuestoTercero extends Entity<RepuestoTerceroId> {
    protected Referencia referencia;
    protected Repuesto repuesto;

    public RepuestoTercero(RepuestoTerceroId entityId) {
        super(entityId);
    }

    public RepuestoTercero(RepuestoTerceroId entityId, Referencia referencia) {
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
