package com.project.sample.sample.sampleAccount;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @Date : 2022. 7. 30.
 * @author : jaewoo
 * @Entity 설명 : 회원객체
 */
@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_sample_account") // 테이블 이름 설정
public class SampleAccount {

    /**
     * 회원 id (Primary key)
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    /**
     * 회원 PW
     */
    @Column
    private String password;

    /**
     * 회원 이름
     */
    @Column
    private String name;

    /**
     * 회원 코드
     */
    @Column
    private String friendId;

    /**
     * 데이터 입력 시간
     */
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP") //'current_timestamp' 로 현재시간 자동 입력 설정
    private LocalDateTime dateTime;


//    private String roles;

//    @Enumerated(EnumType.STRING)
//    private AccountType type;

//    @Transactional
//    public void encodePassword(PasswordEncoder passwordEncoder){
//        password = passwordEncoder.encode(password);
//    }
}
