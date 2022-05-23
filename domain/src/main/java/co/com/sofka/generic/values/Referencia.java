package co.com.sofka.generic.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Referencia implements ValueObject<String> {
    private final String value;

    public Referencia(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.length() > 25 ){
            throw new IllegalArgumentException("La referencia no puede tener mas de 25 caracteres");
        }
    }

    public String value() { return value; }
}
