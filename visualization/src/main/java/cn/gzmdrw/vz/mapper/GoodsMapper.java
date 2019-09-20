package cn.gzmdrw.vz.mapper;

import cn.gzmdrw.vz.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//货物Mapper
@Mapper
public interface GoodsMapper {
    List<Goods> list();
    Goods load(int year);
}
