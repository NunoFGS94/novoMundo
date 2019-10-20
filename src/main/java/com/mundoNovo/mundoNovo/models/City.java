package com.mundoNovo.mundoNovo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@JsonIgnoreProperties(value = {"creationDate", "lastActionDate"}, allowGetters = true)
@EntityListeners(AuditingEntityListener.class)
public class City {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    @NotBlank
    private float xCoordinate;

    @Getter
    @Setter
    @NotBlank
    private float yCoordinate;

    @Getter
    @Setter
    private Long idUser;

    @Getter
    @Setter
    private String JSON;

    @Getter
    @Setter
    private int population;

    @Getter
    @Setter
    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date creationDate;

    @Getter
    @Setter
    @Column(nullable = false)
    @LastModifiedDate
    private Date lastActionDate;
}
