package com.genshin.elements.model;

public class Hydro extends Reaction{
    public Hydro(String name, String reaction, String authority) {
        super("Hyrdo", "Wet", "Justice");
    }

    @Override
    public String getName() {
        return "Hydro";
    }

    @Override
    public String getReaction() {
        return "Wet";
    }
    @Override
    public String getAuthority() {
        return "Justice";
    }

}
