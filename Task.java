public class Task {
    String title;
    boolean completed;

    public Task(String title) {
        this.title = title;
        this.completed = false;
    }

    public void markCompleted() {
        completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[✓] " : "[ ] ") + title;
    }
}
