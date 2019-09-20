package cn.gzmdrw.vz.service.impl;

import cn.gzmdrw.vz.entity.Goods;
import cn.gzmdrw.vz.mapper.GoodsMapper;
import cn.gzmdrw.vz.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> list() {
        return goodsMapper.list();
    }

    @Override
    public Goods load(int year) {
        return goodsMapper.load(year);
    }
}
