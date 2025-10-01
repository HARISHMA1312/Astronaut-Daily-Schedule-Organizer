package obs;

import model.Task;

public interface TaskObserver {
    void update(Task newTask, String message);
}