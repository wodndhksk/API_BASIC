package com.project.sample.sample.sampleAccount;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_sample_account")
public class SampleAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private String friendId;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime dateTime;


//    private String roles;

//    @Enumerated(EnumType.STRING)
//    private AccountType type;

//    @Transactional
//    public void encodePassword(PasswordEncoder passwordEncoder){
//        password = passwordEncoder.encode(password);
//    }
}
