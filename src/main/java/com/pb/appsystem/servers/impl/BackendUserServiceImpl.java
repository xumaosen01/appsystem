package com.pb.appsystem.servers.impl;

import com.pb.appsystem.pojo.BackendUser;
import com.pb.appsystem.repository.BackendUserRepository;
import com.pb.appsystem.servers.BackendUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BackendUserServiceImpl implements BackendUserService{
    @Autowired
    private BackendUserRepository backendUserRepository;

    @Override
    public boolean findUserByUserCode(String userCode, String password) {
        BackendUser user = backendUserRepository.findUserByUserCode(userCode);
        if (user!=null){
            if (user.getUserpassword().equals(password)){
                return true;
            }
        }



        return false;
    }
}
