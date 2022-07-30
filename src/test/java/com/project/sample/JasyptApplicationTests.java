package com.project.sample;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JasyptApplicationTests {

    @Test
    void jasypt() {
        String url = "";
        String username = "";
        String password = "";

        System.out.println("url 정보 암호화 값 :" + jasyptEncoding(url));
        System.out.println("계정 암호화값 : " + jasyptEncoding(username));
        System.out.println("비번 암호화 값 : " + jasyptEncoding(password));
    }

    public String jasyptEncoding(String value) {

        String key = "my_jasypt_key";
        StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
        pbeEnc.setAlgorithm("PBEWithMD5AndDES");
        pbeEnc.setPassword(key);
        return pbeEnc.encrypt(value);
    }
}
