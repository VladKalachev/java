package itvdn.todolist.domain.PlainObjects;

import itvdn.todolist.domain.Priority;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class TodoPojo {

    private Long id;
    private String name;
    private String comment;
    private Date startDate;
    private Date endDate;
    private Boolean important;
    private Priority priority;
    private Set<TagPojo> tagList = new HashSet<>();
    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Set<TagPojo> getTagList() {
        return tagList;
    }

    public void setTagList(Set<TagPojo> tagList) {
        this.tagList = tagList;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
