package com.pb.appsystem.repository;

import com.pb.appsystem.pojo.AppInfo;
import com.pb.appsystem.pojo.BackendUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BackendUserRepository {
    //根据用户名获得用户实体
    BackendUser findUserByUserCode(@Param("userCode") String userCode);

    List<AppInfo> findAppInfoByStatus(@Param("status") Integer status);
}
