package cn.gzmdrw.vz.service;

import cn.gzmdrw.vz.entity.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> list();
    Goods load(int year);
}
