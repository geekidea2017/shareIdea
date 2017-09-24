package com.shareidea.dao;
import com.shareidea.entity.UserInfo;
public interface IUserInfoDAO {
	UserInfo getActiveUser(String userName);
}