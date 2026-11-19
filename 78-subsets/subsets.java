class Solution {

    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
    Arrays.sort(nums);
        
        List<Integer> temp=new ArrayList<>();
        dfs(0, nums, temp);

        return result;

    }

    public void dfs(int i, int[] nums, List<Integer> temp){


        if(i >= nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[i]);
        dfs(i+1, nums, temp);

        temp.remove(temp.size()-1);
        

        dfs(i+1, nums, temp);

    }
}