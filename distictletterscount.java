public class distictletterscount {
    public static int countletters(String s){
        int ct=0;
        int i=0,j=0,n=s.length();
        while(i<n && j<n){
            while(j+1<n && s.charAt(j)==s.charAt(j+1)){
                j++;
            }
            ct+=(j-i+1)*(j-i+1)+1/2;
            i=j+1;
            j=1;
        }
        return ct;
    }
    public static void main(String[] args) {
        String s="aaaba";
        countletters(s);
        System.out.println(s); 
    }
    
}
