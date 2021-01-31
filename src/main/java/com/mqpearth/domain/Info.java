package com.mqpearth.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Info
 *
 * @author mqpearth
 * @date 2021.1.31 21:16
 */
@Entity
@Table(name = "Info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

}
