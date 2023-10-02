package pokedex.views;

public class PokemonView {
    // Attribute
    String view ;

    // Constructor
    public PokemonView() {
        view = "";
    }

    // Getters
    public String getView() {
        return view;
    }

    // Setters
    public void setView(int id, String name, int height, int weight, String description) {
        view = "=============================\n";
        view += "Pokémon #" + id + "\n";
        view += "Name : " + name + "\n";
        view += "Height : " + height + "\n";
        view += "Weight : " + weight + "\n";
        view += "Description : " + description + "\n";
        view += "=============================\n";
    }
}
