package co.com.sofka.administracioninventarios.catalogomotocicletas;

import co.com.sofka.administracioninventarios.catalogomotocicletas.values.MotocicletaLocalId;
import co.com.sofka.administracioninventarios.catalogomotocicletas.values.motocicleta.FichaTecnica;
import co.com.sofka.administracioninventarios.catalogomotocicletas.values.motocicleta.Kilometraje;
import co.com.sofka.domain.generic.Entity;

public class MotocicletaLocal extends Entity<MotocicletaLocalId> {
    protected FichaTecnica fichaTecnica;
    protected Kilometraje kilometraje;

    public MotocicletaLocal(MotocicletaLocalId entityId) {
        super(entityId);
    }

    public MotocicletaLocal(MotocicletaLocalId entityId, FichaTecnica fichaTecnica) {
        super(entityId);
        this.fichaTecnica = fichaTecnica;
        this.kilometraje = new Kilometraje(0D);
    }

    public FichaTecnica fichaTecnica() {
        return fichaTecnica;
    }

    public Kilometraje kilometraje() {
        return kilometraje;
    }
}
