package dsa.tuf_001_basics;

public class Lec2RecursivePatterns {

    public static void main(String[] args) {
        Lec2RecursivePatterns lec2RecursivePatterns = new Lec2RecursivePatterns();
        lec2RecursivePatterns.printCounting(0,100);
//        lec2RecursivePatterns.squarePattern(5);

    }


    /*Print till n*/
    public void printCounting(int count,int n){
            //Base condition
            if (count > n) {
                return;
            }
            System.out.println(count);
            printCounting(count+1,n);
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
    private void squarePattern(int r,int c){
        //int n is no of rows
        
        
    }


    private void printRow(int r,int c){
        if(r>c){
            return;
        }
        System.out.print("*");
        printRow(r,c+1);
    }

}
