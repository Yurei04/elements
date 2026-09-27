package com.genshin.elements.model;

public class Light extends Reaction {
    public Light(String name, String reaction, String authority) {
        super("Light", "Unknown", "3rd Descender");
    }

    @Override
    public String getName() {
        return "Light";
    }

    @Override
    public String getReaction() {
        return "Unknown";
    }
    @Override
    public String getAuthority() {
        return "3rd Descender";
    }
}
