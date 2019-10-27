package com.kazinvest.demo.project.model;

import javax.persistence.*;

@Entity
@Table(name = "user_spec", schema = "kazinvest", catalog = "")
public class UserSpecEntity {
    private int id;
    private int managerId;
    private String title;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "managerId")
    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserSpecEntity that = (UserSpecEntity) o;

        if (id != that.id) return false;
        if (managerId != that.managerId) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + managerId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }
}
