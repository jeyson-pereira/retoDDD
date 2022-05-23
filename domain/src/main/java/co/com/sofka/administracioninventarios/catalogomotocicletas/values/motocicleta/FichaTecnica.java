package co.com.sofka.administracioninventarios.catalogomotocicletas.values.motocicleta;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.generic.values.Referencia;

public class FichaTecnica implements ValueObject<FichaTecnica.Props> {
    private final EspecificacionesGenerales especificacionesGenerales;
    private final Tecnomecanicos tecnomecanicos;
    private final Referencia referencia;

    public FichaTecnica(EspecificacionesGenerales especificacionesGenerales, Tecnomecanicos tecnomecanicos, Referencia referencia) {
        this.especificacionesGenerales = especificacionesGenerales;
        this.tecnomecanicos = tecnomecanicos;
        this.referencia = referencia;
    }

    public FichaTecnica of(EspecificacionesGenerales especificacionesGenerales, Tecnomecanicos tecnomecanicos, Referencia referencia) {
        return new FichaTecnica(especificacionesGenerales, tecnomecanicos, referencia);
    }

    @Override
    public FichaTecnica.Props value() {
        return new FichaTecnica.Props(){

            @Override
            public EspecificacionesGenerales especificacionesGenerales() {
                return especificacionesGenerales;
            }

            @Override
            public Tecnomecanicos tecnomecanicos() {
                return tecnomecanicos;
            }

            @Override
            public Referencia referencia() {
                return referencia;
            }

        };
    }

    public interface Props{
        EspecificacionesGenerales especificacionesGenerales();
        Tecnomecanicos tecnomecanicos();
        Referencia referencia();
    }
}
