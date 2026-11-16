class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> map=new HashMap<>();
        Queue<Integer> q=new LinkedList<>();

        int[] indegree=new int[numCourses];
        int[] schedule=new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            int course=prerequisites[i][0];
            int prerequisite=prerequisites[i][1];

            map.computeIfAbsent(prerequisite, k -> new ArrayList<>())
            .add(course);

            indegree[course]++;
        }

        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0)
                q.offer(i);
        }

        int count=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            schedule[count]=curr;
            count++;
            if(map.containsKey(curr)){
                for(int next:map.get(curr)){
                    indegree[next]--;
                    if(indegree[next]==0)
                        q.offer(next);
                }
            }
        }

        if(count==numCourses)
            return schedule;
        else return new int[0];
    }
}
