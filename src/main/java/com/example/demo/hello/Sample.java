package com.example.demo.hello;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Sample {
    @Id
    private String id;
    private String str;
}
