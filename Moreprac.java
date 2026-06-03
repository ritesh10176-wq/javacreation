import java.util.Scanner;

 public class Moreprac {
   static Scanner store = new Scanner(System.in); 
   public static void main(String [] args){
        System.out.println("Q1-> Largest of Three Numbers .\nTake three numbers as input and find the largest among them.");
        System.out.println( findlargestof3() +" is the largest among them \n\n");
        System.out.println("Q2-> Leap Year Checker .\n Check whether a given year is a leap year or not.\r\n ");
        check_leap_year();
        System.out.println("3. Grade Calculator .\n Input marks of 5 subjects and calculate percentage.\r\n" );
        gradecalc();
        System.out.println("4. Positive, Negative, or Zero \n Determine whether a number is positive, negative, or zero.\n");
        pn0checker();
        System.out.println("5. Even/Odd and Divisible by 5 ,\n Check whether a number is : Even or Odd ,Divisible by 5 or not \n");
        check_even_odd_div5();
        System.out.println("6. Valid Triangle Checker ,\n Input three angles and check whether they can form a valid triangle.\n");
        System.out.println("Enter three angle of triangels respectively \n");
        float angle1=inputi();
        float angle2= inputi();
        float angle3=inputi(); 
        validtriangle(angle1,angle2,angle3);
        System.out.println("7. Triangle Type Finder Input three sides and determine whether the triangle is : Equilateral, Isosceles, Scalene\n");
        angle1 = inputi();
        angle2 = inputi();
        angle3 = inputi();
        find_trinagle_type(angle1, angle2, angle3);
        System.out.println("8. Electricity Bill Calculator ,\nCalculate electricity bill based on units consumed\n");
        System.out.println("Enter Units consumed ");
        int eunits=inputi();
        electricity_bill(eunits);
        System.out.println("9. ATM Withdrawal System \nInput balance or amount withdrawal\n");
        atmsystem();
        System.out.println("10. Number Classification ,\nCheck whether a number is: Positive Even Divisible by both 3 and 5\n");
        numberclassification();
        System.out.println("11. Simple Calculator Input two numbers and an operator (+, -, *, /, %). Perform the corresponding operation.\n");
        simplecalc();
        System.out.println("12. Eligibility for Placement ");
        placement_eligibility();
        System.out.println("13. Income Tax Calculator ,\nCalculates tax based on annual income\r\n");
        itaxcalc();
        System.out.println("14. Quadratic Equation Nature ,\nInput coefficient a, b, c. Finds whether roots are : Real and distinct, Real and equal, Imaginary\n");
        int coeff1 = inputi();
        int coeff2 = inputi();
        int coeff3 = inputi();
        quadratic_nature(coeff1,coeff2,coeff3);
        System.out.println("15. Login Authentication System ,\n Input username and password. Checks :Username , Password \nwhen Both correct, Display appropriate messages. \n");
        login_authentication();
      }





 public static int inputi(){
   System.out.println("Enter required data : ");
   int temp = store.nextInt();   
   return temp;
 }

 public static int findlargestof3(){
 System.out.println("This method finds the largest number of 3 inputs \n");
 System.out.println("Enter 1st number, 2nd number ,3rd number respectively \n");
 int num1 = store.nextInt();
 int num2 = store.nextInt();
 int num3 = store.nextInt();

 int largest = num1>num2? num1>num3?num1:num3 : num2>num3?num2:num3 ;
 return largest; 
  } 

  public static void check_leap_year(){
   int year = inputi();
   if(year%400==0||(year%4==0&&year%100!=0))System.out.println(year + "is a leap year\n\n");
    else System.out.println("\n"+year+" is not a leap year\n\n");
  }

  public static void gradecalc(){
   int sum=0,i=0;
   while(i<5){
      
      System.out.println("Enter score in subject "+(i+1)+":");
      int temp = inputi();
      if(temp<0||temp>100){
         System.out.println("Invalid Input enter data again (0-100) ");
      }
      else{
      sum+=temp;
      i++;}
   }
   float fscore = (float)sum/500.0f * 100.0f;  // every digit need to be type casted to float if not than deciaml value are considered as double
   if(fscore<60&&fscore>=0)System.out.println("Obtained grade - F ");
   else if(fscore>=60&&fscore<70)System.out.println("Obtained grade - D ");
   else if(fscore>=70&&fscore<80)System.out.println("obtained grade - C ");
   else if(fscore>=80&&fscore<90)System.out.println("Obtained grade - B ");
   else if(fscore>=90&&fscore<=100)System.out.println("Obtained grade - A");
  System.out.println("\n\n");  
}
   public static void pn0checker(){
    int num = inputi();
    
    if(num>0) System.out.println("Number is positive\n\n");
    else if(num<0) System.out.println("Number is negative\n\n");
    else System.out.println("Number is 0 \n\n");

   }

   public static void check_even_odd_div5(){
      int num = inputi();
      if(num%2==0){
         System.out.println("Number is even\n");
          System.out.println("Number is not divisible by 5\n\n");
      }
         
      else {
         System.out.println("Number is odd\n\n");
         if(num%5==0)System.out.println("Number is also div by 5\n\n");
         else System.out.println("Number is not divisible by 5\n\n");
         
      }
   }
   public static  boolean validtriangle(float a, float b, float c){
     
      float anglesum=a+b+c;
      boolean valid =false;
      if(anglesum==180){
         System.out.println("Triangle is valid\n\n");
       return valid=true;
      }
      else System.out.println("Triangle is Invalid !\n\n"); 
      return valid;
   }
   public static void find_trinagle_type(float a , float b , float c){
      
      boolean possible =validtriangle(a,b,c);
      if (possible){
         if(a==b&&b==c)System.out.println("Triangel is Equilateral\n\n");
         else if(a==b&&b!=c||a==c&&c!=b||b==c&&b!=a)System.out.println( "Traingle is Isoceles\n\n");
         else System.out.println("Given traingle is scalene \n\n");

      }
   }
   public static int electricity_bill( int units ){
      if(units<=100&&units>0){
         System.out.println(" Electiric bill : "+(units*5)+"\n\n");
            return units*5 ;}
      else if(units>100&&units<=200){
            System.out.println("Electric bill : "+(units*7)+"\n\n");
            return units*7;} 
      else if(units>200){
         System.out.println("Electric bill : "+(units*10)+"\n\n");
            return units*10;}
            return 0;
}
public static void atmsystem(){
   boolean condition=true;
   int balance=0;
   while(condition){
   System.out.println("\nSelect an operation ,\n\n 1->Add balance to atm ,\n2->Amount widthdrawal\n 3->exit");
   int choice = inputi();
   boolean invalidamount=true; 
   
   switch(choice){  
             case 1:
               System.out.println("\nYou have choosen to add balance , Enter amount to proceed further \n"); 
            while(invalidamount){
               int add = inputi();
               if(add>0) {
               balance+=add;
               if(balance<1000) {System.out.println("Minimum balance should be greater than 1000\n");
                  balance-=add;
                  System.out.println("Transation failed\n");
                  invalidamount=false; 
               }else { 
                  System.out.println("Balance added successfully \n");
                  invalidamount=false;
                  if(add%100==0)System.out.println("Added amount is in perfect multiple of 100 \n");
               }
               }
               else {System.out.println("Invalid amount \n");
                invalidamount=false;
               }
               System.out.println("Total balance : "+balance+"\n\n");
            }
            
            break;

             case 2: int temp;
             System.out.println("you have choosen to withdraw ,\nEnter amount to be witdrawn\n");
             while(invalidamount){
             
               int withdraw=inputi();
               temp=balance-withdraw;
               if(withdraw>balance){System.out.println("Withdraw amount exceeds balance\n Transaction cancelled \n");invalidamount = false;}
               else if(withdraw<0) { System.out.println("Invalid amount \n Try enter value greater than '0'\n"); invalidamount = false; } 
               else if(temp<1000){System.out.println("Your balance after this transaction will lead balance less than 1000\nIf you continue extra fee will be livied at end of month \npress 1 to continue , or press 0 to leave transation  \n");
                  int ok = 1;
                  ok = inputi();
                  if(ok==1){
                     balance-=withdraw;
                     System.out.println("Amount withdrawn successfully \n");
                     invalidamount=false;
                  }
                  else {System.out.println("Transaction cancelled \n");
                     invalidamount=false;
                  }
               } 
               else { 
                  balance-=withdraw;
                  System.out.println("Amount withdrawn successfully \n");
                  invalidamount=false;
               }
               System.out.println("Total balance : "+balance+"\n\n");
            }
              
              break;
            
             case 3: System.out.println("Thank you for using ATM ($^$)\n\n");condition=false;break;
             default: System.out.println("Choose the correct option\n");
            }
      }  
    }
    public static void numberclassification(){
      int num = inputi();
      if(num>0)System.out.println("Entered number is positive\n");
      else if(num<0) System.out.println("Entered number is negative \n");
      if(num%3==0)System.out.println("Its also divisible by 3\n ");
      else System.out.println("Its not divisible by 3\n ");
      if(num%5==0)System.out.println("Its also divisible by 5 \n");
      else System.out.println("Its not divisible by 5\n ");
    }
    public static void simplecalc(){
      float num1,num2;
      String operator;
      boolean condition = true;
      while(condition){
         System.out.println("Choose operation '+' ,'-' ,'*' ,'/','%'  and choose 'e' to exit \n");
         System.out.println("number 1");
         num1 = store.nextInt();
         System.out.println("operation");
         operator = store.next();
         System.out.println("number 2");
         num2= store.nextInt();

         switch(operator){
            case "+" : System.out.println(num1+num2);break;
            case "-" : System.out.println(num1-num2);break;
            case "*" : System.out.println(num1*num2);break;
            case "/" : System.out.println(num1/num2);break;
            case "%" : System.out.println(num1%num2);break;
            case "e" : System.out.println("Exited program");condition=false;break;
            default  : System.out.println("!Invalid Input , please try again");
         }
        
      }
    }
    public static void placement_eligibility(){
    System.out.println("Enter your sgpa ");
    float sgpa = store.nextFloat();
    if(sgpa<7.0f)System.out.println("Ineligible for placements ");
    else {
      System.out.println("Please enter 1 if you have active backlogs ");
      int backlogs = inputi();
      if(backlogs==1f)System.out.println("Ineligible for placements ");
       else{
         System.out.println("Enter you attendance in precentage ");
         float attendance=inputi();
         if(attendance<75.0f)System.out.println("Ineligible for placements ");
          else System.out.println("Eligible for placements ");
       }
    }

    }
    public static void itaxcalc(){

      System.out.println("Enter your annual income in lakhs ");
      float income = store.nextFloat();
      if(income<=2.5)System.out.println(" No tax");
      else if(income>2.5&&income<=5)System.out.println("tax 5% \t tax Amount "+(income*5.0f/100));
      else if(income>5&&income<=10)System.out.println("tax 20% \t tax Amount "+(income*20.0f/100));
      else if(income>10)System.out.println("tax 30% \t tax Amount "+(income*30.0f/100));
    }

    public static void quadratic_nature(int a, int b , int c){
      float nature = 0;
      if(a!=0)
       nature = ((b*b)-(4*a*c));
      else System.out.println("Given equation is not quadratic"); 

      if(nature>0)System.out.println("Roots are Real and Distinct");
      else if(nature==0)System.out.println("Roots are Real and Equal");
      else System.out.println("Roots are Imaginary");

      System.out.println("\n\n");
    }
    public static void login_authentication(){
    System.out.print("Enter username :");
    String username = store.next();
    System.out.println("Enter userpassword");
    String password = store.next();
    System.out.println("Device is locked , message is hidden ");
    System.out.println("Enter username to unlock Device");
    String validater=store.next();
    if(username.equals(validater)){
    System.out.println("Enter password");
    validater=store.next();
    if(validater.equals(password))System.out.println("Device unlocked hidden message -> \"              \" what you expected thats why they say its hidden message -_- 0010101... \n" );
    else System.out.println("you have failed to enter correct password now face him ->     *--\\-_-/ ---*   \n"); 
   }
    else System.out.println("you have failed to enter correct username now face him ->     *--\\-_-/ ---*   \n"); 

    }

    
}