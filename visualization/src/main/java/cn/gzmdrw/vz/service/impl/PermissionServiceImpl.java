package cn.gzmdrw.vz.service.impl;

import cn.gzmdrw.vz.entity.Permission;
import cn.gzmdrw.vz.mapper.PermissionMapper;
import cn.gzmdrw.vz.service.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Resource
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> list() {
        return permissionMapper.list();
    }
}
