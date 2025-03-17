package animal.type.app;

public class Fish extends Animal {

    public Fish(String type, String size, int weight) {
        super(type, size, weight);
    }

    @Override
    public void eat() {
        System.out.println(getExplicitType() + " eats fish");
    }

    @Override
    public void sleep() {
        System.out.println(getExplicitType() + " sleeps fish");
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.println(getExplicitType() + " lazily swimming");
        }
        else {
            System.out.println(getExplicitType() + " darting frantically");
        }
    }
}
