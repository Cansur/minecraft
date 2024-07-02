package com.example.minecraft.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // <<Enum 을 사용하여 타입 구별>>
    private String type;

    private String title;

    private String content;

    private String userid;

    private LocalDateTime createtime;

    private Integer likes;

    private Integer counts;

    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private Integer id;

    // private String title;
    
    // private String content;
}
