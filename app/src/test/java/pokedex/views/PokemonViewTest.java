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
}
