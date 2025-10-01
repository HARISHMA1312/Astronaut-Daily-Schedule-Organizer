package manager;

import model.Task;
import obs.TaskObserver;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ScheduleManager {
    private static ScheduleManager instance = null;
    private final List<Task> tasks;
    private final List<TaskObserver> observers;

    private ScheduleManager() {
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(Task task, String message) {
        for (TaskObserver observer : observers) {
            observer.update(task, message);
        }
    }

    public void addTask(Task newTask) {
        for (Task t : tasks) {
            if (isOverlap(t, newTask)) {
                notifyObservers(newTask, "Task conflicts with existing task: " + t.getDescription());
                return;
            }
        }
        tasks.add(newTask);
        tasks.sort(Comparator.comparing(Task::getStartTime));
        System.out.println("Task added successfully. No conflicts.");
    }

    public void removeTask(String description) {
        boolean removed = tasks.removeIf(t -> t.getDescription().equalsIgnoreCase(description));
        if (removed) {
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Error: Task not found.");
        }
    }

    public void markTaskCompleted(String description) {
        for (Task t : tasks) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                t.markCompleted();
                System.out.println(" Task marked as completed.");
                return;
            }
        }
        System.out.println(" Error: Task not found.");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
        } else {
            for (Task t : tasks) {
                System.out.println(t);
            }
        }
    }

    public void viewByPriority(String priorityStr) {
        boolean found = false;
        for (Task t : tasks) {
            if (t.getPriority().toString().equalsIgnoreCase(priorityStr)) {
                System.out.println(t);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No tasks found with priority: " + priorityStr);
        }
    }

    private boolean isOverlap(Task t1, Task t2) {
        return !t1.getEndTime().isBefore(t2.getStartTime()) && !t2.getEndTime().isBefore(t1.getStartTime());
    }
}
