package com.genshin.elements.model;

public class Cryo extends Reaction{
    public Cryo(String name, String reaction) {
        super("Cryo", "Freeze", "Love");
    }

    @Override
    public String getName() {
        return "Cryo";
    }

    @Override
    public String getReaction() {
        return "freeze";
    }

    @Override
    public String getAuthority() {
        return "Love";
    }
}
