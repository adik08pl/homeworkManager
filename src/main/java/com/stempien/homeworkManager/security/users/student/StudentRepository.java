package com.stempien.homeworkManager.security.users.student;

import org.springframework.data.jpa.repository.JpaRepository;

interface StudentRepository extends JpaRepository<Student, Long> {
}