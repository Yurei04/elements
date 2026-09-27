package com.genshin.elements.model;

public class Reaction {

    String name;
    String reaction;
    String authority;


    public Reaction(String name, String reaction, String authority) {
        this.name = name;
        this.reaction = reaction;
        this.authority = authority;
    }

    public String getName() {
        return name;
    }

    public String getReaction() {
        return reaction;
    }

    public String getAuthority() {
        return authority;
    }

}
