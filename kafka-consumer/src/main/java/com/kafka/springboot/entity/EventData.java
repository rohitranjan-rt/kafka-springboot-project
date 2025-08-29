package com.kafka.springboot.entity;



@Entity
@Table(name="event")
@Getter
@Setter
public class EventData{

    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String event;
}