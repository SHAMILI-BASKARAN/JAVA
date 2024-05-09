import java.util.Scanner;
class Calc{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("1.Addition 2.Subtraction");
int choice = scan.nextInt();
switch(choice){
case 1:
int n1 = 100;
int n2 = 220;
int sum = n1 + n2;
System.out.println(sum);
break;
default:
System.out.println("Invalid input");
}
}
}