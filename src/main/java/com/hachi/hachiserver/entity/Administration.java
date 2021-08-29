package com.hachi.hachiserver.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity(name = "administration")
@Table
@ToString(exclude = "password")
public class Administration {
    @Id
    @GeneratedValue
    @Column(updatable = false)
    private Long id;

    @Column(nullable = false)
    private String serviceName;
}
