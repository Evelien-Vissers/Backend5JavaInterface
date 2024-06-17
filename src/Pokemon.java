import java.util.List;

//Abstracte super klasse 'Pokemon' met:
// a. 5 private final variabelen;
// b. 1 private variabele;
// c. 1 constructor;
// d. 6 getters; en
// e. 1 setter

public abstract class Pokemon {
    private final String name;
    private final int level;
    private int hp; //Voor Bonusopdracht heb ik deze niet meer 'final' gemaakt zodat deze kan worden aangepast in subklassen.
    private final String food; //Bonusopdracht 1.
    private final String sound;
//De bovenstaande 'final' variabelen worden ingesteld via de constructor en kunnen daarna niet meer worden gewijzigd.
    private String type;
    private List<String> attacks;
//Deze niet-finale variabelen hebben zowel getters en setters.
//Zie hieronder Bonus opdracht 1 (toevoeging variabele 'food'):


//Constructor:
    public Pokemon(String name, int level, int hp, String food, String sound, String type, List<String> attacks) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.type = type;
        this.attacks = attacks;
    }
//Hieronder zijn 6 getters en 1 setter weergegeven.
    public String getName() {
        return  name;
    }
    public int getLevel() {
        return level;
    }
    public int getHp() {
        return hp;
    }
    public String getFood() {
        return food;
    }
    public String getSound () {
        return sound;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public List<String> getAttacks() {
        return attacks;
    }
    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }

    //Bonusopdracht 1b: methode om de HP van de pokemon te verhogen wanneer hij gevoerd wordt
    public void feedPokemon(int boost) {
        this.hp += boost;
        System.out.println(name + " has been fed. HP boosted by " + ". Current HP: " + hp);
    }
    public void boostHP(int boost) {
        this.hp += boost; //Toevoeging methode voor bonusopdracht (na niet final maken van 'hp').
    }
    //Bonusopdracht 2: methode om pokemonvoedsel naar Pokemon te gooien voor een aanval, ipv het doen van een aanval:
    // Zie tevens PokemonGymImpl klasse voor implementatie hiervan:
    public void throwFood(String food) {
        //Controle of het voedsel overeenkomst met het type Pokemon:
        if (food.equalsIgnoreCase(this.food)) {
            //Geef boost aan de HP van de Pokemon
            boostHP(30);
            System.out.println(name + " received a boost from the food!");
        } else {
            System.out.println(name + " doesn't like this food...");
        }
    }
}
