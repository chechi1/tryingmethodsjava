import java.util.Scanner;

public class TryingMethods { //This method is about tracking attendance in the workplace//
    public static void main(String[] args) {
        TryingMethods firstDynamicSwitch = new TryingMethods();
        firstDynamicSwitch.weekDays();

        TryingMethods newIfStatement = new TryingMethods();
        newIfStatement.ifStatement(10);

        System.out.println("Sum of numbers less than 1000");
        whileLoop();

        System.out.println("Even numbers between 12 and 103");
        forLoop();
    
      

       

    }
    public void weekDays(){
        int n;
        System.out.println("Input the code for the day");
        try (Scanner r = new Scanner(System.in)) {
            n=r.nextInt();
        }
        switch (n) 
        {
            case 1: System.out.println("Sunday");
            break;
            case 2: System.out.println("Monday");
            break;
            case 3: System.out.println("Tuesday");
            break;
            case 4: System.out.println("Wednesday");
            break;
            case 5: System.out.println("Thursday");
            break;
            case 6: System.out.println("Friday");
            break;
            case 7: System.out.println("Saturday");
            break;
            default:System.out.println("Invalid,Please try again");
        
            
        }
    }

    public void ifStatement(int attendance){
    int workedEveryday = 5;
    int missedWork = 0;

    if (attendance >= workedEveryday) {
        System.out.println("Congratulations! Employee of the week");
        
    } else if (attendance == workedEveryday){
        System.out.println("we appreciate your efforts");
        
    } else if (attendance <= missedWork){
        System.out.println("Please see HR");
        
    } else {
        System.out.println("Please confirm your attendance");
    }
    
    }

    public static void whileLoop() {
        int a = 1000;
        int sum = 0;
        int i = 1;
        while (i <= a){
            sum = sum + i;
            i++;
            
        }
        System.out.println("Sum =" + sum);
        
        
        
    }
    public static void forLoop() {
        for (int even=12; even <= 103; even ++){

            if (even % 2 ==0) {
                System.out.println(even);
                
            }
        }
    }
}
