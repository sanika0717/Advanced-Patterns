public class Bdc{
    public static void bin_dec(int n){
        int pow=0;
        int dec_num=0;
        while(n>0){
            int lastdigit= n%10;
            dec_num= dec_num+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.println(n + dec_num);
    }
    public static void main(String args[]){
        bin_dec(11010);
        
    }
}