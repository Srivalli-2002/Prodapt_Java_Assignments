package numberassignement;

public class Number {
    
    public int checkPrime(int x) {
        if (x <= 1) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public boolean checkArmstrong(int x) {
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = x;
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }
        originalNumber = x;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }
        return result == x;
    }

    public boolean checkPalindrome(int x) {
        int reversedNum = 0;
        int originalNum = x;
        while (originalNum != 0) {
            int remainder = originalNum % 10;
            reversedNum = reversedNum * 10 + remainder;
            originalNum /= 10;
        }
        return x == reversedNum;
    }
}

