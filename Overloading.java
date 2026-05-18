import java.lang.*;
import java.util.*;

class Calculator
{

public int addition(int a, int b)
{
    return a + b;
}

public int addition(int a, int b, int c)
{
    return a*b*c;
}
}

public class Overloading
{
public static void main(String[] arg)
{
Calculator calc = new Calculator();
System.out.println(calc.addition(2,3));
System.out.println(calc.addition(2,3,4));
}
}
