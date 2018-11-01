package com.pb.appsystem.servers;

import com.pb.appsystem.pojo.BackendUser;
import org.apache.ibatis.annotations.Param;

public interface BackendUserService {

    boolean findUserByUserCode(String userCode,String password);
}
