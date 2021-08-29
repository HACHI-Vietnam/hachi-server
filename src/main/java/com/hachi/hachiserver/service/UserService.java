package com.hachi.hachiserver.service;

import com.hachi.hachiserver.dto.request.user.UserBasicInfoRequest;
import com.hachi.hachiserver.dto.request.user.UserLoginRequest;
import com.hachi.hachiserver.dto.request.user.UserRegisterRequest;
import com.hachi.hachiserver.entity.User;
import com.hachi.hachiserver.exception.common.ServiceError;
import com.hachi.hachiserver.exception.common.ServiceException;
import com.hachi.hachiserver.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User login(UserLoginRequest loginRequest){
        User user = userRepository.findByUsername(loginRequest.getUsername());
        if (Objects.isNull(user)) throw new ServiceException(ServiceError.USER_NOT_FOUND, null);
        if(!passwordEncoder.matches(loginRequest.getPassword(), user.getPassword())){
            throw new ServiceException(ServiceError.PASSWORD_NOT_MATCH, null);
        }
        return user;
    }

    public User register(UserRegisterRequest registerRequest){
        User user = new User();
        user.setUsername(registerRequest.getUsername());
        user.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
        user.setEmail(registerRequest.getEmail());
        return userRepository.save(user);
    }

    public User updateBasicInfo(Long id, UserBasicInfoRequest basicInfoRequest){
        User user = userRepository.getById(id);
        user.setAge(basicInfoRequest.getAge());
        user.setCity(basicInfoRequest.getCity());
        user.setGender(basicInfoRequest.isGender());
        return userRepository.save(user);
    }
}
