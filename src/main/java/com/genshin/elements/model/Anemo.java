package com.genshin.elements.model;

public class Anemo extends Reaction {
    public Anemo(String name, String reaction) {
        super("Anemo", "Swirl", "Freedom");
    }

    @Override
    public String getName() {
        return "Anemo";
    }
    @Override
    public String getReaction() {
        return "Swirl";
    }
    @Override
    public String getAuthority() {
        return "Freedom";
    }
}
