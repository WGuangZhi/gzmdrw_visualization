package cn.gzmdrw.vz.mapper;

import cn.gzmdrw.vz.entity.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PermissionMapper {
    List<Permission> list();
}
