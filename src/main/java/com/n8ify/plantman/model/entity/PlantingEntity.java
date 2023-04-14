package com.n8ify.plantman.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "planting")
public class PlantingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plni_id")
    private String plniId;

    @Column(name = "plni_plnt_id", nullable = false)
    private String plniPlntId;

    @Column(name = "plni_thrd_id", nullable = false)
    private Integer plniThrdId;

    @Column(name = "plni_thread_row", nullable = false)
    private Integer plniThreadRow;

    @Column(name = "plni_thread_col", nullable = false)
    private Integer plniThreadCol;

    @Column(name = "plnt_status", length = 10, nullable = false)
    private String plntStatus;

    @Column(name = "plnt_remark", length = 255)
    private String plntRemark;

    @Column(name = "plnt_history", nullable = false)
    private String plntHistory;

    @Column(name = "plni_plant_datetime", nullable = false)
    private LocalDateTime plniPlantDatetime;

    @Column(name = "plni_harvest_datetime")
    private LocalDateTime plni_harvest_datetime;


}
