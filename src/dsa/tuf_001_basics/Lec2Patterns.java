package dsa.tuf_001_basics;

public class Lec2Patterns {

    //Todo
    //Learn how why main method is called?
    //How java compiler works.
    //Significance of String[] and role of args
    public static void main(String[] args){
        Lec2Patterns lec2Patterns = new Lec2Patterns();
        lec2Patterns.SquarePattern(5);
        System.out.println();
        System.out.println();
        lec2Patterns.pattern2(5);

    }


    /*
    Print square star pattern :
     * * * * * *
     * * * * * *
     * * * * * *
     * * * * * *
     * * * * * *
     * * * * * *
     */
    private void SquarePattern(int n){
       //int n is no of rows
        for(int i = 0 ; i< n ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            if (i < n - 1) {
                System.out.println();
            }
        }
    }


    /*

     *
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *

     */

    private void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
