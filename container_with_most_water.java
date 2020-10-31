// Time Complexity : O(n), where n is the size of the height array
// Space Complexity :O(1), no extra space was used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

//Three liner explanation your code in plain english
//1. Place 2 pointers, one at the start and the other at the end of the input array
//2. Check which pointer has the smallest element (as water can be filled upto the container's smaller wall) and multiply it with the
        //distance between the 2 wall to get the area
//3. Comapare the above calculated area with the current max and update the max. Move the pointer with the lower element and Continue
        // doing above steps till low is less than the high


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        //if height is null OR empty return 0
        if(height == null || height.length ==0) return 0;
        
        //assign max to the minimum possible value
        int max = -1;
        
        //assign low and high pointers to start and end of heights array
        int low = 0;
        int high = height.length-1;
        
        //while low is less than high
        while(low < high){
            //take the lowest of the elements at the 2 indexes and multiply it with distance between them (inshort find the area)
            //move the pointer that the lowest element
            if(height[low] < height[high]){
                //update the current max
                max = Math.max(max, height[low] * (high - low));
                low++;
            }
            else{
                max = Math.max(max, height[high]* (high - low));
                high--;
            }
        }
        //return max
        return max;
    }
}