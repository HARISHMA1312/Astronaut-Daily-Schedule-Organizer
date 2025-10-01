import javax.swing.*;
import java.awt.*;
import factory.TaskFactory;
import manager.ScheduleManager;
import model.Task;
import obs.ConflictNotifier;

public class Main {
    private static ScheduleManager manager = ScheduleManager.getInstance();
    private static JTextArea outputArea = new JTextArea(15, 40);

    public static void main(String[] args) {
        manager.addObserver(new ConflictNotifier());

        JFrame frame = new JFrame("🚀 Astronaut Daily Schedule Organizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 5, 5, 5));

        JButton addBtn = new JButton("Add Task");
        JButton removeBtn = new JButton("Remove Task");
        JButton viewBtn = new JButton("View Tasks");
        JButton markBtn = new JButton("Mark Completed");
        JButton filterBtn = new JButton("View by Priority");

        buttonPanel.add(addBtn);
        buttonPanel.add(removeBtn);
        buttonPanel.add(viewBtn);
        buttonPanel.add(markBtn);
        buttonPanel.add(filterBtn);

        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        // -------- Button Actions --------

        addBtn.addActionListener(e -> addTask());
        removeBtn.addActionListener(e -> removeTask());
        viewBtn.addActionListener(e -> refreshOutput(() -> manager.viewTasks()));
        markBtn.addActionListener(e -> markCompleted());
        filterBtn.addActionListener(e -> viewByPriority());

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    

    private static void addTask() {
        String desc = JOptionPane.showInputDialog("Task Description:");
        if (desc == null) return;

        String start = JOptionPane.showInputDialog("Start Time (HH:mm):");
        if (start == null) return;

        String end = JOptionPane.showInputDialog("End Time (HH:mm):");
        if (end == null) return;

        String priority = (String) JOptionPane.showInputDialog(
                null,
                "Select Priority",
                "Priority",
                JOptionPane.QUESTION_MESSAGE,
                null,
                new String[]{"High", "Medium", "Low"},
                "Medium"
        );
        if (priority == null) return;

        try {
            Task task = TaskFactory.createTask(desc, start, end, priority);
            manager.addTask(task);
            refreshOutput(() -> manager.viewTasks());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void removeTask() {
        String desc = JOptionPane.showInputDialog("Enter task description to remove:");
        if (desc != null) {
            manager.removeTask(desc);
            refreshOutput(() -> manager.viewTasks());
        }
    }

    private static void markCompleted() {
        String desc = JOptionPane.showInputDialog("Enter task description to mark completed:");
        if (desc != null) {
            manager.markTaskCompleted(desc);
            refreshOutput(() -> manager.viewTasks());
        }
    }

    private static void viewByPriority() {
        String priority = (String) JOptionPane.showInputDialog(
                null,
                "Select Priority",
                "Priority",
                JOptionPane.QUESTION_MESSAGE,
                null,
                new String[]{"High", "Medium", "Low"},
                "High"
        );
        if (priority != null) {
            refreshOutput(() -> manager.viewByPriority(priority));
        }
    }

    private static void refreshOutput(Runnable action) {
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        java.io.PrintStream ps = new java.io.PrintStream(baos);
        java.io.PrintStream old = System.out;
        System.setOut(ps);

        action.run();

        System.out.flush();
        System.setOut(old);
        outputArea.setText(baos.toString());
    }
}
