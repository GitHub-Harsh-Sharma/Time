import java.util.*;
class time
{
     public static void main(String[] args) 
    {
        int sec,hour,min;
        Scanner sr=new Scanner(System.in);
        System.out.print("Enter the time in second: ");
        sec=sr.nextInt();
        hour=sec/3600;
        min=(sec%3600)/60;
        sec=(sec%3600)%60;
        {
            System.out.print("Time="+hour+":"+min+":"+sec);
        }
    }    
}