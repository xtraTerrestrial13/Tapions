package dsa.neetcode.neetcode150.twopointer;

import java.util.Arrays;

public class ContainerWater {


        public int maxArea(int[] heights) {
            int maxArea = 0;
            for(int i=0;i<heights.length-1;i++){
                for(int j=i+1;j<heights.length;j++){
                    int breadth=j-i;
                    int area = breadth*Math.min(heights[i],heights[j]);
                    maxArea = Math.max(maxArea,area);
                }
            }
            return maxArea;
        }


    public int maxArea1(int[] heights) {
        int i =0 , j=heights.length-1;
        int maxArea = 0;
        while(i<j){
            int breadth= j-i;
            int area = breadth*Math.min(heights[i],heights[j]);
            maxArea = Math.max(maxArea,area);
            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }
}
