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
public class UserEntity extends BaseTimeEntity {
    @Id
    String id = "";

    String loginId = null;
    String loginPwd = null;
    String status = null;
    String role = null;
    String name = null;
}
