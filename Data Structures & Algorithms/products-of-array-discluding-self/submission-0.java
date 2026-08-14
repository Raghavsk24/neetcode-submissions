class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Initialize an output array equivalent in size to input array
        int[] output = new int[nums.length];

        // Calculate the total product of all elements in the input array excluding zeros
        int totalProduct = nums[0];
        int zeroCount = 0;
        if (nums[0] == 0) {
            zeroCount++;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                totalProduct *= nums[i];
            } else {
                zeroCount++;
            }
        }

        // Divide the total product by each input value to find the output value at each index
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount >= 1) {
                if (nums[i] == 0 && zeroCount == 1) {
                    output[i] = totalProduct;
                } else {
                    output[i] = 0;
                }
            } else {
                output[i] = totalProduct / nums[i]; 
            }
        }
        return output;
    }
}  
