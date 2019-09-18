package cn.gzmdrw.vz.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.gzmdrw.vz.entity.User;
import cn.gzmdrw.vz.mapper.UserMapper;
import cn.gzmdrw.vz.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;
	
	@Override
	public User load(int id) {
		return userMapper.load(id);
	}

	@Override
	public List<User> list() {
		return userMapper.list();
	}

}
