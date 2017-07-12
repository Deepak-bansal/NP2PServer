package com.nucleussoftware.p2p.service;

import com.nucleussoftware.p2p.co.PwdLoginRequestCO;
import com.nucleussoftware.p2p.domain.User;
import com.nucleussoftware.p2p.dto.response.generic.ApiResponseDTO;
import com.nucleussoftware.p2p.dto.response.generic.ResponseDTO;
import com.nucleussoftware.p2p.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> loadAll() {
        return userRepository.findAll();
    }

    @Override
    public ResponseDTO checkLogin(PwdLoginRequestCO loginRequestCO) {
        ResponseDTO responseDTO = new ApiResponseDTO();
        if (validateEmailPassword(loginRequestCO.getEmail(), loginRequestCO.getPwd())) {
            responseDTO.setData("success");
            responseDTO.setCode(200);
            responseDTO.setMessage("success");
        } else {
            responseDTO.setData("failed");
            responseDTO.setCode(200);
            responseDTO.setMessage("failed");
        }
        return responseDTO;
    }

    private boolean validateEmailPassword(String email, String password) {
        try {
            User user = userRepository.findByEmail(email);
            if (user.getPassword().equals(password))
                return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
