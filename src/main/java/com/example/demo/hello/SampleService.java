package com.example.demo.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SampleService {

    @Autowired
    private SampleRespository sampleRespository;

    public Sample getSample(String id){
        // 検索
        Optional<Sample> optionalSample = sampleRespository.findById(id);
        // OptionalからSampleを取得
        Sample sample = optionalSample.get();

        return sample;
    }
}
