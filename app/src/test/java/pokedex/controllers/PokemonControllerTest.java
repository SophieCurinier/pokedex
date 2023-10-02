package pokedex.controllers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.annotation.Target;

public class PokemonControllerTest {

    private PokemonController controller;

    @BeforeEach public void setUp() {
        controller = new PokemonController();
    }
}
