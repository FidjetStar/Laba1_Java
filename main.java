import java.util.Random;
import java.util.Scanner;

public class Main {
    //==============================================================================
    public double fraction (double x) {
        int p = (int) x;
        return x - p;
    }

    public int sumLastNums (int x) {
        int x1 = x % 10;
        int x2 = x / 10 % 10;
        return x1 + x2;
    }

    public boolean is2Digits (int x) {
        x = Math.abs(x);
        return (x >= 10 && x <= 99);
    }

    public boolean isInRange (int a, int b, int num) {
        return (a <= num && num <= b) || (a >= num && num >= b);
    }

    public boolean isEqual (int a, int b, int c) {
        return (a == b && a == c);
    }
    //==============================================================================

    public double safeDiv (int x, int y) {
        if (y == 0) return 0;
        else return (double) x / y;
    }

    public boolean is35 (int x) {
        if (x % 3 == 0 && x % 5 == 0) return false;
        if (x % 3 == 0 || x % 5 == 0) return true;
        return false;
    }

    public boolean sum3 (int x, int y, int z) {
        return (x + y == z || x + z == y || y + z == x);
    }

    public String age (int x) {
        if (x % 10 == 1 && x % 100 != 11) {
            return x + " год";
        }
        else if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && (x % 100 != 12 && x % 100 != 13 && x % 100 != 14)) {
            return x + " года";
        }
        else {
            return x + " лет";
        }
    }

    public void printDays (String x) {
        switch (x) {
            case "Понедельник":
                System.out.println("Понедельник");
            case "Вторник":
                System.out.println("Вторник");
            case "Среда":
                System.out.println("Среда");
            case "Четверг":
                System.out.println("Четверг");
            case "Пятница":
                System.out.println("Пятница");
            case "Суббота":
                System.out.println("Суббота");
            case "Воскресенье":
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Это не день недели");
                break;
        }
    }
    //==================================================================================
    public String listNums (int x) {
        String result = "";
        for (int i = 0; i <= x; i++) {
            if (i == 0) {
                result += i;         // первое число — без пробела
            }
            else {
                result += " " + i;   // остальные — с пробелом впереди
            }
        }
        return result;
    }

    public int pow (int x, int y) {
        int res = 1;
        for (int i = 0; i < y; i++) {
            res = res * x;
        }
        return res;
    }

    public int numLen (long x) {
        if (x == 0) return 1;
        int cnt = 0;
        while (x != 0) {
            x /= 10;
            cnt += 1;
        }
        return cnt;
    }

    public void square (int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void guessGame() {
        Random rand = new Random();
        int b = rand.nextInt(10);          // 0..9
        Scanner scan = new Scanner(System.in);
        int otvet = -1;
        int cnt = 0;
        System.out.println("Введите число от 0 до 9:");
        while (otvet != b) {
            otvet = scan.nextInt();
            cnt++;
            if (otvet != b) {
                System.out.println("Вы не угадали, введите число от 0 до 9:");

            }
        }
        System.out.println("Вы угадали!");
        System.out.println("Вы отгадали число за " + cnt + " попытки");
    }
    //====================================================================================
    public int maxAbs (int[] arr) {
        int max = Math.abs(arr[0]);
        int res = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (Math.abs(arr[i]) > max) {
                max = Math.abs(arr[i]);
                res = arr[i];
            }
        }
        return res;
    }

    public int[] add (int[] arr, int[] ins, int pos) {
        int[] p = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            p[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            p[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            p[i + ins.length] = arr[i];
        }
        return p;
    }

    public void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        return result;
    }

    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        int[] result = new int[count];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[k] = i;
                k++;
            }
        }
        return result;
    }
    //===========================================================================================
    private int readInt(Scanner sc) {
        while (true) {
            if (sc.hasNextInt()) {
                int value = sc.nextInt();
                sc.nextLine();
                return value;
            }
            else {
                System.out.print("Ошибка: нужно целое число. Повторите ввод: ");
                sc.nextLine();
            }
        }
    }

    private long readLong(Scanner sc) {
        while (true) {
            if (sc.hasNextLong()) {
                long value = sc.nextLong();
                sc.nextLine();
                return value;
            }
            else {
                System.out.println("Ошибка: нужно ввести целое число (long). Попробуйте снова.");
                sc.nextLine();
            }
        }
    }

    private double readDouble(Scanner sc) {
        while (true) {
            if (sc.hasNextDouble()) {
                double value = sc.nextDouble();
                sc.nextLine();
                return value;
            }
            else {
                System.out.println("Ошибка: нужно ввести число (double). Попробуйте снова.");
                sc.nextLine();
            }
        }
    }

    private String readLine(Scanner sc) {
        while (true) {
            String line = sc.nextLine().trim();
            if (!line.isEmpty()) {
                return line;
            }
            System.out.println("Ошибка: строка не может быть пустой. Попробуйте снова.");
        }
    }

    private int[] readArray(Scanner sc) {
        int n;
        while (true) {
            System.out.print("Введите размер массива: ");
            n = readInt(sc);
            if (n > 0) break;
            System.out.println("Размер должен быть больше 0");
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент " + (i + 1) + " из " + n + ": ");
            arr[i] = readInt(sc);
        }
        return arr;
    }
    //===========================================================================================
    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);
        int choice;
        System.out.println("\n============= МЕНЮ =============");
        System.out.println("1) 1.1 Дробная часть числа");
        System.out.println("2) 1.2 Сумма двух последних цифр");
        System.out.println("3) 1.5 Двузначное ли число");
        System.out.println("4) 1.7 Вхождение в диапазон");
        System.out.println("5) 1.9 Равенство трёх чисел");
        System.out.println("6) 2.2 Безопасное деление");
        System.out.println("7) 2.3 Делится на 3 или 5 (не на оба)");
        System.out.println("8) 2.6 Тройная сумма");
        System.out.println("9) 2.8 Возраст (год/года/лет)");
        System.out.println("10) 2.10 Дни недели");
        System.out.println("11) 3.1 Числа подряд от 0 до x");
        System.out.println("12) 3.4 Возведение в степень");
        System.out.println("13) 3.5 Длина числа");
        System.out.println("14) 3.7 Квадрат из '*'");
        System.out.println("15) 3.10 Игра «Угадай число»");
        System.out.println("16) 4.3 Максимум по модулю в массиве");
        System.out.println("17) 4.5 Вставка массива в массив");
        System.out.println("18) 4.6 Реверс массива");
        System.out.println("19) 4.8 Объединение двух массивов");
        System.out.println("20) 4.9 Все вхождения числа в массив");
        System.out.println("0) Выход");
        System.out.println("================================");
        do {
            System.out.print("Введите номер пункта меню: ");
            choice = m.readInt(sc);
            System.out.println();
            switch (choice) {
                case 1: {
                    System.out.print("Введите x (дробное число): ");
                    double x = m.readDouble(sc);
                    System.out.println("Результат: " + m.fraction(x));
                    break;
                }
                case 2: {
                    System.out.print("Введите x: ");
                    int x = m.readInt(sc);
                    System.out.println("Результат: " + m.sumLastNums(x));
                    break;
                }
                case 3: {
                    System.out.print("Введите x: ");
                    int x = m.readInt(sc);
                    System.out.println("Результат: " + m.is2Digits(x));
                    break;
                }
                case 4: {
                    System.out.print("Введите a: ");
                    int a = m.readInt(sc);
                    System.out.print("Введите b: ");
                    int b = m.readInt(sc);
                    System.out.print("Введите num: ");
                    int num = m.readInt(sc);
                    System.out.println("Результат: " + m.isInRange(a, b, num));
                    break;
                }
                case 5: {
                    System.out.print("Введите a: ");
                    int a = m.readInt(sc);
                    System.out.print("Введите b: ");
                    int b = m.readInt(sc);
                    System.out.print("Введите c: ");
                    int c = m.readInt(sc);
                    System.out.println("Результат: " + m.isEqual(a, b, c));
                    break;
                }
                case 6: {
                    System.out.print("Введите x: ");
                    int x = m.readInt(sc);
                    System.out.print("Введите y: ");
                    int y = m.readInt(sc);
                    System.out.println("Результат: " + m.safeDiv(x, y));
                    break;
                }
                case 7: {
                    System.out.print("Введите x: ");
                    int x = m.readInt(sc);
                    System.out.println("Результат: " + m.is35(x));
                    break;
                }
                case 8: {
                    System.out.print("Введите x: ");
                    int x = m.readInt(sc);
                    System.out.print("Введите y: ");
                    int y = m.readInt(sc);
                    System.out.print("Введите z: ");
                    int z = m.readInt(sc);
                    System.out.println("Результат: " + m.sum3(x, y, z));
                    break;
                }
                case 9: {
                    System.out.print("Введите возраст: ");
                    int x = m.readInt(sc);
                    System.out.println("Результат: " + m.age(x));
                    break;
                }
                case 10: {
                    System.out.print("Введите день недели: ");
                    String day = m.readLine(sc);
                    m.printDays(day);
                    break;
                }
                case 11: {
                    System.out.print("Введите x: ");
                    int x = m.readInt(sc);
                    System.out.println("Результат: " + m.listNums(x));
                    break;
                }
                case 12: {
                    System.out.print("Введите x: ");
                    int x = m.readInt(sc);
                    System.out.print("Введите y: ");
                    int y = m.readInt(sc);
                    System.out.println("Результат: " + m.pow(x, y));
                    break;
                }
                case 13: {
                    System.out.print("Введите x: ");
                    long x = m.readLong(sc);
                    System.out.println("Результат: " + m.numLen(x));
                    break;
                }
                case 14: {
                    System.out.print("Введите размер квадрата x: ");
                    int x = m.readInt(sc);
                    m.square(x);
                    break;
                }
                case 15: {
                    m.guessGame();
                    break;
                }
                case 16: {
                    System.out.println("Ввод массива");
                    int[] arr = m.readArray(sc);
                    System.out.println("Результат (макс по модулю): " + m.maxAbs(arr));
                    break;
                }
                case 17: {
                    System.out.println("Первый массив");
                    int[] arr1 = m.readArray(sc);
                    System.out.println("Вставляемый массив");
                    int[] ins = m.readArray(sc);
                    System.out.print("Введите позицию pos: ");
                    int pos = m.readInt(sc);
                    int[] res = m.add(arr1, ins, pos);
                    System.out.println("Результат: " + java.util.Arrays.toString(res));
                    break;
                }
                case 18: {
                    System.out.println("Ввод массива");
                    int[] arr = m.readArray(sc);
                    m.reverse(arr);
                    System.out.println("Массив: " + java.util.Arrays.toString(arr));
                    break;
                }
                case 19: {
                    System.out.println("Первый массив");
                    int[] arr1 = m.readArray(sc);
                    System.out.println("Второй массив");
                    int[] arr2 = m.readArray(sc);
                    int[] res = m.concat(arr1, arr2);
                    System.out.println("Результат: " + java.util.Arrays.toString(res));
                    break;
                }
                case 20: {
                    System.out.println("Ввод массива");
                    int[] arr = m.readArray(sc);
                    System.out.print("Введите x:");
                    int x = m.readInt(sc);
                    int[] res = m.findAll(arr, x);
                    System.out.println("Результат: " + java.util.Arrays.toString(res));
                    break;
                }
                case 0:
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Нет такого пункта. Введите число от 0 до 20.");
            }
            System.out.println();
        }
        while (choice != 0);
        sc.close();
    }
}
