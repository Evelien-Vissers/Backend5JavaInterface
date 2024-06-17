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
    private final int hp;
    private final String food;
    private final String sound;
//De bovenstaande 'final' variabelen worden ingesteld via de constructor en kunnen daarna niet meer worden gewijzigd.
    private String type;
    private List<String> attacks;
//Deze niet-finale variabelen hebben zowel getters en setters.

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
}
