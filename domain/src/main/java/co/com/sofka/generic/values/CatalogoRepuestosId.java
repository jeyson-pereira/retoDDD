package co.com.sofka.generic.values;

import co.com.sofka.domain.generic.Identity;

public class CatalogoRepuestosId extends Identity {
    public CatalogoRepuestosId(String id) {
        super(id);
    }

    public static CatalogoRepuestosId of(String id) {
        return new CatalogoRepuestosId(id);
    }
}
