package com.reviewapp.data;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "movies")
@Data
public class Movies implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movie_id")
    private Long movieId;

    @Column(name = "movie_title")
    private String movieTitle;

    @Column(name = "release_data")
    private Date releaseData;

    //@OneToMany(mappedBy = "movie")
    //private List<Review> reviewList;
}
