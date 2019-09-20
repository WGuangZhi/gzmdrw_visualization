package cn.gzmdrw.vz.controller;

import cn.gzmdrw.vz.common.R;
import cn.gzmdrw.vz.entity.Goods;
import cn.gzmdrw.vz.service.GoodsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Resource
    private GoodsService goodsService;

    @GetMapping("/list")
    public R list(){
        return R.isOk().data(goodsService.list());
    }

    @GetMapping("/load/{year}")
    public R List(@PathVariable int year){
        return R.isOk().data(goodsService.load(year));
    }
}
