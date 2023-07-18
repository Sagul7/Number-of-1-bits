import java.util.Scanner;

public class NumberOf1bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc .nextInt();
        System.out.println(numOf1bits(num));
    }
    public static int numOf1bits(int num)
    {
        int count = 0;
        while(num!=0)
        {
            if((num & 1)==1)
            {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
}
/*
Write a function that takes an integer and returns the number of 1 bits present in its binary representation.
Input
11
Output
3

apporch :
 num & 1 = 1011 & 1 ..so count++;
 num >> 1 = 101 & 1...so count++;
 num >> 1 = 10 & 1 =0..no count increase
 num >> 1  = 1 & 1 ...so count++;
 1>>1==0
 op = 3

 */
