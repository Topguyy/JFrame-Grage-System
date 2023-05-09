 package garage.system;
import java.util.ArrayList;
import java.util.Scanner;
public class GarageSystem {

   public static Scanner input= new Scanner(System.in);
public static ArrayList <SystemAdmin> adminArr =new ArrayList<SystemAdmin>();
public static ArrayList <Car> CarArr =new ArrayList< Car>();
   
    public static void main(String[] args) {
        int choice;
        boolean bool=true;
       
        while(bool){
        System.out.println("*welcome to Garage System*");
        System.out.println("*Main Menu*!!\n(1) for register\n(2) for login\n(3) for Exit");
        try {
             choice =input.nextInt();
             
                
            } catch (Exception e) {
                
                System.out.println("Enter a number!!!");
                
                continue;
                
            }
        
        switch(choice){
            case 1:
                AdminRegister();
                break;
            case 2:
                AdminLogin();
                break;
            case 3:
                bool=false;
                System.out.println("thank you!!");
                break;
            default:
                    System.out.println("Wrong input");
        }
      }
       
    }
    public static void AdminRegister(){
      boolean bool=true;
      long ID=0;
      while(bool==true){
      System.out.println("enter your ID");
      ID=input.nextLong();
      
      if(adminArr.isEmpty()!=true)
      {
       for(int i=0;i<adminArr.size();i++){
            if(adminArr.get(i).getID()==ID){
                bool=true;
                break;
                }
       else{
               bool=false;
               
               }
            
      }   
       if(bool==true)
                System.out.println("this ID alraedy registed");
      }
      else
          bool=false;
      }
      System.out.println("create your password");
      String password=input.nextLine();
      password=input.nextLine();
      
      System.out.println("enter your name");
      String name=input.nextLine();
      
      
      System.out.println("enter your Phone number");
      long PhoneNumber=input.nextLong();
      
      
      SystemAdmin s=new SystemAdmin(name, password, ID, PhoneNumber);
      adminArr.add(s);
      int UserId =adminArr.size() - 1 +2000;
      s.setUserID(UserId);
      System.out.println("your user ID is "+s.getUserID());
  }
    
    public static void AdminLogin(){
    boolean found=false;
    int numinarr=-1;
    boolean bool=true;
    while(bool==true){
    System.out.println("enter your user ID");
    long userID=input.nextLong();
    System.out.println("enter your password");
    String password=input.nextLine();
     password=input.nextLine();
      
    System.out.println("(0) for back \n(1) for continue ");
    int ch=input.nextInt();
    input.nextLine();
    if(ch==0){
        bool=false;
        continue;
    }
    for(int i=0;i<adminArr.size();i++){
        if(adminArr.get(i).getUserID()==userID){
            if(adminArr.get(i).getPassword().compareTo(password)==0){
                numinarr=i; 
                found=true;
                break;
            }
    }
        
    
    }
    if(found==true)
    {
        boolean b=true;
        while(b==true){
        System.out.println("(1)for get systemAdmin info\n(2) for add car\n"
                + "(3) for search car \n(4) for remove car \n (5) for exit");
        int c=input.nextInt();
        input.nextLine();
        switch(c){
            case 1:
                System.out.println(adminArr.get(numinarr).toString());
                break;
            case 2:
                addcar();
                break;
            case 3:
                searchcar();
                break;
            case 4:
                removecar();
                break;
            case 5:
                b=false;
                bool=false;
                break;
            default:System.out.println("worng input");
        }
        }
    }else{
        System.out.println("wrong ID or password");
    }
    }
  }
      public static void removecar(){
          boolean bool=true;
      String platenumber="";
      
            System.out.println("enter the platenumber of the car  ");
      platenumber=input.nextLine();
      
      if(CarArr.isEmpty()!=true)
      {
          int index =0 ;
       for(int i=0;i<CarArr.size();i++){
            if(CarArr.get(i).getPlateNumber().compareTo(platenumber)==0){
                bool=true;
                 index =i;
                 break;
                }
       else{
               bool=false;
               
               }
            
      }   
       if(bool==true){
                System.out.println("car removed  ");
       CarArr.remove(index);
      }else{
          System.out.println("car not found on the system  ");
            
       }
      }else
              System.out.println("there is no cars in the garage   ");
          
      }
    
    
    
    public static void searchcar(){
         boolean bool=true;
      String platenumber="";
      
            System.out.println("enter the platenumber of the car ");
      platenumber=input.nextLine();
      
      if(CarArr.isEmpty()!=true)
      {
          int index =0 ;
       for(int i=0;i<CarArr.size();i++){
            if(CarArr.get(i).getPlateNumber().compareTo(platenumber)==0){
                bool=true;
                 index =i;
                 break;
                }
       else{
               bool=false;
               
               }
            
      }   
       if(bool==true){
                System.out.println("car found ");
       System.out.println(CarArr.get(index).toString());
      }else{
          System.out.println("car not found ");
          
      }
      }else{
              System.out.println("there is no cars in the garage ");
          
      }
    } 
    public static void addcar(){
              boolean bool=true;
      String platenumber="";
      while(bool==true){
      System.out.println("enter the platenumber of the car ");
      platenumber=input.nextLine();
      
      if(CarArr.isEmpty()!=true)
      {
       for(int i=0;i<CarArr.size();i++){
            if(CarArr.get(i).getPlateNumber().compareTo(platenumber)==0){
                bool=true;
                break;
                }
       else{
               bool=false;
               
               }
            
      }   
       if(bool==true)
                System.out.println("this car is already added ");
      }
      else
          bool=false;
      }
     
      
      System.out.println("enter the name of the car owner ");
      String name=input.nextLine();
      
      System.out.println("please choose the subscription \n (1) for daily \n (2) weekly \n (3) monthly \n (4)  3-6 -monthly  ");
      int choice=input.nextInt();
      String subscription = null;
       boolean b;
     // while(b=true){
      switch(choice){
          case 1 : 
                subscription ="daily";
                b=false;
                break;
          case 2 :
                subscription ="weekly";
                b=false;
                break;
          case 3:
                subscription ="monthly"; 
                b=false;
                break;
          case 4: 
                subscription ="3-6 -monthly";
                b=false;
                break;
          default:     
                System.out.println("wrong input");
                break;
                
      }
    //}
      System.out.println("press 1 if the subscription vip \n press 2 if not   ");
      int v =input.nextInt();
           boolean j=true;
           boolean isvip = false ;
     // while(j=true){
      switch(v){
          case 1 : 
                isvip =true;
                j=false;
                break;
          case 2 :
                isvip =false;
                j=false;
                break;
     
          default:     
                System.out.println("wrong input");
                
      }
      
      
      
      Car c=new Car(platenumber, name,subscription ,  isvip);
      CarArr.add(c);
    }
}