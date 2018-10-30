package com.hllinc.sbmpmc.mapper;

import com.hllinc.sbmpmc.model.UserDomain;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author hongliang5
 * @Date 2018/10/12 上午11:27
 **/
@Mapper
public interface UserMapper {
    @Insert("INSERT INTO T_USER(userName, PASSWORD, PHONE, createDateTimestamp) VALUES(#{userName}, #{password}, #{phone}, UNIX_TIMESTAMP(#{createDate}))")
    @Options(useGeneratedKeys = true, keyProperty = "userId")
    int insertByUser(UserDomain user);

    @Delete("delete from t_user where userId=#{userId}")
    int deleteUserById(int userId);

    @Update("update t_user set " +
            "userName=#{userName}," +
            "password=#{password}," +
            "phone=#{phone} " +
            "where " +
            "userId=#{userId}")
    int updateUser(UserDomain userDomain);

    @Select("select * from t_user where userId=#{userId}")
    UserDomain findUserById(@Param("userId") int userId);

    @Insert("INSERT INTO T_USER(userName, PASSWORD, PHONE) VALUES(#{userName}, #{password}, #{phone})")
    int insert(@Param("userName") String userName, @Param("password") String password, @Param("phone") String phone);

    @Select("select * from t_user ${condition}")
    List<UserDomain> selectUsers(@Param("condition") String condition);
}
