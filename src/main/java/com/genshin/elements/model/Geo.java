package com.genshin.elements.model;

public class Geo extends Reaction{
    public Geo(String name, String reaction) {
        super("Geo", "Crystallize", "Contracts");
    }

    @Override
    public String getName() {
        return "Geo";
    }

    @Override
    public String getReaction() {
        return "Crystallize";
    }
    @Override
    public String getAuthority() {
        return "Contracts";
    }
}
