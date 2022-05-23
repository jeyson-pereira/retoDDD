package co.com.sofka.administracioninventarios.catalogomotocicletas;

import co.com.sofka.administracioninventarios.catalogomotocicletas.values.MotocicletaUsadaId;
import co.com.sofka.administracioninventarios.catalogomotocicletas.values.motocicleta.FichaTecnica;
import co.com.sofka.administracioninventarios.catalogomotocicletas.values.motocicleta.Kilometraje;
import co.com.sofka.domain.generic.Entity;

public class MotocicletaUsada extends Entity<MotocicletaUsadaId> {
    protected FichaTecnica fichaTecnica;
    protected Kilometraje kilometraje;

    public MotocicletaUsada(MotocicletaUsadaId entityId) {
        super(entityId);
    }

    public MotocicletaUsada(MotocicletaUsadaId entityId, FichaTecnica fichaTecnica, Kilometraje kilometraje) {
        super(entityId);
        this.fichaTecnica = fichaTecnica;
        this.kilometraje = kilometraje;
    }

    public FichaTecnica fichaTecnica() {
        return fichaTecnica;
    }

    public Kilometraje kilometraje() {
        return kilometraje;
    }
}
