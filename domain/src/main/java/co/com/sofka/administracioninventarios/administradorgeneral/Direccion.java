package co.com.sofka.administracioninventarios.administradorgeneral;

import co.com.sofka.administracioninventarios.administradorgeneral.values.direccion.Departamento;
import co.com.sofka.administracioninventarios.administradorgeneral.values.direccion.DireccionId;
import co.com.sofka.administracioninventarios.administradorgeneral.values.direccion.Municipio;
import co.com.sofka.administracioninventarios.administradorgeneral.values.direccion.Nomeclatura;
import co.com.sofka.domain.generic.Entity;

public class Direccion extends Entity<DireccionId>{
    protected Departamento departamento;
    protected Municipio municipio;
    protected Nomeclatura nomeclatura;

    public Direccion(DireccionId entityId, Departamento departamento, Municipio municipio, Nomeclatura nomeclatura) {
        super(entityId);
        this.departamento = departamento;
        this.municipio = municipio;
        this.nomeclatura = nomeclatura;
    }
}
