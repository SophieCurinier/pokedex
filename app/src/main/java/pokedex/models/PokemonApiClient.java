package pokedex.models;

import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;

import javax.print.DocFlavor.STRING;

import java.io.BufferedReader;
import java.util.Objects;

public class PokemonApiClient {
    // Attribute
    private static final String API_BASE_URL = "https://pokeapi.co/api/v2/pokemon/";

    // Method
    public PokemonModel getPokemonInfo(int pokemonId) {
        String jsonResponse = fetchPokemonInfoFromApi(pokemonId);
        if (jsonResponse != null) {
            return parseJsonToPokemonModel(jsonResponse);
        }
        return null;
    }

    private String fetchPokemonInfoFromApi(int pokemonId) {
        String jsonRespone = null;
        try {
            URL apiUrl = new URL(API_BASE_URL + pokemonId);
            HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            jsonRespone = response.toString();
        } catch (IOException err) {
            err.printStackTrace();
        }
        return jsonRespone;
    }

    private int objectToInt(Object attrObject) {
        int attr = 0;

        if (attrObject != null && attrObject instanceof Long) {
            attr = ((Long) attrObject).intValue();
        }
        return attr;
    }

    private String objecToString(Object attrObject) {
        String attr = "";

        attr = Objects.toString(attrObject, "");

        return attr;
    }

    private PokemonModel parseJsonToPokemonModel(String jsonResponse) {
        // Parse the JSON response into a JSONObject
        JSONParser parser = new JSONParser();
        try {
            JSONObject json = (JSONObject) parser.parse(jsonResponse.toString());

            // JSON Objects
            Object nameObject = json.get("name");
            Object idObject = json.get("id");
            Object weightObject = json.get("weight");
            Object heightObject = json.get("height");
            Object descriptionObject = json.get("descriptions");
            // Pokemon models attribute 
            String pokemonName = objecToString(nameObject);
            int pokemonId = objectToInt(idObject);
            int pokemonWeight = objectToInt(weightObject);
            int pokemonHeight = objectToInt(heightObject);
            String pokemonDescription = objecToString(descriptionObject);

            PokemonModel pokemon = new PokemonModel(pokemonName,pokemonId,pokemonHeight,pokemonWeight,"");
            return pokemon;
        } catch (org.json.simple.parser.ParseException err) {
            err.printStackTrace();
            return null;
        }
    }
}
