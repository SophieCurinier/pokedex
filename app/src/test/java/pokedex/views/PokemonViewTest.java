package pokedex.views;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.annotation.Target;

public class PokemonViewTest {

    private PokemonView view;

    @BeforeEach public void setUp() {
        view = new PokemonView();
    }

    @Test public void getEmptyView() {
        assertEquals("", view.getView());
    }

    @Test public void setView() {
        view.setView(1, "Bulbizzare", 7, 2, "Love water.");
        assertEquals("=============================\nPokémon #1\nName : Bulbizzare\nHeight : 7\nWeight : 2\nDescription : Love water.\n=============================\n",view.getView());
    }
}
