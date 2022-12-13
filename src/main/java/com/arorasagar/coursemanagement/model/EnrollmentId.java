package com.arorasagar.coursemanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;


@Embeddable
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EnrollmentId implements Serializable {

    @Column(name = "student_id")
    private long studentId;

    @Column(name = "class_id")
    private long classId;
}
