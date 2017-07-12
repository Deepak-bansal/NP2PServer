package com.nucleussoftware.p2p.service;


import com.nucleussoftware.p2p.co.PwdLoginRequestCO;
import com.nucleussoftware.p2p.domain.User;
import com.nucleussoftware.p2p.dto.response.generic.ResponseDTO;

import java.util.List;


public interface UserService {
    List<User> loadAll();

    ResponseDTO checkLogin(PwdLoginRequestCO loginRequestCO);
}
