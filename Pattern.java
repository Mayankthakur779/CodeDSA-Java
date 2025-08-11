import java.util.*;
class Pattern{
     public static void main(String args[]){

        // // pattern1(Simple)
        // for(int i=1;i<=4;i++){
        //     // System.out.println("*");
        //     for(int j=1;j<=5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //  }

        // // pattern2(hollow rectangle)
        // int n=4;
        // int m=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         if(i==1||j==1||i==n||j==m){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // // pattern 3(left pyramid)
        // int n=4;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // pattern 4(inverted half pyramid)
        // int n=4;
        //  for(int i=1;i<=n;i++){
        //     for(int j=i;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //  }
        
        // //pattern 5(r. half pyramid)
        // int n=4;
        //  for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //  }

        //num. pattern
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // } 

        //floyds triangle
        // int n=5;
        // int number=1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        // 0-1 triangle
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        
         

    }
}