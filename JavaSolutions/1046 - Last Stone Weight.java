class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for (int stone: stones) pq.offer(stone);
        while(pq.size() > 1) {
            int x = pq.poll();
            int y = pq.poll();
            int z = x - y;
            if (z != 0) pq.offer(z);
        }

        return pq.peek() == null? 0: pq.poll();
    }
}