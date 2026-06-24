package za.co.wethinkcode;

public class Fundamentals {

    // ============================
    // TODO: Question 1
    // ============================

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // ============================
    // TODO: Question 2
    // ============================


    public static int sumArray(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }

    // ============================
    // TODO: Question 3
    // ============================


    public static String categoriseScore(int score) {
        if (score < 0 || score > 100) {
            return "Invalid";
        } else if (  score >= 90 && score <= 100) {
            return "Distinction";
        } else if ( score >= 75 && score <= 89) {
            return "Merit";
        } else if (  score >= 50 && score <= 74   ) {
            return "Pass";
        } else {
            return  "Fail"        ;
        }
    }
//
    // ============================
    // TODO: Question 4
    // ============================


    public static int countVowels(String s) {
        if (s == null || s.isEmpty()) return 0;
        String vowels = "aeiouAEIOU";
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                total++;
            }
        }
        return total;
    }


    
}
