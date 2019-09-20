package cn.gzmdrw.vz.service.impl;

import cn.gzmdrw.vz.entity.Financia;
import cn.gzmdrw.vz.mapper.FinanciaMapper;
import cn.gzmdrw.vz.service.FinanciaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FinanciaServiceImpl implements FinanciaService {
    @Resource
    private FinanciaMapper financiaMapper;
    @Override
    public List<Financia> list() {
        return financiaMapper.list();
    }

    @Override
    public Financia load(int year) {
        return financiaMapper.load(year);
    }
}
