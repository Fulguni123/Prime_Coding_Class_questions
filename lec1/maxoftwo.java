//Find the maximum of two numbers

import java.util.Scanner;
class maxoftwo{

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    if(x>y){
        System.out.println("X is greater");
    }
    else{
        System.out.println("Y is greater");
    }
    sc.close();
    }
}