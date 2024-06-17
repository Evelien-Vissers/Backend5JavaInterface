//Subklasse ElectricPokemon
import java.util.List;

public class ElectricPokemon extends Pokemon {
    public Electric Pokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "electric", Arrays.asList("Thunder Punch", "Electro Ball", "Thunder", "Volt Tackle"));
    }
    public void thunderPunch(Pokemon attacker, Pokemon defender) {
        //Implement thunder punch attack
    }
    public void electricBall(Pokemon attacker, Pokemon defender) {
        //Implement electric ball attack
    }
    public void thunder(Pokemon attacker, Pokemon defender) {
        //Implement thunder attack
    }
    public void voltTackle(Pokemon attacker, Pokemon defender) {
        //Implement volt tackle attack
    }
}
