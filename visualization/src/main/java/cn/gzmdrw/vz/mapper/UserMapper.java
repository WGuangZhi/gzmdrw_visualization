package cn.gzmdrw.vz.mapper;

import org.apache.ibatis.annotations.Mapper;

import cn.gzmdrw.vz.entity.User;

import java.util.List;

@Mapper
public interface UserMapper {
	User load(int id);
	List<User> list();
}
