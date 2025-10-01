package obs;

import model.Task;

public class ConflictNotifier implements TaskObserver {
    @Override
    public void update(Task newTask, String message) {
        System.out.println(" " + message + " (Task: " + newTask.getDescription() + ")");
    }
}