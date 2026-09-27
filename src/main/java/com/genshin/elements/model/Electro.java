package com.genshin.elements.model;

public class Electro extends Reaction {
    public Electro( String name, String reaction) {
        super("Electro", "Electrified", "Eternity");
    }

    @Override
    public String getName() {
        return "Electro";
    }

    @Override
    public String getReaction() {
        return "Electrified";
    }

    @Override
    public String getAuthority() {
        return "Eternity";
    }
}
