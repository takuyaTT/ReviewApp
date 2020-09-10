package com.reviewapp.data;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "review")
@Data
public class Review implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "review_id")
    private Long reviewId;

    @Column(name = "review_title")
    private String reviewTitle;

    @Column(name = "post_date")
    private Date postDate;

    @Column(name = "impression")
    private String impression;

    @Column(name = "movie_id")
    private Long movieId;

    @Column(name = "evaluation_id")
    private Long evaluationId;

    @Column(name = "appreciation_id")
    private Long appreciationId;

    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "user_id")
    private Users users;
}
