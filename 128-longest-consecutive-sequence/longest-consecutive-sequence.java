class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        // Loop through the SET instead of the ARRAY to skip duplicates completely
        for (int num : set) {
            if (!set.contains(num - 1)) { 
                int next = num + 1;
                int c = 1;
                
                while (set.contains(next)) {
                    c++;
                    next++;
                }
                longest = Math.max(c, longest);
            }
        }
        return longest;
    }
}
