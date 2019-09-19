package cn.gzmdrw.vz.mapper;

import cn.gzmdrw.vz.entity.Country;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CountryMapper {
    List<Country> list();
    List<Country> load(int id);
}
