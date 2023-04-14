package com.n8ify.plantman.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "thread")
public class ThreadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "thrd_id")
    private Long thrdId;

    @Column(name = "thrd_name", length = 255, nullable = false)
    private String thrdName;

    @Column(name = "thrd_type", length = 255, nullable = false)
    private String thrdType;

    @Column(name = "thrd_remark", length = 255)
    private String thrdRemark;

    @Column(name = "thrd_size", nullable = false)
    private Integer thrdSize;

    @Column(name = "thrd_row", nullable = false)
    private Integer thrdRow;

    @Column(name = "thrd_col", nullable = false)
    private Integer thrdCol;

}
