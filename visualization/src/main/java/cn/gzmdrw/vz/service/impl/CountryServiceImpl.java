package cn.gzmdrw.vz.service.impl;

import cn.gzmdrw.vz.entity.Country;
import cn.gzmdrw.vz.mapper.CountryMapper;
import cn.gzmdrw.vz.service.CountryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CountryServiceImpl implements CountryService {
    @Resource
    private CountryMapper countryMapper;
    @Override
    public List<Country> list() {
        return countryMapper.list();
    }

    @Override
    public Country load(int id) {
        return countryMapper.load(id);
    }
}
