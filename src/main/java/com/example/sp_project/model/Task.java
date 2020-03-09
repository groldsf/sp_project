package com.example.sp_project.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Task extends BaseEntity {

    private String name;
    private String url;
    private String text;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "task_tag",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    Set<Tag> tags;
}
