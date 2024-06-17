//Aanmaak subklasse FirePokemon//

import java.util.Arrays;
import java.util.List;


public class FirePokemon extends Pokemon {
    private List<String> attacks = Arrays.asList("inferno", "pyroBall", "fireLash", "flameThrower

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "fire", Arrays.asList("Inferno", "Pyro Ball", "Fire Lash", "Flame Thrower"));
    }

    @Override
    public String getType() {
        return "Fire";
    }
    @Override
    public List<String> getAttacks() {
        return attacks;
    }
    public void inferno(Pokemon attacker, Pokemon defender) {
        //Implement attack logic
    }
    public void pyroBall(Pokemon attacker, Pokemon defender) {
        //Implement attack logic
    }
    public void fireLash(Pokemon attacker, Pokemon defender) {
        //Implment attack logic
    }
    public void flameThrower(Pokemon attacker, Pokemon defender) {

    }
}
