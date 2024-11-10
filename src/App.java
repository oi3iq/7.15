import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int[] distinctNumbers = eliminateDuplicates(numbers);

        System.out.print("The distinct numbers are: ");
        for (int num : distinctNumbers) {
            System.out.print(num + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];
        int size = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < size; j++) {
                if (list[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[size++] = list[i];
            }
        }

        int[] result = new int[size];
        System.arraycopy(temp, 0, result, 0, size);
        return result;
    }
}
