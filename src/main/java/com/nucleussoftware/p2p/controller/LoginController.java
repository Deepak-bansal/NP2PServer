package com.nucleussoftware.p2p.controller;

import com.nucleussoftware.p2p.co.PwdLoginRequestCO;
import com.nucleussoftware.p2p.dto.response.generic.ResponseDTO;
import com.nucleussoftware.p2p.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseDTO loginViaPassword(@RequestBody PwdLoginRequestCO loginRequestCO, @RequestHeader(value = "locale", defaultValue = "en") String locale) {
        ResponseDTO responseDTO = userService.checkLogin(loginRequestCO);
        return responseDTO;
    }
}
