package com.project.sample.sample.sampleAccount;

import com.project.sample.sample.sampleAccount.service.SampleAccountService;
import com.project.sample.sample.sampleAccount.service.impl.SampleAccountServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sample/account")
public class SampleAccountController {

    private final SampleAccountService accountService;

    public SampleAccountController(SampleAccountServiceImpl accountServiceImpl) {
        this.accountService = accountServiceImpl;
    }

    @GetMapping("/sign-up")
    public void sampleSignUp(@RequestParam String name){
        String password = "1234";
        accountService.crateAccount(name, password);
    }
    @GetMapping("/all")
    public ResponseEntity<List<SampleAccount>> sampleSignUp(){
        ResponseEntity<List<SampleAccount>> body = ResponseEntity.ok().body(accountService.getAllAcount());
        return body;
    }


}
