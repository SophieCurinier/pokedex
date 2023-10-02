package pokedex.controllers;
import pokedex.models.PokemonModel;
import pokedex.views.PokemonView;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.annotation.Target;

public class PokemonControllerTest {

    private PokemonController controller;

    @BeforeEach public void setUp() {
        controller = new PokemonController();
    }

    @Test public void testSetPokemonModel() {
        controller.setPokemonModel(1, "Bulbizzare", 7, 69, "Love water.");
        assertEquals(1, controller.getModel().getId());
        assertEquals("Bulbizzare", controller.getModel().getName());
        assertEquals(7, controller.getModel().getHeight());
        assertEquals(69, controller.getModel().getWeight());
        assertEquals("Love water.", controller.getModel().getDescription());
    }

    @Test public void testUpdateView() {
        controller.setPokemonModel(1, "Bulbizzare", 7, 2, "Love water.");
        controller.updateView();
        assertEquals("=============================\nPokémon #1\nName : Bulbizzare\nHeight : 7\nWeight : 2\nDescription : Love water.\n=============================\n",controller.getView().getView());
    }
    
}
