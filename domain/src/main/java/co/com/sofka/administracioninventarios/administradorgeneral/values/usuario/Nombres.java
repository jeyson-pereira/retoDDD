package co.com.sofka.administracioninventarios.administradorgeneral.values.usuario;


import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombres implements ValueObject<String> {
    private final String value;

    public Nombres(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar en blanco");
        }

        if(this.value.length() > 200){
            throw new IllegalArgumentException("El nombre no permite mas de 200 caracteres");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
