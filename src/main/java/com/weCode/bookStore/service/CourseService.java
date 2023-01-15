package com.weCode.bookStore.service;

import com.weCode.bookStore.model.Course;
import com.weCode.bookStore.model.Transaction;

import java.util.List;

public interface CourseService {
    List<Course> allCourse();

    Course findCourseById(Long courseId);

    List<Transaction> findCourseOfUser(Long userId);

    List<Transaction> findTransactionOfCourse(Long courseId);

    Transaction saveTransaction(Transaction transaction);
}

