import java.util.List;

public class WaterPokemon extends Pokemon {
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "water", Arrays.asList("Surf", "Hydro Pump", "Hydro Canon", "Rain Dance"));
    }
    public void surf(Pokemon attacker, Pokemon defender) {
        //Implement surf attack
    }
    public void hydroPump(Pokemon attacker, Pokemon defender) {
        //Implement hydro pump attack
    }
    public void hydroCanon(Pokemon attacker, Pokemon defender) {
        //Implement hydro canon attack
    }
    public void rainDance(Pokemon attacker, Pokemon defender) {
        //Implement rain dance attack
    }
}
