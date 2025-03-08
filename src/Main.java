import org.arrayutil.app.ArrayUtil;

public class Main {
    public static void main(String[] args) {
        int[] arr = ArrayUtil.getRandomArray(10);
        ArrayUtil.printArray(arr);
        int secondMax = ArrayUtil.secondMax(arr);
        System.out.println("SecondMax: " + secondMax);
        ArrayUtil.bubbleSort(arr);
        ArrayUtil.printArray(arr);
    }
}