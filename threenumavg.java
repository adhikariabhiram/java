//import java.util.Scanner;

// import java.util.*;
// public class threenumavg {
//      public static void main(String []args)
//      {
//          Scanner s =new Scanner(System.in);
//          int A=s.nextInt();
//          int B=s.nextInt();
//          int C=s.nextInt();
//          int average=(A+B+C)/3;
//          System.out.println("average of three numbers:"+ average);
//      } 
    
//  }
// import java.util.*;
// public class threenumavg {
//     public static void main(String []args)
//     {
//         Scanner s =new Scanner(System.in);
//         int side=s.nextInt();
//         int area=side*side;
//         System.out.println("area of sqare is:"+ area);


//     }
// }
// import java.util.*;
// public class threenumavg {
//     public static void main(String []args)
//     {
//         Scanner s =new Scanner(System.in);
//         float pencil=s.nextFloat();
//         float pen=s.nextFloat();
//         float eraser=s.nextFloat();
//         float total=pencil+pen+eraser;
//         System.out.println("bill is:"+total);
//         //add GST to total
//         float newtotal=total+(0.18f*total);
//         System.out.println("bill with 18% tax is: "+ newtotal);
//     }
// } 

// public class threenumavg {
//     public static void main(String []args)
//     {
//         byte b=4;
//         char c='a';
//         short s=512;
//         int i=1000;
//         float f=3.14f;
//         double d=99.9954;
//         System.out.println((f*b)+(i%c)-(d*s));

//     } 
// }
// public class threenumavg
// {
//     public static void main(String[] args)
//     {
//         int x = 2, y = 5;
//         int exp1 = (x * y / x);
//         int exp2 = (x * (y / x));
//         System.out.println(exp1 );
//         System.out.print(exp2);
//     }
// }
// public class  threenumavg
// {
//     public static void main(String[] args)
//     {
//         int x, y, z;
//         x = y = z = 2;
//         x += y;
//         y -= z;
//         z /= (x + y);
//         System.out.println(x + " " + y + " " + z);
//     }
// }
// public class threenumavg{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int n=sc.nextInt();
//         boolean isprime=true;
//         for(int i=2;i<=Math.sqrt(n);i++)
//         {
//             if(n%2==0){
//                 isprime=false;
//             }
//         }
//         if(isprime==true)
//         {
//             System.out.println("n is prime number"+n);
//         }
//         else{
//             System.out.println("n is not prime number" +n);
//         }
//         sc.close();
//     }
// }
// public class threenumavg{
//     public static void main(String[] args) {
//         int n;
//         int choice;
//         int evensum=0;
//         int oddsum=0;
//         Scanner sc=new Scanner(System.in);
        
//         do{
//             System.out.println("enter a number:");
//             n=sc.nextInt();
//             if(n%2==0){
//                 evensum+=n;
//             }
//             else{
//                 oddsum+=n;
//             }
//             choice=sc.nextInt();
//             System.out.println("do you want to continue? if yes press 1,otherwise 0 for no");

//         }
//         while(choice==1);
//         System.out.println("sum of even:"+evensum);
//         System.out.println("sum of odd:"+oddsum);
//         sc.close();
//     }
// }