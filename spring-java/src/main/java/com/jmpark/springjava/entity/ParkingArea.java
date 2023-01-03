package com.jmpark.springjava.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
public class ParkingArea extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id = 0;

    String districtId = null;
    String code = null;
    String name = null;
    String type = null;
    String category = null;
    Integer segment = 0;
    String level = null;
    Integer isRotation = 0;
    Integer isPay = 0;
    String memo = null;
    Integer managementId = 0;
    BigDecimal latitude = BigDecimal.ZERO;
    BigDecimal longitude = BigDecimal.ZERO;
    String lastUpdated = null;
}
