package me.fsd.ass.mod.service;

import me.fsd.ass.mod.dao.TrainingRepository;
import me.fsd.ass.mod.entity.Training;
import me.fsd.ass.mod.model.TrainingDtls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TrainingService {

    @Autowired
    private TrainingRepository trainingRepository;


    public List<TrainingDtls> getTraining(TrainingDtls trainingDtls) {

        List<Training> trainingList = null;
        if (trainingDtls == null){
            trainingList = trainingRepository.findAll();
        }

        List<TrainingDtls> rltLi = new ArrayList<TrainingDtls>();

        for (Training training:trainingList
             ) {
            TrainingDtls rlt = new TrainingDtls();

            rlt.setId(training.getId());
            rlt.setSkillName(training.getSkill().getName());
            rlt.setUserId(training.getUser().getId());
            rlt.setUserName(training.getUser().getUserName());
            rlt.setStatus(training.getStatus());
            rlt.setProgress(training.getProgress());
            rlt.setRating(training.getRating());
            rlt.setStartDate(training.getStartDate());
            rlt.setStartTime(training.getStartTime());
            rlt.setEndDate(training.getEndDate());
            rlt.setEndTime(training.getEndTime());

            rltLi.add(rlt);
        }
        return rltLi;
    }

}
