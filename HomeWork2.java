/**
 *Java 1. Home Work #2
 *
 *@author Yana
 *@version 13/02/2022
 */
public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(checkSumSign(8, 13)? "true" : "false");
        isPositiveOrNegative();
        System.out.println(isPositive(5)? "true" : "false");
        printWordNTimes("word", 5);
    }    
    
    static boolean checkSumSign(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }
    
    static void isPositiveOrNegative() {     
        int a = -3;
        System.out.println(a >= 0? "The number is positive" : "The number is negative");
    }
    
    static boolean isPositive(int a) {
        return a <= 0;
    }
    
    static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {  
        System.out.println("word");
        }
    }
}