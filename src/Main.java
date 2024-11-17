import java.util.Random;
import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        int size = 20;
        int[] array = new int[size];
        Random random = new Random();
        int evenCount = 0, oddCount = 0;

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nПарних чисел: " + evenCount);
        System.out.println("Непарних чисел: " + oddCount);
    }
}
 class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість кутів багатокутника:");
        int n = scanner.nextInt();
        int[] angles = new int[n];
        int sum = 0;

        System.out.println("Введіть кути багатокутника:");
        for (int i = 0; i < n; i++) {
            angles[i] = scanner.nextInt();
            sum += angles[i];
        }

        if (sum == 180 * (n - 2)) {
            System.out.println("Такий багатокутник може існувати.");
        } else {
            System.out.println("Такий багатокутник НЕ може існувати.");
        }
    }
}

 class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розмір масиву:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\nВведіть число, яке хочете знайти:");
        int target = scanner.nextInt();
        System.out.println("Введіть нове значення:");
        int newValue = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            if (array[i] == target) {
                array[i] = newValue;
            }
        }

        System.out.println("Оновлений масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
 class Task4 {
    public static void main(String[] args) {
        System.out.println("Таблиця синусів:");

        for (int i = 0; i <= 90; i++) {
            System.out.printf("%.4f ", Math.sin(Math.toRadians(i)));
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}

 class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розмір масиву:");
        int size = scanner.nextInt();
        System.out.println("Введіть напрямок (1 - зростання, 2 - спадання):");
        int direction = scanner.nextInt();

        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        boolean isSorted = true;
        for (int i = 1; i < size; i++) {
            if (direction == 1 && array[i] < array[i - 1]) {
                isSorted = false;
                break;
            } else if (direction == 2 && array[i] > array[i - 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Масив впорядкований.");
        } else {
            System.out.println("Масив НЕ впорядкований.");
        }
    }
}