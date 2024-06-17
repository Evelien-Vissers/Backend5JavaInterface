//Deze klasse is aangemaakt om de setter-methode uit de superklasse (Pokemon.java) te gebruiken.
//Deze setter-methode wordt hier aangeroepen om te voorkomen dat deze ongebruikt is.
import java.util.List;

public class PokemonTest {
    public static void main(String[] args) {
        List<String> initialAttacks = List.of("Tackle", "Growl");

    //Gebruik van Electric Pokemon ter test:
    Pokemon pikachu = new ElectricPokemon("Pikachu", 5, 35, "Berries", "Pika Pika", initialAttacks);

    //Gebruik van de setter-methoden:
    pikachu.setType("electric");
    pikachu.setAttacks(List.of("Thunder Shock", "Quick Attack"));

    //Controle of de waarden zijn bijgewerkt:
    System.out.println("Type: " + pikachu.getType());
    System.out.println("Attacks: " + pikachu.getAttacks());
}
}

