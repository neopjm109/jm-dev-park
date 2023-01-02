package com.jmpark.springjava.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.io.Serializable;

@Getter
@EqualsAndHashCode
public class AreaId implements Serializable {
    Integer areaId;
    String type;
}
