package co.com.sofka.generic.values;

import co.com.sofka.domain.generic.Identity;

public class CatalogoMotocicletasId extends Identity {
    public CatalogoMotocicletasId(String id) {
        super(id);
    }

    public static CatalogoMotocicletasId of(String id) {
        return new CatalogoMotocicletasId(id);
    }
}
