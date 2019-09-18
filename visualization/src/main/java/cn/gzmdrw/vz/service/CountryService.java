package cn.gzmdrw.vz.service;

import cn.gzmdrw.vz.entity.Country;

import java.util.List;

public interface CountryService {
    List<Country> list();
    Country load(int id);
}
