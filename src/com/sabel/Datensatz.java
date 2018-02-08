package com.sabel;

import java.util.UUID;

public abstract class Datensatz {

    // DATA FIELDS
    private final UUID uuid;

    // CONSTRUCTORS
    public Datensatz() {
        uuid = UUID.randomUUID();
        // System.out.println(uuid);
    }

    public Datensatz(UUID uuid) {
        this.uuid = uuid;
    } // END CONSTRUCTORS

    // GETTER
    public UUID getUuid() {
        return uuid;
    }

} // END CLASS DATENSATZ
