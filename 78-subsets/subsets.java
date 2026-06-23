class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    public void back(int start,List<Integer> list,int nums[]){
        res.add(new ArrayList<>(list));
        if(list.size()==nums.length){
            return;
        }
        for(int i=start;i<nums.length;i++){
            list.add(nums[i]);
            back(i+1,list,nums);
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {

        back(0,list,nums);
        return res;
    }
}