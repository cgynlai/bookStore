package com.weCode.bookStore.repository;

import com.weCode.bookStore.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
