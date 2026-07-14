class Solution {
 List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        backtrack(candidates, target, 0, new ArrayList<>());

        return result;
    }

    public void backtrack(int[] candidates, int target, int index, List<Integer> current) {

        // Base Case 1: Found a valid combination
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Base Case 2: Invalid path
        if (target < 0) {
            return;
        }

        // Base Case 3: No more candidates
        if (index == candidates.length) {
            return;
        }

        // ----------------------------
        // Choice 1 : Take current number
        // ----------------------------
        current.add(candidates[index]);

        backtrack(candidates,
                  target - candidates[index],
                  index,
                  current);

        // Backtrack
        current.remove(current.size() - 1);

        // ----------------------------
        // Choice 2 : Skip current number
        // ----------------------------
        backtrack(candidates,
                  target,
                  index + 1,
                  current);
    }
    }
