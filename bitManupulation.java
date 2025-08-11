import java.util.*;
class bitManupulation{
    public static void main(String args[]){
        int n=5;//0101
        int pos=2;
        int shift=1<<pos;
        //get bit
        if((n&shift)==0){
            System.out.println("The bit is zero.");
        }
        else{
            System.out.println("The bit is one.");
        }
        //set bit
        int newnum=shift|n;
        System.out.println("The new number is: " + newnum);
        //clear bit
        int clearnum=~shift&n;
        System.out.println("The cleared number is: " + clearnum);

    }
}