import java.util.*;
class convertor1
{
    double F,C;
    void F2C(double F)
    {
        this.F=F;
        C=((F-32)*5)/9;
        System.out.println("Respected Celsius is:"+C);

    }
    void C2F(double C)
    {
        this.C=C;
        F=((C*9)/5)+32;
        System.out.println("Respected Farenheit is:"+F);
    }
}
public class TemperatureConvertor 
{
    public static void main(String[] args) 
    {
        int choice,n=2;
        convertor1 obj =new convertor1();
        Scanner in=new Scanner(System.in);
        while(n>1)
        {
        System.out.println("----------------Temperature Convertor-----------------");
        System.out.println("choice 1: Fahrenheit to Celsius");
        System.out.println("choice 2: Celsius to Fahrenheit");
        System.out.println("choice 3: Exit ");
        System.out.println("------------------------------------------------------");
        System.out.println("Select choice 1 or 2 or 3:");
        choice =in.nextInt();
        switch (choice) {
            case 1:
            System.out.print("Enter Fahrenheit:");
            double Fahrenheit=in.nextDouble();
                obj.F2C(Fahrenheit);
                break;
            case 2:
            System.out.print("Enter Celsius:");
            double Celsius=in.nextDouble();
                obj.C2F(Celsius);
                break;
            case 3:
            --n;
            break;
            default:
            System.out.print("Invalid Option");
                break;
        }
    }

        
    }
    
}
