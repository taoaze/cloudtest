package com.tao.repository.impl;

import com.tao.entity.Student;
import com.tao.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Integer,Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1,new Student(1,"张三",16));
        studentMap.put(2,new Student(2,"李四",17));
        studentMap.put(3,new Student(3,"王五",18));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(Integer id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(Integer id) {
        studentMap.remove(id);
    }
}
