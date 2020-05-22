// Prime number generator

public class PrimeNumbers {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            String output = "";
            int divisors = 0;
            for (int j = 1; j <= i; j++)
                if (i % j == 0) {
                    divisors++;
                }
            if (divisors == 2) {
                output = Integer.toString(i);
                System.out.println(output);
            }
        }
    }
}


// works but hard coded in for 1 and 2

// public static void main(String[] args) {

//     for (int i = 1; i <= 100; i++) {
//         String output = "";
//         if (i == 1) {
//             output = "not prime";
//         }
//         if (i == 2) {
//             output = Integer.toString(i);
//         }
//         for (int j = 2; j < i; j++)
//             if (i % j == 0) {
//                 output = "not prime";
//                 break;
//             }
//             else {
//                 output = Integer.toString(i);
//             }
//         if (output != "not prime") {
//             System.out.println(output);
//         }

//     }
// }



// Doesn't display 1 or 2 but works for rest

// public static void main(String[] args) {

//     for (int i = 1; i <= 100; i++) {
//         String output = "";
//         for (int j = 2; j < i; j++)
//             if (i % j == 0) {
//                 output = "not prime";
//                 break;
//             }
//             else {
//                 output = Integer.toString(i);
//             }
//             System.out.println(output);
//     }
// }



// only works for primes past 7

// public static void main(String[] args) {

//     for (int i = 1; i <= 100; i++) {
//         String output = "";
//         if (i % 2 == 0 || i % 3 == 0 || i % 4 == 0 || i % 5 == 0 || i % 6 == 0 || i % 7 == 0 || i % 8 == 0 || i % 9 == 0) {
//             output = "not prime";
//         }
//         else {
//             output += i;
//         }
//         System.out.println(output);
//     }
// }