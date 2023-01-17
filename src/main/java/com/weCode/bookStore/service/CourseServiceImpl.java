package com.weCode.bookStore.service;

import com.weCode.bookStore.model.Course;
import com.weCode.bookStore.model.Transaction;
import com.weCode.bookStore.repository.CourseRepository;
import com.weCode.bookStore.repository.TransactionRepositiry;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseServiceImpl implements CourseService {
    private CourseRepository courseRepository;

    @Autowired
    private TransactionRepositiry transactionRepositiry;

    @Override
    public List<Course> allCourse(){
        return courseRepository.findAll();
    }

    @Override
    public Course findCourseById(Long courseId) {
        return courseRepository.findById(courseId).orElse(null);
    }

    @Override
    public List<Transaction> findCourseOfUser(Long userId) {
        return transactionRepositiry.findAllByUserId(userId);
    }

    @Override
    public List<Transaction> findTransactionOfCourse(Long courseId) {
        return transactionRepositiry.findAllByCourseId(courseId);
    }

    @Override
    public Transaction saveTransaction(Transaction transaction) {
        return transactionRepositiry.save(transaction);
    }

}
