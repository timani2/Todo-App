package ojt.se.fu.vn.controller;

import ojt.se.fu.vn.modle.Status;
import ojt.se.fu.vn.modle.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TaskManager {
    private Map<Integer, ArrayList<Task>> tasks = new HashMap<>();


    public void addTask(int userId, Task task){
        if(tasks.containsKey(userId)){
            tasks.get(userId).add(task);
        }else{
            ArrayList<Task> list = new ArrayList<>();
            list.add(task);
            tasks.put(userId, list);
        }
    }

    public void displayTask(int userId){
        ArrayList<Task> list = tasks.get(userId);
        if(list == null || list.isEmpty()){
            System.out.println("No tasks found for user ID: " + userId);
            return;
        }
        for(Task task : list){
            System.out.println(task);
        }
    }


    public void updateTask(int userId,  int taskId, String newTitle, Status newStatus){
        ArrayList<Task> task = tasks.get(userId);
        if(task == null){
            System.out.println("Task not found");
        }
        if (task != null) {
            for (Task t : task) {
                if (t.getId() == taskId) {
                    t.setTitle(newTitle);
                    t.setStatus(newStatus.name());
                    break;
                }
            }
        }

    }

    public void removeTask(int userId, int taskId){
            ArrayList<Task> listTask = tasks.get(userId);
            if(listTask == null){
                System.out.println("Task not found");
            }
            if (listTask != null) {
                for (Task t : listTask) {
                    if (t.getId() == taskId) {
                        listTask.remove(t);
                        break;
                    }
                }
            }

    }


}
