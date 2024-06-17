//Subklasse ElectricPokemon
import java.util.List;

public class ElectricPokemon extends Pokemon {
    public ElectricPokemon(String name, int level, int hp, String food, String sound, List<String> attacks) {
        super(name, level, hp, food, sound, "electric", List.of("Thunder Punch", "Electro Ball", "Thunder", "Volt Tackle"));
    }
    public void thunderPunch(Pokemon attacker, Pokemon defender) {
        //Implement thunder punch attack
    }
    public void electroBall(Pokemon attacker, Pokemon defender) {
        //Implement electric ball attack
    }
    public void thunder(Pokemon attacker, Pokemon defender) {
        //Implement thunder attack
    }
    public void voltTackle(Pokemon attacker, Pokemon defender) {
        //Implement volt tackle attack
    }
}
