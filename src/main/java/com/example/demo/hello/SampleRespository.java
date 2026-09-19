package com.example.demo.hello;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRespository extends CrudRepository<Sample, String> {
}
