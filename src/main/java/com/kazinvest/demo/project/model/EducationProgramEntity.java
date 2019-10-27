package com.kazinvest.demo.project.model;

import javax.persistence.*;

@Entity
@Table(name = "education_program", schema = "kazinvest", catalog = "")
public class EducationProgramEntity {
    private int id;
    private int managerId;
    private int specId;
    private int total;
    private int busy;
    private String theme;

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
    @Column(name = "specId")
    public int getSpecId() {
        return specId;
    }

    public void setSpecId(int specId) {
        this.specId = specId;
    }

    @Basic
    @Column(name = "total")
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Basic
    @Column(name = "busy")
    public int getBusy() {
        return busy;
    }

    public void setBusy(int busy) {
        this.busy = busy;
    }

    @Basic
    @Column(name = "theme")
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EducationProgramEntity that = (EducationProgramEntity) o;

        if (id != that.id) return false;
        if (managerId != that.managerId) return false;
        if (specId != that.specId) return false;
        if (total != that.total) return false;
        if (busy != that.busy) return false;
        if (theme != null ? !theme.equals(that.theme) : that.theme != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + managerId;
        result = 31 * result + specId;
        result = 31 * result + total;
        result = 31 * result + busy;
        result = 31 * result + (theme != null ? theme.hashCode() : 0);
        return result;
    }
}
