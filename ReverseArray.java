
public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        for (int i = 0; i < numbers.length; i += 2) {
            System.out.println(numbers[i]);
        }

        System.out.println("Reverse order:");

        int lastIndex = (numbers.length - 1) / 2 * 2;

        for (int i = lastIndex; i >= 0; i -= 2) {
            System.out.println(numbers[i]);
        }
    }
}
