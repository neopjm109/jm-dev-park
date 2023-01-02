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
public class BaseCodeEntity extends BaseTimeEntity {
    @Id
    String code = "";

    String data1 = null;
    String data2 = null;
    String data3 = null;
    String data4 = null;
}
