import animal.type.app.Animal;
import animal.type.app.Dog;
import animal.type.app.Fish;
import org.arrayutil.app.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "Dairy", 1);
    }
}

public class Main {
    public static void main(String[] args) {
        /*int[] arr = ArrayUtil.getRandomArray(100);
        ArrayUtil.printArray(arr);
        int secondMax = ArrayUtil.secondMax(arr);
        System.out.println("SecondMax: " + secondMax);
        System.out.println(ArrayUtil.binarySearch(arr, 15));
        ArrayUtil.bubbleSort(arr);
        ArrayUtil.printArray(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ArrayUtil.binarySearch(arr, 15));*/
        ArrayList<Animal> animals = new ArrayList<>();
        Dog dog = new Dog("Golden", "small", 20);
        Fish fish = new Fish("Brown", "medium", 5);

        animals.add(dog);
    }
    /*public static void GroceryItemTest() {
        Object[] groceryItems = new Object[5];
        groceryItems[0] = new GroceryItem("milk");
        groceryItems[1] = new GroceryItem("Dairy", "Dairy", 2);
    }*/
    public static void printAnimals(ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            animal.eat();
            animal.move("fast");
            animal.sleep();
            animal.move("slow");
        }
    }
}