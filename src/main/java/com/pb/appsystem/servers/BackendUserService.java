package com.pb.appsystem.servers;

public interface BackendUserService {

    boolean findUserByUserCode(String userCode,String password);
}
