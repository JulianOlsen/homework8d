package homework8d;

import java.util.Scanner;

public class Homework8d {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
        if (n==1)
        {
            for (int i = 0; i < 20; i++) 
            {
            System.out.println("*-*-*-*-*");
            System.out.println("| | | | |");
            }
        }
        else if (n==2)
        {
            for (int i = 0; i < 20; i++) 
            {
            int y=1;
            System.out.println("*");
            y=y+1;
            }
        }
        else
        {
            for (int i = 0; i < 20; i++) 
            {
            
            }
        }
    }
} 
