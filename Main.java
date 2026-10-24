import java.util.Scanner;

class Main{

    static String[] history = new String[5];
    static int count = 0;

    static void deposit(double balance, double amount){
        balance += amount; 
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);

        if (count<5){
            history[count] = "Deposited: " + amount;
            count++;
        }
    }
    static void withdraw(double balance, double amount){
        if(amount > balance){
            System.out.println("Insufficient funds.");
        }
        else{
            balance -= amount; 
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        }
        if (count<5){
            history[count] = "Withdrawn: " + amount;
            count++;
        }
    }


    public static void main(String[] args){

        String name; 
        int Break=0;
        int pin=7342; 
        double balance=1000; 
        System.out.print("Enter Pin: ");
        Scanner sc = new Scanner(System.in); 
        pin = sc.nextInt(); 
        if(pin==7342){

            System.out.println("PIN is correct.");
            while(true){
                System.out.println("1.Check balance");
                System.out.println("2.Deposit");
                System.out.println("3.Withdraw");
                System.out.println("4.Exit"); 
                System.out.println("5. Mini Statement");  
                System.out.print("Choose");

                int choice = sc.nextInt();

                switch(choice){
                    case 1: 
                    System.out.println("Current Balance: " + balance);
                    break; 
                    case 2: 
                    System.out.print("Enter amount to deposit: ");
                    double amount = sc.nextDouble();
                    deposit(balance, amount);
                    break;
                    case 3: 
                    System.out.print("Enter amount to withdraw: ");
                    double amount1 = sc.nextDouble();
                    withdraw(balance, amount1);
                    break;
                    case 4:
                        Break=1;
                        break;
                    case 5: 
                        System.out.println("Mini Statement:");
                        for (int i = 0; i < count; i++) {
                            System.out.println(history[i]);
                        }
                        break;

                    default:
                        System.out.println("Invalid choice.");
                        break;
                    
                    
                }
                if (Break==1){
                    break;
                }
                
            
            


            }

        }
        else{
            System.out.println("Invalid PIN");
        }

        



        

    }
}