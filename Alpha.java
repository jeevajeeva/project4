# project4
import java.io.*;
import java.util.*;
public class Alpha
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch;
System.out.println("Enter the char");
 ch = sc.next().charAt(0);
if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
{
System.out.println("char is Alpha");
}
else
{
System.out.println("char is not a Alpha");
}
}
}
