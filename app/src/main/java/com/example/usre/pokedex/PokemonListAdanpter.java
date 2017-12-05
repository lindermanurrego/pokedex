package com.example.usre.pokedex;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

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

    public View getView (int position, View convertView, ViewGroup parent){

        PokemonViewHolder holder;

        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        }


    }


    private  class PokemonViewHolder{
        public TextView pokemonIdTextView;
        public TextView pokemonNameTextView;
        public ImageView pokemonTypeImageView;
    }
}
