//Aanmaak subklasse FirePokemon//

import java.util.Arrays;
import java.util.List;


public class FirePokemon extends Pokemon {
    private List<String> attacks = Arrays.asList("inferno", "pyroBall", "fireLash", "flameThrower

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "fire", Arrays.asList("Inferno", "Pyro Ball", "Fire Lash", "Flame Thrower"));
    }
    public void inferno(Pokemon attacker, Pokemon defender) {
        //Implement inferno attack
    }
    public void pyroBall(Pokemon attacker, Pokemon defender) {
        //Implement pyro ball attack
    }
    public void fireLash(Pokemon attacker, Pokemon defender) {
        //Implement attack fire lash attack
    }
    public void flameThrower(Pokemon attacker, Pokemon defender) {
        //Implement flame thrower attack
    }
}
