//Abstracte klasse 'Pokemon':
public abstract class Pokemon {
    private String name;
    private int level;
    private int hp;
    private String food;
    private String sound;
    private String type;
    private List<String> attacks;

    public Pokemon(String name, int level, int hp, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.type = type;
        this.attacks = attacks;
    }
    public String getName() {
        return  name;
    }
    public int getLevel() {
        return level;
    }
    public int getHp() {
        return hp;
    }
    public void setHP(int hp) {
        this.hp = hp;
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

    public abstract List<String> getAttacks(); {

    }
}
