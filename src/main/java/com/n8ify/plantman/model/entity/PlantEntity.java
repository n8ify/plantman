package com.n8ify.plantman.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "plant")
public class PlantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plnt_id")
    private Long plntId;
    @Column(name = "plnt_name", length = 255, nullable = false)
    private String plntName;
    @Column(name = "plnt_remark", length = 255)
    private String plntRemark;
    @Column(name = "plnt_plant_type", length = 50, nullable = false)
    private String plntPlantType;
    @Column(name = "plnt_growth_day", nullable = false)
    private Integer plntGrowthDay;
    @Column(name = "plnt_tag", length = 50)
    private String plntTag;
    @Column(name = "plnt_available_to_plant", nullable = false)
    private Boolean plntAvailableToPlant;
}
