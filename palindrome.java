public class palindrome {
    public static void main(String[] args) {
        int remainder=0,reversenum=0;
        int num=454;
        int temp=num;
        while(num>0){
            remainder=num%10;
            reversenum=(reversenum*10)+remainder;
            num=num/10;
        }
        if(temp==reversenum){
            System.out.println("the number is palindrome");
        }
        else{
            System.out.println("the number is not palindrome");
        }
    }

    
}
