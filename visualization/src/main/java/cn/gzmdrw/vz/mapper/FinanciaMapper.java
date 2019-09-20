package cn.gzmdrw.vz.mapper;

import cn.gzmdrw.vz.entity.Financia;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FinanciaMapper {
    List<Financia> list();
    Financia load(int year);
}
