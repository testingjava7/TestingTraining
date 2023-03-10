class mainoverload
{


public static void main(String[] args)
{
main("This main is with string arg");
main();
}


public static void main(String args)
{
System.out.println("Main with string args");
}
public static void main()
{

System.out.println("Main without any args");
}
}
