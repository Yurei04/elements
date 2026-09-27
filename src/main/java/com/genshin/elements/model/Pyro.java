package com.genshin.elements.model;

public class Pyro extends Reaction {
    public Pyro(String name, String reaction, String authority) {
        super("Pyro", "Burn", "War");
    }
    @Override
    public String getName() {
        return "Pyro";
    }

    @Override
    public String getReaction() {
        return "Burn";
    }

    @Override
    public String getAuthority() {
        return "War";
    }
}
