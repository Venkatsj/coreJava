package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSome {
    public static void main(String[] args){

    }
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        boolean isFound = false;
        for(int i = 0; i <= nums.length - 2; i++){
            for(int j= i+1; j<=nums.length -1; j++){
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    isFound = true;
                    break;
                }
            }
            if(isFound)
                break;
        }
        return result;
    }

    public int[] twoSumMap(int[] nums, int target) {
        Map<Integer, Integer> store = new HashMap<>();
        for(int i = 0; i <= nums.length - 1; i++) {
            int storeElem = target - nums[i];
            if(store.containsKey(nums[i])){
                return new int[] {store.get(storeElem), i};
            }
            store.put(storeElem, i);
        }
        return null;
    }
}
