class Method3
{
//Methods 
//Syntax
   //  Method with params
    public static int Add(int i,int j)
{

return i+j;
}

public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter 1st number");
int a=scn.nextInt();
System.out.println("Enter 2nd number");
int b=scn.nextInt();
int n=Add(a,b);
System.out.println("Total sum is "+n);

}
}