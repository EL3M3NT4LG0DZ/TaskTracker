import java.util.ArrayList;

public class TaskTracker
{
    private ArrayList<Task>list;

    public TaskTracker(ArrayList<Task>TaskList)
    {
        this.list = TaskList;
    }
    public void addTask(Task task)
    {
        list.add(task);
    }
    public void deleteTask(Task task)
    {
        list.remove(task);
    }
    public void updateTask(int index, Task task)
    {
        list.set(index,task);
    }
    public boolean markInProgress(int index)
    {
        return true;
    }
    public boolean markDone(int index)
    {
        return true;
    }

    public void printAllTasks()
    {
       for(Task t: list)
           System.out.println(t);
    }
    public void printAllFinishedTasks()
    {
        for(int i = 0;i<list.size();i++)
            if(this.markDone(i) == true)
                System.out.println(list.get(i));
    }
    public void printAllUnfinishedTasks()
    {
        for(int i = 0;i<list.size();i++)
            if(this.markDone(i) == false)
            System.out.println(list.get(i));
    }



}
