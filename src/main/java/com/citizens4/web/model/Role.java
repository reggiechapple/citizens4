package com.citizens4.web.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Role {
    @Id
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<Member> members;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Role(String name) {
        this.name = name;
    }

    public Role() {
    }
}