import java.util.Scanner;
class NumCamparsion1{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int num1 = scan.nextInt();
int num2 = scan.nextInt();
if (num1>num2)
System.out.print(num1 + " is greater");
else
System.out.print(num2 + " is greater");
}
}