package com.example.springdatajdbcsample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

//gettesetter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    private Integer id;

    private String name;
}
