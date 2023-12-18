package com.peralta.DoYourStuff.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity(name = "task")
@Table(name = "task")
@Getter
@Setter
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "creation_date")
    private Date creationDate;
    @Column(name = "last_update_date")
    private Date lastUpdateDate;
    @Column(name = "limit_date_to_be_done")
    private Date limitDateToBeDone;
    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;
    @ManyToOne
    @JoinColumn(name = "assigned_to")
    private User assignedTo;
    @ManyToOne
    @JoinColumn(name = "who_last_change")
    private User whoLastChange;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", creationDate=" + creationDate +
                ", lastUpdateDate=" + lastUpdateDate +
                ", limitDateToBeDone=" + limitDateToBeDone +
                ", createdBy=" + createdBy +
                ", assignedTo=" + assignedTo +
                '}';
    }
}
