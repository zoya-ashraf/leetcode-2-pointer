import java.util.Scanner;

public class Reverse {
    boolean isvowel(char c)
    {
        return "aeiouAEIOU".indexOf(c)!=-1; 
    }
    public String reverseVowels(String s) {
        int l=0,r=s.length()-1;
        char c[] = s.toCharArray();
        while(l<r)
        {
            while(!(isvowel(s.charAt(l))) && l<r)
            {
                l++;
            }
            while(!(isvowel(s.charAt(r))) && l<r)
            {
                r--;
            }
            char temp = c[l];
            c[l] = c[r];
            c[r] = temp;
            l++;
            r--;
        }
        return new String(c);
    }
    void display(String s)
    {
      for(int i = 0;i<s.length();i++)
      {
        System.out.print(s.charAt(i));
      }
    }
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a string :  ");
      String s = in.nextLine();
      System.out.print("\nBefore reversing : ");
      Reverse obj = new Reverse();
      obj.display(s);
      System.out.print("\nAfter Reversing : ");
      obj.display(obj.reverseVowels(s));
    }
}