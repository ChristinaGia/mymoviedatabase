package de.dhbw.ravensburg.wp.mymoviedatabase.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

    @Getter
    @Setter
    @NoArgsConstructor
    @Entity
    public class Award {
        @Id
        @GeneratedValue
        private long id;

        private String academy;

        private String category;

        private int year;


        @OneToMany(mappedBy = "award", cascade = CascadeType.ALL)
        private List<Movie> movies;

        public Award (String academy, String category, Integer year){
            this.academy = academy;
            this.category = category;
            this.year = year;
        }
    }


