package itvdn.todolist.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "TODO")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "COMMENT")
    private String comment;

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "END_DATE")
    private Date endDate;

    @Column(name = "IMPORTANT")
    private Boolean important;

    @Column(name = "PRIORITY")
    @Enumerated(EnumType.STRING)
    private Prioriry prioriry;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean getImportant() {
        return important;
    }

    public void setImportant(Boolean important) {
        this.important = important;
    }

    public Prioriry getPrioriry() {
        return prioriry;
    }

    public void setPrioriry(Prioriry prioriry) {
        this.prioriry = prioriry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Todo)) return false;
        Todo todo = (Todo) o;
        return id == todo.id &&
                name.equals(todo.name) &&
                comment.equals(todo.comment) &&
                startDate.equals(todo.startDate) &&
                endDate.equals(todo.endDate) &&
                important.equals(todo.important) &&
                prioriry == todo.prioriry;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, comment, startDate, endDate, important, prioriry);
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", comment='" + comment + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", important=" + important +
                ", prioriry=" + prioriry +
                '}';
    }
}
