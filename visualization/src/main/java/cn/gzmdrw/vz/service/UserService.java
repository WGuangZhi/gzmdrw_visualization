package cn.gzmdrw.vz.service;

import cn.gzmdrw.vz.entity.User;

import java.util.List;

public interface UserService {
	User load(int id);
	List<User> list();
}
