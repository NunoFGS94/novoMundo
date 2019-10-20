package com.mundoNovo.mundoNovo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Event {


    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter
    @Setter
    private Long idCityFrom;

    @Getter
    @Setter
    private Long idCityTo;

    @Getter
    @Setter
    private Long idEventType;

    @Getter
    @Setter
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date creationDate;

    @Getter
    @Setter
    private Date endDate;

    @Getter
    @Setter
    private String settings;

}
