package com.kripa.guru.domain;

import com.kripa.guru.model.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Beer {

    @Id
    @Column(length = 36, updatable = false, nullable = false)
    private Long id;

    @Version
    private Integer version;

    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp createdDate;

    @UpdateTimestamp
    private Timestamp lasModifiedDate;
    private String beerName;
    private String beerStyle;

    @Column(unique = true)
    private Long upc;
    private BigDecimal price;
    private Integer quantityOnHand;
    private Integer quantityToBrew;
}
