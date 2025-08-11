import java.util.*;
class searchArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int student[]=new int[5];
        //to enter
        for(int i=0;i<5;i++){
            System.out.println("Enter the roll no.:");
            student[i]=sc.nextInt();
        }
        System.out.println("Enter the roll no. to search: ");
        int roll=sc.nextInt();
        for(int j=0;j<5;j++){
            if(student[j]==roll){
                System.out.println("Roll no. found at :"+(j+1));
            }
            
        }
    }
}