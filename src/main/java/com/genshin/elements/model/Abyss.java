package com.genshin.elements.model;

public class Abyss extends Reaction{
    public Abyss(String name, String reaction) {
        super("Abyss", "Corruption", "Abyssal");
    }

    @Override
    public String getName() {
        return "Abyss";
    }

    @Override
    public String getReaction() {
        return "Corruption";
    }

    @Override
    public String getAuthority() {
        return "Abyssal";
    }
}
