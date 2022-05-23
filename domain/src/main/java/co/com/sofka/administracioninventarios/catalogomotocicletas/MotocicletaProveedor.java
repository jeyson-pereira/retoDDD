package co.com.sofka.administracioninventarios.catalogomotocicletas;

import co.com.sofka.administracioninventarios.catalogomotocicletas.values.MotocicletaProveedorId;
import co.com.sofka.administracioninventarios.catalogomotocicletas.values.motocicleta.FichaTecnica;
import co.com.sofka.administracioninventarios.catalogomotocicletas.values.motocicleta.Kilometraje;
import co.com.sofka.domain.generic.Entity;

public class MotocicletaProveedor extends Entity<MotocicletaProveedorId> {
    protected FichaTecnica fichaTecnica;
    protected Kilometraje kilometraje;

    public MotocicletaProveedor(MotocicletaProveedorId entityId) {
        super(entityId);
    }

    public MotocicletaProveedor(MotocicletaProveedorId entityId, FichaTecnica fichaTecnica) {
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
