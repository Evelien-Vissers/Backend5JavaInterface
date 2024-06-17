//Subklasse GrassPokemon
import java.util.List;

public class GrassPokemon extends Pokemon {
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "grass", Arrays.asList("Leaf Storm", "Solar Beam", "Leech Seed", "Leave Blade"));
    }
    public void leafStorm(Pokemon attacker, Pokemon defender) {
        //Implement leaf storm attack
    }
    public void solarBeam(Pokemon attacker, Pokemon defender) {
        //Implement solar beam attack
    }
    public void leechSeed(Pokemon attacker, Pokemon defender) {
        //Implement leech seed attack
    }
    public void leaveBlade(Pokemon attacker, Pokemon defender) {
        //Implement leave blade attack
    }
}

