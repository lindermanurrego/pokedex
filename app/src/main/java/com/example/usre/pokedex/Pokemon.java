package com.example.usre.pokedex;

/**
 * Created by Usre on 3/12/2017.
 */

public class Pokemon {
    private String id;
    private String name;
    private  Type type;

    public enum Type{
        FIRE,WATER,PLANT,ELECTRIC
    }

    public Pokemon(String id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
