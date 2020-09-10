package com.reviewapp.data;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "appreciations")
@Data
public class Appreciations implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "appreciation_id")
    private Long appreciationId;

    @Column(name = "appreciation_method")
    private String appreciationMethod;

    //@OneToMany(mappedBy = "appreciation")
    //private List<Review> reviewList;
}
