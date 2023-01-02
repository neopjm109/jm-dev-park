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
public class TimeTableEntity extends BaseTimeEntity {
    @Id
    String areaId = "";
    @Id
    String type = "";

    String openAt = null;
    String closeAt = null;
}
