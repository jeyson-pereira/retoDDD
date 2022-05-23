package co.com.sofka.administracioninventarios.catalogorepuestos.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CategoriaRepuestos implements ValueObject<String> {
    private final String value;

    public CategoriaRepuestos(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.length() > 150 ){
            throw new IllegalArgumentException("La categoria no puede tener mas de 50 caracteres");
        }
    }

    public String value() { return value; }
}
