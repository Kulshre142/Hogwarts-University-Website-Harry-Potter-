package com.hogwarts.institute.Repository;

import com.hogwarts.institute.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
