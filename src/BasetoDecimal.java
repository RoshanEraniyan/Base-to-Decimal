import java.util.*;
class Solution
{
    public void decimal(int number,int base)
    {
        int decimalnumber=0;
        int i=0;
        while(number>0)
        {
            decimalnumber+=(number%10)*(Math.pow(base,i));
            number/=10;
            i++;
        }
        System.out.println(decimalnumber);
    }
}

class Decimal
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int base = scanner.nextInt();
        Solution solution =new Solution();
        solution.decimal(number,base);
    }
}
