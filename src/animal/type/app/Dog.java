package animal.type.app;

public class Dog extends Animal{

    public Dog(String type, String size, int weight) {
        super(type, size, weight);
    }

    @Override
    public void eat() {
        System.out.println(getExplicitType() + " eats the dog");
    }

    @Override
    public void sleep() {
        System.out.println(getExplicitType() + " sleeps the dog");
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.println(getExplicitType() + "Walking");
        }
        else {
            System.out.println(getExplicitType() + "Running");
        }
    }
}
