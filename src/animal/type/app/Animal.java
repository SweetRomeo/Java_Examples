package animal.type.app;

public abstract class Animal {
    private String type;
    private String size;
    private int weight;
    public Animal(String type, String size, int weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
    public abstract void eat();
    public abstract void sleep();
    public abstract void move(String speed);

    public String getExplicitType() {
        return getClass().getSimpleName() + " (" + type + ")";
    }
}
