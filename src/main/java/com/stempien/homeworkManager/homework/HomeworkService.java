package com.stempien.homeworkManager.homework;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeworkService {
    private final HomeworkRepository homeworkRepository;

    public HomeworkService(HomeworkRepository homeworkRepository) {
        this.homeworkRepository = homeworkRepository;
    }

    List<Homework> findAll(){
        return homeworkRepository.findAll();
    }

    void add(Homework homework){
        homeworkRepository.save(homework);
    }

    void delete(Long id){homeworkRepository.deleteById(id);}
}
