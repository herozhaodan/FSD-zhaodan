package me.fsd.ass.mod.controller;


import me.fsd.ass.mod.model.TrainingDtls;
import me.fsd.ass.mod.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/training")
public class TrainingController {

    @Autowired
    private TrainingService trainingService;


    @GetMapping
    public List<TrainingDtls> getAll(){
        return trainingService.getTraining(null);

    }
}
