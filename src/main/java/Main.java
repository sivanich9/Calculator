import java.util.Scanner;
import java.lang.Math;

public class Main
{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Main calculator = new Main();
        while(true)
        {
            int choice;
            System.out.println();
            System.out.println(ANSI_PURPLE+"Choose one of the following operations"+ANSI_RESET);
            System.out.println();
            System.out.println(ANSI_CYAN+"1. Square root function - √x"+ANSI_RESET);
            System.out.println(ANSI_CYAN+"2. Factorial function - x!"+ANSI_RESET);
            System.out.println(ANSI_CYAN+"3. Natural logarithm (base е) - ln(x)"+ANSI_RESET);
            System.out.println(ANSI_CYAN+"4. Power function - x^b"+ANSI_RESET);
            System.out.println(ANSI_CYAN+"5. Quit"+ANSI_RESET);
            System.out.println();
            choice = sc.nextInt();
            double number;
            switch(choice)
            {
                case 1:
                    System.out.println();
                    System.out.println(ANSI_GREEN+"You have chosen the operation 'Square root'"+ANSI_RESET);
                    System.out.println();
                    System.out.println(ANSI_YELLOW+"Enter the number"+ANSI_RESET);
                    number = sc.nextDouble();
                    System.out.println();
                    System.out.println(ANSI_BLUE+"Square root of "+number+" is "+calculator.square_root(number)+ANSI_RESET);
                    System.out.println();
                    break;

                case 2:
                    System.out.println();
                    //double number;
                    System.out.println(ANSI_GREEN+"You have chosen the operation 'Factorial'"+ANSI_RESET);
                    System.out.println();
                    System.out.println(ANSI_YELLOW+"Enter the number"+ANSI_RESET);
                    number = sc.nextDouble();
                    System.out.println();
                    System.out.println(ANSI_BLUE+"Factorial of "+number+" is "+calculator.factorial(number)+ANSI_RESET);
                    System.out.println();
                    break;

                case 3:
                    System.out.println();
                    //double number;
                    System.out.println(ANSI_GREEN+"You have chosen the operation 'Natural logarithm'"+ANSI_RESET);
                    System.out.println();
                    System.out.println(ANSI_YELLOW+"Enter the number"+ANSI_RESET);
                    number = sc.nextDouble();
                    System.out.println();
                    System.out.println(ANSI_BLUE+"Natural logarithm of "+number+" is "+calculator.natural_logarithm(number)+ANSI_RESET);
                    System.out.println();
                    break;

                case 4:
                    System.out.println();
                    System.out.println(ANSI_GREEN+"You have chosen the operation 'Power'"+ANSI_RESET);
                    System.out.println();
                    double base,exponent;
                    System.out.println(ANSI_YELLOW+"Enter base"+ANSI_RESET);
                    base = sc.nextDouble();
                    System.out.println(ANSI_YELLOW+"Enter exponent"+ANSI_RESET);
                    exponent = sc.nextDouble();
                    System.out.println();
                    System.out.println(ANSI_BLUE+exponent+"th power of "+base+" is "+calculator.power(base,exponent)+ANSI_RESET);
                    System.out.println();
                    break;

                case 5:
                    System.out.println();
                    System.out.println(ANSI_GREEN+"You have chosen the operation 'Quit'"+ANSI_RESET);
                    System.out.println();
                    return;
                default :
                    System.out.println();
                    System.out.println(ANSI_RED+"Please enter the valid number among 1-5"+ANSI_RESET);
                    System.out.println();
                    break;
            }
        }
    }

    public double square_root(double number)
    {
        try
        {
            if(number < 0)
            {
                throw new IllegalArgumentException(ANSI_RED+"Cannot calculate square root of negative number"+ANSI_RESET);
            }
            return Math.sqrt(number);
        }
        catch (IllegalArgumentException e)
        {
            System.err.println(e.getMessage());
            return Double.NaN;
        }
    }

    public double factorial(double number)
    {
        try
        {
            if (number < 0)
            {
                throw new IllegalArgumentException(ANSI_RED+"Factorial is undefined for negative numbers"+ANSI_RESET);
            }
            double result = 1;
            for (int i = 1; i <= number; i++)
            {
                result *= i;
            }
            return result;
        }
        catch (IllegalArgumentException e)
        {
            System.err.println(e.getMessage());
            return Double.NaN;
        }
    }

    public double natural_logarithm(double number)
    {
        try
        {
            if (number < 0 || number == 0)
            {
                throw new IllegalArgumentException(ANSI_RED+"Natural logarithm is undefined for zero and negative numbers"+ANSI_RESET);
            }
            double result = Math.log(number);
            return result;
        }
        catch (IllegalArgumentException e)
        {
            System.err.println(e.getMessage());
            return Double.NaN;
        }
    }

    public double power(double base,double exponent)
    {
        try
        {
            if (base == 0 && exponent < 0)
            {
                throw new IllegalArgumentException(ANSI_RED+"Cannot calculate power of zero with negative exponent"+ANSI_RESET);
            }
            double result = Math.pow(base, exponent);
            return result;
        }
        catch (IllegalArgumentException e)
        {
            System.err.println(e.getMessage());
            return Double.NaN;
        }
    }

}
