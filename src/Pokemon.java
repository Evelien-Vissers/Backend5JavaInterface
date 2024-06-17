//Abstracte klasse 'Pokemon':
public abstract class Pokemon {
    private String name;
    private int level;
    private int hp;
    private String food;
    private String sound;

    public Pokemon(String name, int level, int hp, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
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
    public abstract String getType();

    public abstract List<String> getAttacks();
}
