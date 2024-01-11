public class TwoSum2 {
   
        int[] numbers;
        int target;

        int left=0; 
        int right= numbers.length-1; 


        while(left < right){
            int currentSum= numbers[left] + numbers [right];
            if(currentSum == target){
                return new int[]{left+1 , right+1};
            }
            else if(currentSum < target){
                left+=1;
            }
            else if(currentSum > target){
                right-=1;
            }
        }

        return null; 





        
        
}

