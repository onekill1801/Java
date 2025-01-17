package Others;

/**
 * This is Euclid's algorithm which is used to find the greatest common denominator
 * Overide function name gcd
 *
 * @author Oskar Enmalm 3/10/17
 */
public class GCD {

    public static int gcd(int num1, int num2) {

        if (num1 == 0)
            return num2;

        while (num2 != 0) {
            if (num1 > num2)
                num1 -= num2;
            else
                num2 -= num1;
        }

        return num1;
    }

    public static int gcd(int[] number) {
        int result = number[0];
        for (int i = 1; i < number.length; i++){
            // call gcd function (input two value)
            // result = gcd(result, number[i]);
            int num1 = result;
            int num2= number[i];
            if (num1 == 0)
                return num2;

            while (num2 != 0) {
                if (num1 > num2)
                    num1 -= num2;
                else
                    num2 -= num1;
            }
            result = num1;
        }

        return result;
    }

    public static void main(String[] args) {
        // int[] myIntArray = {4, 16, 32};
        int[] myIntArray = {3,7};

        // call gcd function (input array)
        System.out.println(gcd(myIntArray)); // => 4
        System.out.printf("gcd(40,24)=%d gcd(24,40)=%d\n", gcd(16, 4), gcd(24, 40)); // => 8
    }
}
