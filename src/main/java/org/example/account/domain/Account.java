package org.example.account.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Account {
    @Id
    @GeneratedValue/*(strategy = GenerationType.SEQUENCE)*/
    /*@Column(name = "id", nullable = false)*/
    private Long id;

    private String accountNumber;

    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;

}
