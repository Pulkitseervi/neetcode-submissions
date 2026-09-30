class Solution {
    public int[] topKFrequent(int[] nums, int k) {
           HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int x : nums) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }

        // buckets[i] = numbers occurring i times
        ArrayList<Integer>[] buckets = new ArrayList[nums.length + 1];

        for (int x : map.keySet()) {

            int freq = map.get(x);

            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }

            buckets[freq].add(x);
        }

        int[] ans = new int[k];
        int index = 0;

        // Start from highest frequency
        for (int freq = nums.length; freq >= 1; freq--) {

            if (buckets[freq] != null) {

                for (int x : buckets[freq]) {

                    ans[index] = x;
                    index++;

                    if (index == k) {
                        return ans;
                    }
                }
            }
        }

        return ans;
    }
}
