public class patter2 {
    // public static void hallowrec(int row,int col){
    //     for(int i = 1; i <=row;i++){
    //         for(int j=1;j<=col;j++){
    //             if(i==1||i==row||j==1||j==col){
    //                 System.out.print("$");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    // **********
    // *        *
    // *        *
    // *        *
    // *        *
    // *        *
    // **********
//     public static void invertedPyd(int n){
//         for(int i=1; i<=n; i++){
//             for(int j=1;j<=n-i;j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
        
//     }
//     *
//     **
//    ***
//   ****
//  *****
// ******
// *******
    // public static void invertedPydnum(int n)
    // {
    //     for(int i=1; i<=n; i++){
                
    //         for(int j=1;j<=n-i+1;j++)
    //         {
    //             System.out.print(j+" ");
    //         }
    //         System.out.println();
    
    //     }
            
    // }
    // 1 2 3 4 5 6 7 
    // 1 2 3 4 5 6
    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1 
    // public static void floydtriangle(int n)
    // {
    //     int count=1;
    //     for(int i=1; i<=n; i++){
                
    //         for(int j=1;j<=i;j++)
    //         {
    //             System.out.print(count+" ");
    //             count++;
    //         }
    //         System.out.println();
    
    //     }
            
    // } 
    // 1 
    // 2 3
    // 4 5 6
    // 7 8 9 10  
    // public static void triangle(int n){
    //     for(int i=1;i<=n;i++)
    //     {
    //         for(int j=1;j<=i;j++)
    //         {
    //             if((i+j)%2==0){
    //                 System.out.print("1");
    //             }
    //             else{
    //                 System.out.print("0");
    //             }
    //         }
    //         System.out.println();
    //     }
    // } 
    // 1
    // 01
    // 101
    // 0101
    // 10101
    // 010101
    // public static void butterfly(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         for(int j=1;j<=2*(n-i);j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
            
    //     }
        
    //     for(int i=n;i>=1;i--){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         for(int j=1;j<=2*(n-i);j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
            
    //     }
        
        
    // } 
    // *        *
    // **      **
    // ***    ***
    // ****  ****
    // **********
    // **********
    // ****  ****
    // ***    ***
    // **      **
    // *        *  
    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }  
    }
//     *
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *              
         
    public static void main(String[] args) {
        // hallowrec(7,10);
        // invertedPyd(7);
        //invertedPydnum(7);
        //floydtriangle(4);
        // triangle(6);
        //butterfly(5);
        diamond(5);
    }
    
}
