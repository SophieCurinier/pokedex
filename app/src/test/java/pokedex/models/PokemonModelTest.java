/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package pokedex.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class PokemonModelTest {

    private PokemonModel pokemon;

    @BeforeEach public void setUp() {
        pokemon = new PokemonModel();
    }

    @Test public void testSetName() {
        pokemon.setName("Bulbizzare");
        assertEquals("Bulbizzare", pokemon.getName());
    }

    @Test public void testSetId() {
        pokemon.setId(1);
        assertEquals(1, pokemon.getId());
    }

    @Test public void testHeight() {
        pokemon.setHeight(12);
        assertEquals(12, pokemon.getHeight());
    }
}
