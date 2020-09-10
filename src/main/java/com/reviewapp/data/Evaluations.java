package com.reviewapp.data;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "evaluations")
@Data
public class Evaluations implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "evaluation_id")
    private Long evaluationId;

    @Column(name = "evaluation")
    private String evaluation;

    //@OneToMany(mappedBy = "evaluation")
    //private List<Review> reviewList;
}
