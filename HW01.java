import java.util.Arrays;
import java.util.Random;

public class HW01 {
    static int i;
    static int n = 1;
    public static void main(String[] args) {
        randInt();
        maxByte(i);
        divisible();
        notdivisible();
    }
    public static void randInt() {
        //1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i

        int ri = new Random().nextInt(-1000, 1001);
        i = ri;
        System.out.println("Случайно выпавшее число: " + i);
    }

    public static void maxByte(int num) {
        //2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

        int number = 0;
        number = Integer.highestOneBit(Math.abs(num));

        while (number/2 > 0) {
            number = number/2;
            n ++;
        }
        System.out.println("Номер старшего значащего бита: " + n);
    }

    public static void divisible() {
        //3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1

        int count_divisible = 1;
        for (int j = i; j < Short.MAX_VALUE; j ++){
            if (j % n == 0){
                count_divisible ++;
            }
            }
        int m1[] = new int[count_divisible];
        int count = 0;
        for (int k = i; k < Short.MAX_VALUE; k++) {
            if (k % n == 0) {
                m1[count] = k;
                count++;
            }
        }
        System.out.print("Числа кратные старшему значащему биту: \n[");
        for (int l = 1; l < m1.length ; l++) {
            if (l == m1.length - 1) {
                System.out.println(m1[l - 1] + "]");
                break;
            }
            System.out.print(m1[l - 1] + ", ");
            if (l % 25 == 0) {
                System.out.println();
            }
        }
        }

    public static void notdivisible() {
        // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

        int count_notdivisible = 1;
        for (int j = Short.MIN_VALUE; j < i; j ++){
            if (j % n != 0){
                count_notdivisible ++;
            }
        }
        int m1[] = new int[count_notdivisible];
        int count = 0;
        for (int k = Short.MIN_VALUE; k < i; k++) {
            if (k % n != 0) {
                m1[count] = k;
                count++;
            }
        }
        System.out.print("Числа НЕ кратные старшему значащему биту: \n[");
        for (int l = 1; l < m1.length ; l++) {
            if (l == m1.length - 1) {
                System.out.println(m1[l - 1] + "]");
                break;
            }
            System.out.print(m1[l - 1] + ", ");
            if (l % 25 == 0) {
                System.out.println();
            }
        }
    }

    }



