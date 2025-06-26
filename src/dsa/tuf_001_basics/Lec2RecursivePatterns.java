package dsa.tuf_001_basics;

public class Lec2RecursivePatterns {

    public static void main(String[] args) {
        Lec2RecursivePatterns lec2RecursivePatterns = new Lec2RecursivePatterns();
        lec2RecursivePatterns.printCounting(1,100);
        lec2RecursivePatterns.squarePattern(0,0,5);

        System.out.println("\n \n");

        lec2RecursivePatterns.pattern2(1,1,5);

        System.out.println("\n \n");

        lec2RecursivePatterns.pattern3(1,1,5);

        System.out.println("\n \n");

        lec2RecursivePatterns.pattern4(1,1,5);


        System.out.println("\n \n");

        lec2RecursivePatterns.pattern5(1,1,5);


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
    private void squarePattern(int r, int c, int n) {
        if (r >= n) return;           // Base case: stop after n rows
        if (c >= n) {                 // End of one row
            System.out.println();
            squarePattern(r + 1, 0, n); // Move to next row
            return;
        }
        System.out.print(" * ");        // Print star
        squarePattern(r, c + 1, n);   // Next column
    }


    /*

     *
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *

     */
    private void pattern2(int r,int c,int n){
        if(r>n){
            return;
        }
        if(c>r){
            System.out.println();
            pattern2(r+1,1, n);
            return;
        }
        System.out.print(" * ");
        pattern2(r,c+1,n);
    }


    /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
    1 2 3 4 5 6
     */

    private void pattern3(int r,int c,int n){
        if(r>n){
            return;
        }
        if(c>r){
            System.out.println();
            pattern3(r+1,1, n);
            return;
        }
        System.out.print(" " + c + " ");
        pattern3(r,c+1,n);
    }


    private void pattern4(int r,int c,int n){
        if(r>n){
            return;
        }
        if(c>r){
            System.out.println();
            pattern4(r+1,1, n);
            return;
        }
        System.out.print(" " + r + " ");
        pattern4(r,c+1,n);
    }



    /*
            Input Format: N = 6
            Result:
            * * * * * *
            * * * * *
            * * * *
            * * *
            * *
            *
     */
    private void pattern5(int r,int c,int n){
        if(r>n){
            return;
        }
        if(c>r){
            pattern5(r+1,1, n);
            System.out.println();
            return;
        }
        pattern5(r,c+1,n);
        System.out.print(" * ");
    }

 /*

 Input Format: N = 6
Result:
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
  */
}
