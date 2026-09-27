package com.genshin.elements.model;

import java.util.List;

public class Dendro extends Reaction{
    public Dendro(String name, String reaction) {
        super("Dendro", "Bloom", "Wisdom");
    }
    @Override
    public String getName() {
        return "Dendro";
    }

    @Override
    public String getReaction() {
        return "Bloom";
    }
    @Override
    public String getAuthority() {
        return "Wisdom";
    }
}
