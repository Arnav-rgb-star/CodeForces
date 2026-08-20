class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
       int n = profit.length;
       
       int jobs[][] = new int[n][2];
       
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       
       
       int comp=0;
       
       for(int i=0;i<n;i++){
           jobs[i][0] = profit[i];
           jobs[i][1] = deadline[i];
       }
       Arrays.sort(jobs,(a,b)->Integer.compare(a[1],b[1]));
       
       
       for(int i=0;i<n;i++){
            pq.offer(jobs[i][0]);           
            if(pq.size() > jobs[i][1]) pq.poll();
       }
       
       int prof=0;
       while(!pq.isEmpty()){
           comp++;
           prof+=pq.poll();
       }
       return new ArrayList<>(Arrays.asList(comp, prof));

    }
}