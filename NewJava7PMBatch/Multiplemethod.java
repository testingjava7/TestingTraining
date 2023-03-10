class Multiplemethod
{

   //Method Overloading in java
    public static int Add(int i,int j)
{

    return i+j;
}
 public static int Add(int i,int j,int k)
{

    return i+j+k;
}
   public static double Add(double i,double j)
{

    return i+j;
}
  
public static void main(String[] args)
{
System.out.println(Add(45.65,83.92));
System.out.println(Add(3,6,8));
}
}