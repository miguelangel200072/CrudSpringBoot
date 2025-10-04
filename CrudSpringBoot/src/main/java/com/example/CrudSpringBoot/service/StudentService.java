package com.example.CrudSpringBoot.service;

import com.example.CrudSpringBoot.entity.Student;
import com.example.CrudSpringBoot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    // Retornar todos los estudiantes
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    // Retornar estudiante por id
    public Optional<Student> getStudent(Long id){
        return studentRepository.findById(id);
    }

    // Guardar o actualizar estudiante
    public void saveOrUpdate(Student student){
        studentRepository.save(student);
    }

    // Eliminar estudiante
    public void delete(Long id){
        studentRepository.deleteById(id);
    }
}
