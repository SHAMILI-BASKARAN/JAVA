import java.util.Scanner;
class Divisible{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("enter a number:");
int n = scan.nextInt();
int y=1;
for (;y<=n;){
if(y%5==0)
System.out.println(y);
y++;
}
}
}