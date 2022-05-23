package co.com.sofka.administracioninventarios.catalogorepuestos.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Repuesto implements ValueObject<String> {
    private final String value;

    public Repuesto(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.length() > 150 ){
            throw new IllegalArgumentException("El repuesto no puede tener mas de 150 caracteres");
        }
    }

    public String value() { return value; }
}
