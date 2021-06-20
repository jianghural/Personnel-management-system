package com.chinasofti.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinasofti.pojo.Page;
import com.chinasofti.pojo.UserInf;

public interface UserInfMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_inf
     *
     * @mbggenerated Tue Jun 15 13:00:02 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_inf
     *
     * @mbggenerated Tue Jun 15 13:00:02 CST 2021
     */
    int insert(UserInf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_inf
     *
     * @mbggenerated Tue Jun 15 13:00:02 CST 2021
     */
    int insertSelective(UserInf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_inf
     *
     * @mbggenerated Tue Jun 15 13:00:02 CST 2021
     */
    UserInf selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_inf
     *
     * @mbggenerated Tue Jun 15 13:00:02 CST 2021
     */
    int updateByPrimaryKeySelective(UserInf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_inf
     *
     * @mbggenerated Tue Jun 15 13:00:02 CST 2021
     */
    int updateByPrimaryKey(UserInf record);
    
	
	// 多个参数 @param 注入
	List<UserInf> getUsers(@Param("username")String username, @Param("status")int status, @Param("page")Page page);
	int getTotal(@Param("username")String username, @Param("status")int status);
	
	UserInf login(UserInf user);
	void updatePassword(@Param("newpassword")String newpassword,@Param("id")int id);
}