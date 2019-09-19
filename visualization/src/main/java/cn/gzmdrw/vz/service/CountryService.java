package cn.gzmdrw.vz.service;

import cn.gzmdrw.vz.entity.Country;

import java.util.List;

public interface CountryService {
    List<Country> list();
    List<Country> load(int id);
}
