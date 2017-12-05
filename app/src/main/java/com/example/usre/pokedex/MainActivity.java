package com.example.usre.pokedex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView pokemonListView = (ListView) findViewById(R.id.pokemon_listView);
        ArrayList<Pokemon> pokemonList = new ArrayList<>();
        pokemonList.add(new Pokemon("1","Bulbasaur",Pokemon.Type.PLANT));
        pokemonList.add(new Pokemon("2","Tvysaur",Pokemon.Type.PLANT));
        pokemonList.add(new Pokemon("3","Venuasaur",Pokemon.Type.PLANT));
        pokemonList.add(new Pokemon("4","Charmander",Pokemon.Type.FIRE));
        pokemonList.add(new Pokemon("5","Charmeleon",Pokemon.Type.FIRE));
        pokemonList.add(new Pokemon("6","Charizar",Pokemon.Type.FIRE));
        pokemonList.add(new Pokemon("7","Squirtle",Pokemon.Type.WATER));
        pokemonList.add(new Pokemon("8","Wartortle",Pokemon.Type.WATER));
        pokemonList.add(new Pokemon("9","Blastoise",Pokemon.Type.WATER));
        pokemonList.add(new Pokemon("25","Pikachu",Pokemon.Type.ELECTRIC));
        pokemonList.add(new Pokemon("26","Raichu",Pokemon.Type.ELECTRIC));

        final PokemonListAdapter adapter = new PokemonListAdapter(this,R.layout.pokemon_list_items,pokemonList);
        pokemonListView.setAdapter(adapter);

        pokemonListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Pokemon selectedPokemon = adapter.getItem(position);
                if (selectedPokemon != null){
                    Toast.makeText(MainActivity.this,selectedPokemon.getName(),Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
