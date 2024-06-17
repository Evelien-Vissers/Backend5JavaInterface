//Subklasse GrassPokemon
import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "grass", Arrays.asList("Leaf Storm", "Solar Beam", "Leech Seed", "Leave Blade"));
    }
    public void leafStorm(Pokemon name, Pokemon enemy) {
        //Implement leaf storm attack
    }
    public void solarBeam(Pokemon name, Pokemon enemy) {
        //Implement solar beam attack
    }
    public void leechSeed(Pokemon name, Pokemon enemy) {
        //Implement leech seed attack
    }
    public void leaveBlade(Pokemon name, Pokemon enemy) {
        //Implement leave blade attack
    }
}

