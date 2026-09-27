package com.genshin.elements.model;

public class Lunar extends Reaction {
    public Lunar(String name, String reaction, String authority) {
        super("Lunar", "Lunar", "TriLunar");
    }

    @Override
    public String getName() {
        return "Lunar";
    }

    @Override
    public String getReaction() {
        return "Lunar";
    }
    @Override
    public String getAuthority() {
        return "TriLunar";
    }
}
