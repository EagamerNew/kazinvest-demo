package com.kazinvest.demo.project.model;

import javax.persistence.*;

@Entity
@Table(name = "attendance", schema = "kazinvest", catalog = "")
public class AttendanceEntity {
    private int id;
    private int lessonId;
    private int studentId;
    private String status;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "lessonId")
    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    @Basic
    @Column(name = "studentId")
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AttendanceEntity that = (AttendanceEntity) o;

        if (id != that.id) return false;
        if (lessonId != that.lessonId) return false;
        if (studentId != that.studentId) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + lessonId;
        result = 31 * result + studentId;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
