package com.example.usre.pokedex;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
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

public class PokemonListAdapter extends ArrayAdapter<Pokemon>{
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

            convertView = inflater.inflate(layoutId,null);

            holder = new PokemonViewHolder();

            holder.pokemonIdTextView = convertView.findViewById(R.id.pokemon_list_item_id_textView);
            holder.pokemonNameTextView = convertView.findViewById(R.id.pokemon_list_item_name_textView);
            holder.pokemonTypeImageView = convertView.findViewById(R.id.pokemon_list_item_type_image);
            convertView.setTag(holder);

        }else{
            holder = (PokemonViewHolder) convertView.getTag();
        }

        Pokemon pokemon = pokemonList.get(position);
        holder.pokemonIdTextView.setText(String.valueOf(pokemon.getId()));
        holder.pokemonNameTextView.setText(pokemon.getName());

        final Pokemon.Type type = pokemon.getType();

        switch (type){
            case FIRE:
                holder.pokemonTypeImageView.setImageDrawable(ContextCompat.getDrawable(context,R.drawable.fire));
                break;;
            case WATER:;
                holder.pokemonTypeImageView.setImageDrawable(ContextCompat.getDrawable(context,R.drawable.water));
                break;;
            case PLANT:;
                holder.pokemonTypeImageView.setImageDrawable(ContextCompat.getDrawable(context,R.drawable.plant));
                break;;
            case ELECTRIC:;
                holder.pokemonTypeImageView.setImageDrawable(ContextCompat.getDrawable(context,R.drawable.electric));
                break;;
        }
        return  convertView;
    }


    private  class PokemonViewHolder{
        public TextView pokemonIdTextView;
        public TextView pokemonNameTextView;
        public ImageView pokemonTypeImageView;
    }
}
