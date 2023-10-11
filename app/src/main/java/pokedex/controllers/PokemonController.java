package pokedex.controllers;
import pokedex.models.PokemonModel;
import pokedex.models.PokemonApiClient;
import pokedex.views.PokemonView;

public class PokemonController {
    // Attribute
    private PokemonModel model;
    private PokemonView view;

    // Constructor
    public PokemonController() {
        model = new PokemonModel();
        view = new PokemonView();
    }

    public PokemonController(PokemonModel model, PokemonView view) {
        this.model = model;
        this.view = view;
    }

    // Setters
    public void setPokemonModel(int id, String name, int height, int weight, String description) {
        model.setId(id);
        model.setName(name);
        model.setHeight(height);
        model.setWeight(weight);
        model.setDescription(description);
    }

    // Getters
    public PokemonModel getModel() {
        return model;
    }

    public PokemonView getView() {
        return view;
    }

    // Methods
    private void updateView() {
        view.setView(model.getId(), model.getName(), model.getHeight(), model.getWeight(), model.getDescription());
    }

    public void setPokemon(int pokemonId) {
        PokemonApiClient api = new PokemonApiClient();
        model = api.getPokemonInfo(pokemonId);
    }

    public void showPokemon() {
        updateView();
        System.out.println(view.getView());
    }
}
