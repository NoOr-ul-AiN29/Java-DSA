package lab;

import java.util.ArrayList;
import java.util.List;

public class TaskManagementSystem implements Comparable<TaskManagementSystem>{
    private int executionTime;
    private int taskID;

    public TaskManagementSystem(int taskId, int executionTime) {
        this.executionTime = executionTime;
        this.taskID = taskId;
    }

    public int getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(int executionTime) {
        this.executionTime = executionTime;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }
    @Override
    public int compareTo(TaskManagementSystem other){
        return Integer.compare(this.getExecutionTime(), other.getExecutionTime());
    }
    public static List<Integer> ExecuteTask(List<int[]> tasks,int availableTime) {
        PriorityQueue1 pq = new PriorityQueue1();
        for(int[] task: tasks){
            pq.add(new TaskManagementSystem(task[0],task[1]));
        }
        List<Integer> result = new ArrayList<>();
        int remaingTime=availableTime;
        while(!pq.isEmpty()){
            TaskManagementSystem temp = pq.poll();
            if(temp.getExecutionTime()<=remaingTime){
                try{
                    Thread.sleep(temp.getExecutionTime()*1000);
                    System.out.println("Task Executed:"+temp.getTaskID());

                }
                catch (InterruptedException interruptedException){
                    interruptedException.printStackTrace();
                }
                result.add(temp.getTaskID());
                remaingTime-=temp.getExecutionTime();
            }
            else{
                System.out.println("No more time to execute more tasks");
                break;
            }

        }
        return result;
    }
    public static class PriorityQueue1{
        public List<TaskManagementSystem> list;
        public PriorityQueue1(){
            list = new ArrayList<TaskManagementSystem>();
        }
        public void add(TaskManagementSystem t){
            int i=0;
            while(i<list.size()&&list.get(i).getExecutionTime()<=t.getExecutionTime()){
                i++;
            }
            list.add(i, t);
        }
        public TaskManagementSystem poll(){
            if(list.isEmpty()){
                return null;
            }
            return list.remove(0);
        }
        public Boolean isEmpty(){
            return list.isEmpty();
        }
    }

    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1,10});
        list.add(new int[]{2,15});
        list.add(new int[]{3,5});
        list.add(new int[]{4,20});
        list.add(new int[]{5,5});

        System.out.println(ExecuteTask(list,50));
    }
}
