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
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column(name = "title")
    public String title;
    @Column(name = "description")
    public String description;
    @Column(name = "creation_date")
    public Date creationDate;
    @Column(name = "last_update_date")
    public Date lastUpdateDate;
    @Column(name = "limit_date_to_be_done")
    public Date limitDateToBeDone;
    @ManyToOne
    @JoinColumn(name = "created_by")
    public User createdBy;
    @ManyToOne
    @JoinColumn(name = "assigned_to")
    public User assignedTo;

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
