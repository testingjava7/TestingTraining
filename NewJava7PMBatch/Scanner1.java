class Scanner1
{
public static void main(String[] args)
{
 java.util.Scanner scn=new java.util.Scanner(System.in);
    System.out.println("Enter the number");
int a=scn.nextInt();
System.out.println("Enter Your Name");
   char n=scn.next().charAt(0);
//int b=scn.nextBoolean();
//int c=scn.nextDouble();
//int d=scn.nextLong();



System.out.println("a="+a);
System.out.println("Your name starts with "+n);

}

}
