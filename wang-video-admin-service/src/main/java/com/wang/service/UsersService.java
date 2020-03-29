package com.wang.service;

import com.wang.pojo.Users;
import com.wang.utils.PagedResult;

public interface UsersService {

	public PagedResult queryUsers(Users user, Integer page, Integer pageSize);
	
}
