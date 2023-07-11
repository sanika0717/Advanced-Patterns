public class hollolw{
    public static void hollo_rectangle(int totrows,int totcols){

        for(int i=1;i<=totrows;i++){
            for(int j=1;j<=totcols;j++){
                if(i==totrows || i==1 ||j==1 || j==totcols){
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");

                }
            }
            System.out.println("");
            

        }
    }  
    public static void main(String args[]){
        hollo_rectangle(4,5);
    }  
    }
