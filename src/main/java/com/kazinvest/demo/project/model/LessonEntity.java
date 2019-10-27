package com.kazinvest.demo.project.model;

import javax.persistence.*;

@Entity
@Table(name = "lesson", schema = "kazinvest", catalog = "")
public class LessonEntity {
    private int id;
    private int managerId;
    private int educGraphId;
    private String qrText;
    private String mil;
    private String status;
    private String created;

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
    @Column(name = "educGraphId")
    public int getEducGraphId() {
        return educGraphId;
    }

    public void setEducGraphId(int educGraphId) {
        this.educGraphId = educGraphId;
    }

    @Basic
    @Column(name = "qrText")
    public String getQrText() {
        return qrText;
    }

    public void setQrText(String qrText) {
        this.qrText = qrText;
    }

    @Basic
    @Column(name = "mil")
    public String getMil() {
        return mil;
    }

    public void setMil(String mil) {
        this.mil = mil;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "created")
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LessonEntity that = (LessonEntity) o;

        if (id != that.id) return false;
        if (managerId != that.managerId) return false;
        if (educGraphId != that.educGraphId) return false;
        if (qrText != null ? !qrText.equals(that.qrText) : that.qrText != null) return false;
        if (mil != null ? !mil.equals(that.mil) : that.mil != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + managerId;
        result = 31 * result + educGraphId;
        result = 31 * result + (qrText != null ? qrText.hashCode() : 0);
        result = 31 * result + (mil != null ? mil.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        return result;
    }
}
