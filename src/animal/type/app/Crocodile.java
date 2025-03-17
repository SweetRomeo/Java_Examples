package animal.type.app;

public class Crocodile extends Animal {
    public Crocodile(String type, String size, int weight) {
        super(type, size, weight);
    }

    @Override
    public void eat() {
        System.out.println(getExplicitType() + " eats crocodile");
    }

    @Override
    public void sleep() {
        System.out.println(getExplicitType() + " sleeps crocodile");
    }

    @Override
    public void move(String speed) {
        if (speed.equals("miles")) {
            System.out.println(getExplicitType() + " moves miles crocodile");
        }
        else if (speed.equals("kilometers")) {
            System.out.println(getExplicitType() + " moves kilometers crocodile");
        }
        else {
            System.out.println(getExplicitType() + " moves feet crocodile");
        }
    }
}
