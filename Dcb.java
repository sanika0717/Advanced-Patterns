public class Dcb{
    public static void dec_bin(int n){
        int pow=0;
        int bin_num=0;
        while(n>0){
            int rem= n%2;
            bin_num= bin_num +(rem* (int) Math.pow(10,pow));
            pow++;
            n= n/2;
        }
        System.out.println(n+ bin_num);
    }
    public static void main(String args[]){
        dec_bin(5);
    }
}