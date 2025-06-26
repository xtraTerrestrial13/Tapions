package leetcode.easy.arrays;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode1512 {




    public int numIdenticalPairs(int[] nums) {
            int counter =0;


//        nums = [1,2,3,1,1,3]
//                  k         k+1
        /*           1          2
        *
        *
        * */

        //hashcode-> 1*10
        //
        //
        //
        //

        /*


Algorithm
No of operations

i=10;  1 operation
for(i=1; i<=n;   i++ ){
print(i); //10 operation O(n) operations + C
}

for(i=1;i<n;i++){
        for(j=1;j<n;j++){
        print(i);
        }
}
O (n * n) + C

a[m][n]
for(int i =0 ; i<m;i++){
    for(j=0; j<n;j++){
        print(a[i][j]);
    }
}
m*n + C

    Stack -> Last In First Out
    Queue -> Last In Last Out
    ---  -->    ---
    ---
    ---
    ---
    Train -->
    Engine --> [] --> [] --> [] --> [] -->


    stack -->
    push / pop / peek()

    //ArrayList Push.. list.remove(i)

Stack --> [  ]



    class Stack {
       private int [] array;
       private LinkedList  stack;

        push(int i)
        pop()
        peek()
    }

A,B,C,D

PRINT("",A)
        HASHCODE()
        {
        ORDER
}

              X    HASHTABLE
       1      65     A
       2      66     B
       3      67     C
       4      68     D


GET(A) --> HASHCODE--> 1 RETURN MEMORY ADDRESS/ POINTER

MEMORY --> VALUE


CONSTANT TIME RETURN--> O(1)


*/



        /*
        for(int i=0;i<=nums.length-1;i++){

              for(int j=i+1; j<=num.length-1;j++){
                    //i<j
                    if(nums[i]==nums[j]){
                        counter++;
                    }
              }
        }

        <k,v>
        0
        1
        2
        3
        4
        5

        array,
        stack,
        queue,
        linked list,
        hashtable,  set, map,
        tree,
        trie,
        graph,


        Integer--> akshay


        Hash Value

        HASHMAP <K,V> ,                 HASHSET  <K,V>  K==V
        A*10--> MEmtory --> Apple          A    --> A

            Get A --> * 10 Apple            A*10 --> A

                23512351235  AMRITSAR              23512351235 A

         */

        // Methods to override in Object Class  -> Hashcode, toString(), Clone(), equals()
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int k =0;k<nums.length-1;k++){
            if(map.containsKey(nums[k])){
                Integer integer = map.get(nums[k]);
                counter+=integer;
                map.replace(nums[k],integer+1);

            }else {
                map.put(nums[k],0);
            }

        }




        //
       // 1,2,3,1,1,3

        /*

      k   Set[]     nums[k]      counter
      0    [1]          1         0
      1     [1,2]       2         0
      2      [1,2,3]    3         0
      3      [1,2,3]    1         1
      4      [1,2,3]    1         2
      5                           3
        */


        return counter;
        }

}
