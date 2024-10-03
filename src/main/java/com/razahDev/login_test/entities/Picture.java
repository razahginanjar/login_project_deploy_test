package com.razahDev.login_test.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "m_pict")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String url;
}
