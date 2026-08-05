class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
                HashSet<Integer> set = new HashSet<Integer>();
        int repeated=-1;
        int missing=-1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                int nums=grid[i][j];

                if(set.contains(nums)){
                    repeated=nums;

                }
                else {
                    set.add(nums);
                }

            }
        }
        int n=grid.length;
        for(int j=1;j<=n*n;j++){
            if(!set.contains(j)){
                missing=j;
                break;
            }
        }
        return new int[]{repeated,missing};


    }
    }
