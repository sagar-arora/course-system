package com.arorasagar.coursemanagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Embeddable
@Data
public class Enrollment {

    @Id
    @Column(name = "enrollment_id")
    private EnrollmentId enrollmentId;

    private Timestamp dateOfEnrollment;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Class aClass;
}
