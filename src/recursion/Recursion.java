package recursion;

public class Recursion {

    public static void printNumbers(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }
    public static int sumNumbers(int n){
        if (n == 0){
            return 0;
        }

        int insideSum = sumNumbers(n-1);
        int sum = n + insideSum;
        return sum;
    }
    public static int power(int x, int n){
        if (n == 0){
            return 1;
        }

        return x * power(x, n-1);
    }

    public static int sumArray(int[] numbers, int index){
        if (index == numbers.length) {
            return 0;
        }

        return numbers[index] + sumArray(numbers, index + 1);
    }

    public static void printAscending(int n){
        if (n == 0){
            return;
        }

        printAscending(n-1);
        System.out.println(n);
    }

    public static int sumOfDigits(int n){
        if (n == 0){
            return 0;
        }

        return (n % 10) + sumOfDigits(n/10);

    }

    public static String reverseString(String s){
        if (s.length() == 0){
            return "";
        }

        String reversed = reverseString(s.substring(1));

        return reversed + s.charAt(0);
    }

    public static boolean isPalindrome(String s){

        if (s.length() <= 1){
            return true;
        }

        if (s.charAt(0) != s.charAt(s.length() - 1)){
            return false;
        }
        return isPalindrome(s.substring(1,s.length() - 1));
    }

    public static int findFactorial(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        int factorialOfN = n * findFactorial(n-1);;
        return factorialOfN;
    }

    public static void fibonacci(int i, int j, int n){
        if (n == 0){
            return;
        }
        int a = i + j;
        System.out.println(a);
        fibonacci(j, a, n-1);
    }

    public static int powerOfN(int x, int n){
        if (n == 0) {
            return 1;
        }
        if (x == 0){
            return 0;
        }
        int powerNumber = x * powerOfN(x, n-1);
        return powerNumber;
    }

    public static int findMax(int[] numbers, int index){
        if (index == numbers.length) {
            return Integer.MIN_VALUE;
        }

        return Math.max(numbers[index], findMax(numbers, index + 1));
    }




    public static void main(String[] args) {
//        int i = 0;
//        int j = 1;
//        int n = 7;
//
//        System.out.println(findFactorial(n));
//        System.out.println(i);
//        System.out.println(j);
//        fibonacci(i, j, n-2);
//
//
//        System.out.println(powerOfN(2,5));

//        printNumbers(5);
//        System.out.println(power(5,2));
        System.out.println(reverseString("Java"));
//        printAscending(5);

    }

}
