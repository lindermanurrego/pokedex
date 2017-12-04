package com.example.usre.pokedex;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Usre on 3/12/2017.
 */

public class PokemonListAdanpter extends ArrayAdapter<Pokemon>{
     private Context context;
     private ArrayList<Pokemon> pokemonList;
     private int layoutId;

    public PokemonListAdanpter(@NonNull Context context, int resource, @NonNull ArrayList<Pokemon> pokemonList) {

        super(context, resource,pokemonList);
        this.context = context;
        this.pokemonList = pokemonList;
        layoutId = resource;
    }
}
