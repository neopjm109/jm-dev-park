package com.jmpark.springjava.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
public class TicketEntity extends BaseTimeEntity {
    @Id
    String id = "";

    Integer areaId = null;
    String userId = null;
    String type = null;
    Integer minute = 0;
    Integer price = 0;
    String status = null;
    String payMethod = null;
    String payDate = null;
    String cardCode = null;
    String cardNumber = null;
}
