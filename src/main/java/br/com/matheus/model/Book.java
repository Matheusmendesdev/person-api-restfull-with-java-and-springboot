package br.com.matheus.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "books")
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String author;
    @Column(name = "launch_date")
    @Temporal(TemporalType.DATE)
    private Date launchDate;
    private Double price;
    private String title;

}
