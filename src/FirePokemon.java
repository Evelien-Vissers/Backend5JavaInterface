//Aanmaak subklasse FirePokemon//

import java.util.Arrays;
import java.util.List;


public class FirePokemon extends Pokemon {
    private List<String> attacks = Arrays.asList("inferno", "pyroBall", "fireLash", "flameThrower");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "fire", List.of("Inferno", "Pyro Ball", "Fire Lash", "Flame Thrower"));
    }
    public void inferno(Pokemon name, Pokemon enemy) {
        //Implement inferno attack
    }
    public void pyroBall(Pokemon name, Pokemon enemy) {
        //Implement pyro ball attack
    }
    public void fireLash(Pokemon name, Pokemon enemy) {
        //Implement attack fire lash attack
    }
    public void flameThrower(Pokemon name, Pokemon enemy) {
        //Implement flame thrower attack
    }
}
