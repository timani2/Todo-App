package ojt.se.fu.vn.modle;

import java.io.Serializable;
import java.time.LocalDate;

public class Task implements Serializable {
    private int id;
    private int userId;
    private String title;
    private String status; // "INCOMPLETE" or "COMPLETED"
    private LocalDate createdAt;

    public Task() {
    }

    public Task(int id, int userId, String title, String status, LocalDate createdAt) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.status = status;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"id\": " + id + ",\n" +
                "  \"title\": \"" + title + "\",\n" +
                "  \"status\": \"" + status + "\",\n" +
                "  \"createdAt\": \"" + createdAt + "\"\n" +
                "}";
    }

}
