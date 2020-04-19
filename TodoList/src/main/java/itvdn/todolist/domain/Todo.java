package itvdn.todolist.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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
    private Priority priority;

    @ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;

    @ManyToMany
    @JoinTable(name = "TODO_TAG", joinColumns = @JoinColumn(name = "TODO_ID"), inverseJoinColumns = @JoinColumn(name= "TAG_ID"))
    private Set<Tag> tagList = new HashSet<>();

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

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user){
        setUser(user, false);
    }

    public void setUser(User user, boolean otherSideHasBeenSet) {
        this.user = user;
        if(otherSideHasBeenSet) {
            return;
        }
        user.addTodo(this, true);
    }

    public void removeUser(User user){
        setUser(user, false);
    }

    public void removeUser(User user, boolean otherSideHasBeenSet) {
        this.user = null;
        if(otherSideHasBeenSet) {
            return;
        }
        user.removeTodo(this, true);
    }

    public Set<Tag> getTagList() {
        return tagList;
    }

    public void addTag(Tag tag) {
        addTag(tag, false);
    }

    public void addTag(Tag tag, boolean otherSideHasBeenSet) {
        this.getTagList().add(tag);
        if(otherSideHasBeenSet) {
            return;
        }
        tag.addTodo(this, true);
    }

    public void removeTag(Tag tag) {
        removeTag(tag, false);
    }

    public void removeTag(Tag tag, boolean otherSideHasBeenSet) {
        this.getTagList().remove(tag);
        if(otherSideHasBeenSet) {
            return;
        }
        tag.removeTodo(this, true);
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
                priority == todo.priority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, comment, startDate, endDate, important, priority);
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
                ", prioriry=" + priority +
                '}';
    }
}
