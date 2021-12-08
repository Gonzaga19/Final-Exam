import java.util.Scanner;


//rustom patino//
class Annual_Income{

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //variable declaration//
        Double rt;      //annual income//
        final int months=12;
        final int workdays=22;
        final int workhours=8;
        Double monthly;
        Double daily_rate;
        Double hourly_rate;

        //input statement//
        System.out.print("Your Annual Salary:");
        rt = keyboard.nextDouble();
        
        //solution phase1//
        monthly= rt/months;              System.out.println("Your Monthly Rate:                   " + String.format("%.2f", monthly));
        daily_rate=monthly/workdays;     System.out.println("Your Daily Rate:                     " + String.format("%.2f", daily_rate));
        hourly_rate=daily_rate/workhours;System.out.println("Your Hourly Rate:                    " + String.format("%.2f", hourly_rate));
        //solution phase2//  
        if (rt<250000){
    
            }
                    else if(rt >= 0 && rt <250000){    

                Double excesstax = rt ;
                Double tax_deduc=.0*excesstax+0;
                Double a=tax_deduc;  
                System.out.println("Your Annual Tax Deduction:           " + String.format("%.2f",a));       
                Double b=a/daily_rate;      
                System.out.println("Monthly Tax Deduction:               " + String.format("%.2f",b));    
                Double net_pay=monthly-b;
                System.out.println("Net Pay:                             " + String.format("%.2f",net_pay));
            }
            else if(rt>= 250000 && rt <400000){        

                Double excesstax = rt ;
                Double tax_deduc=0.20*excesstax+0;
                Double a=tax_deduc;   
                System.out.println("Your Annual Tax Deduction:           " + String.format("%.2f",a));      
                Double b=a/daily_rate;       
                System.out.println("Monthly Tax Deduction:               " + String.format("%.2f",b));  
                Double net_pay=monthly-b;
                System.out.println("Net Pay:                             " + String.format("%.2f",net_pay));
            }
            else if(rt >= 400000 && rt<800000){           
                Double excesstax = rt- 30000-400000;
                Double tax_deduc=30000+(excesstax*.25);
                Double a=tax_deduc;        
                System.out.println("Your Annual Tax Deduction:           " + String.format("%.2f",a));     
                Double b=a/daily_rate;     
                System.out.println("Monthly Tax Deduction:               " + String.format("%.2f",b));          
                Double net_pay=monthly-b;
                System.out.println("Net Pay:                             " + String.format("%.2f",net_pay));
            }
            else if(rt >= 800000 && rt <2000000){          
                Double excesstax = rt - 130000-800000;
                Double tax_deduc=130000+(excesstax*.30);
                Double a=tax_deduc;    
                System.out.println("Your Annual Tax Deduction:           " + String.format("%.2f",a));
                Double b=a/daily_rate;                   
                System.out.println("Monthly Tax Deduction:               " + String.format("%.2f",b));
                Double net_pay=monthly-b;
                System.out.println("Net Pay:                             " + String.format("%.2f",net_pay));    
            }
            else if(rt >= 2000000 && rt <8000000){          
                Double excesstax = rt - 490000-2000000;
                Double tax_deduc=490000+(excesstax*.32);
                Double a=tax_deduc;    
                System.out.println("Your Annual Tax Deduction:           " + String.format("%.2f",a));
                Double b=a/daily_rate;                       
                System.out.println("Monthly Tax Deduction:               " + String.format("%.2f",b));
                Double net_pay=monthly-b;
                System.out.println("Net Pay:                             " + String.format("%.2f",net_pay));      
            }
            else if(rt >= 8000000 && rt <10000000){         
                Double excesstax  = rt - 2410000-8000000;
                Double tax_deduc=2410000+(excesstax*.35);
                Double a=tax_deduc;
                System.out.println("Your Annual Tax Deduction:           " + String.format("%.2f",a));                    
                Double b=a/daily_rate; 
                System.out.println("Monthly Tax Deduction:               " + String.format("%.2f",b));
                Double net_pay=monthly-b;
                System.out.println("Net Pay:                             " + String.format("%.2f",net_pay));
            }
    }
}
