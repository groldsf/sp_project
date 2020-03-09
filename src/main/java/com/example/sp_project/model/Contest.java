package com.example.sp_project.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Contest extends BaseEntity {

    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "contest_task",
            joinColumns = @JoinColumn(name = "contest_id"),
            inverseJoinColumns = @JoinColumn(name = "task_id"))
    private List<Task> tasks;

    @ManyToOne
    private User creator;
}
