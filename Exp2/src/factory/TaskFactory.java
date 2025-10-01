package factory;

import model.Task;
import model.TaskPriority;
import util.TimeUtils;

import java.time.LocalTime;

public class TaskFactory {
    public static Task createTask(String description, String start, String end, String priorityStr) {
        LocalTime startTime = TimeUtils.parseTime(start);
        LocalTime endTime = TimeUtils.parseTime(end);

        if (endTime.isBefore(startTime) || endTime.equals(startTime)) {
            throw new IllegalArgumentException("End time must be after start time.");
        }

        TaskPriority priority;
        try {
            priority = TaskPriority.valueOf(priorityStr.toUpperCase());
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid priority. Use High, Medium, Low.");
        }

        return new Task(description, startTime, endTime, priority);
    }
}
