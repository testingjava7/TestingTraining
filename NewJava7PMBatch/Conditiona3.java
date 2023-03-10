class Conditiona3
{


public static void main(String[] args)
{
//conditional statments
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter day");
int a=scn.nextInt();
//switch case
switch(a)
{
    case 1:
          System.out.println("Monday");
          break;
    case 2:
          System.out.println("Tuesday");
          break;
    case 3:
          System.out.println("Wednesday");
           break;
    case 4:
          System.out.println("Thursday");
            break;
    case 5:
          System.out.println("Friday");
            break;
    case 6:
          System.out.println("saturday");
           break;
    case 7:
          System.out.println("Sunday");
             break;
     default:
          System.out.println("invalid input");
             
  }
}
}