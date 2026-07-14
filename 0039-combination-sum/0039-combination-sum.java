class Solution {

    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates, target , 0, new ArrayList<>());
        return result;
        
    }

    public void backtrack(int[] candidates, int target ,int index, List<Integer> current)
    {
        //Base case 1:found a valid combination 
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        //Base case 2 : invalid path
        if(target <0){
            return;
        }

        //Base case 3 : no more candidates
        if(index ==candidates.length ){
            return;
        }

        //Choice 1 : Take current number 
        current.add(candidates[index]);
        backtrack(candidates,target- candidates[index], index ,current );
        current. remove(current.size()-1);

        backtrack(candidates,target, index +1, current );
    }
}