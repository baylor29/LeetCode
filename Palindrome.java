public class Palindrome {

    public static void main(String[] args) {



        //System.out.println(isPalindrome(121));
        System.out.print(isPalindromeNonString(1234));
    }


    public static boolean isPalindrome(int x) {


        String a = Integer.toString(x);

        for (int i = 0; i < a.length() / 2; i++) {
            if (a.charAt(i) == a.charAt(a.length() - (i + 1))) {
                continue;
            }
            else return false;
        }
        return true;

    }

    public static boolean isPalindromeNonString(int x) {

        if (x<0){
            return false;
        }

        int y = x;
        int z = 0;
        while (y != 0) {

            int a = y % 10;
            y = y / 10;
            z = z *10 + a;


        }

        if (x == z){
            return true;
        }
        return false;

    }
    }


