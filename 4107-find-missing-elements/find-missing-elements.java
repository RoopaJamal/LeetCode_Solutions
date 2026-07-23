class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int s=nums[0];
        int l=nums[n-1];
        int i=1;
        for(int val=nums[0]+1;val<l;val++){
            if(val!=nums[i]) res.add(val);
            else i++;
        }
        return res;
    }
}