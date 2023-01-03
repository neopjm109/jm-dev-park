package com.jmpark.springjava.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
@IdClass(AreaId.class)
public class PayMethod extends BaseTimeEntity {
    @Id
    Integer areaId = 0;
    @Id
    String type = "";
}
