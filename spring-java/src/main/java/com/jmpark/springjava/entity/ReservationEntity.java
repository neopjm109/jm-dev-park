package com.jmpark.springjava.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
public class ReservationEntity extends BaseTimeEntity {
    @Id
    String id = "";

    String ticketId = null;
    LocalDateTime startAt = null;
    LocalDateTime endAt = null;
}
