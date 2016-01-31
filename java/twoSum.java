public class Solution {
    /**
     * @(#)twoSum.java      01/31/2016
     * @author   Meng Pang
     * /
     
     /*Given an array of integers, find two numbers such that they add up to a specific target number.
     *  The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be
     *  less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
     *  You may assume that each input would have exactly one solution.
     */
    public int[] twoSum(int[] numbers, int target) {
        
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){
            
            Integer diff = (Integer)(target - numbers[i]);
            if(hash.containsKey(diff)){
                int toReturn[] = {hash.get(diff)+1, i+1};
                return toReturn;
            }
            
            hash.put(numbers[i], i);
            
        }
        
        return null;
        
    }
}