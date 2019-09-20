package cn.gzmdrw.vz.controller;

import cn.gzmdrw.vz.common.R;
import cn.gzmdrw.vz.service.FinanciaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("financia")
public class FinanciaController {
    @Resource
    private FinanciaService financiaService;

    @GetMapping("/list")
    public R list(){
        return R.isOk().data(financiaService.list());
    }

    @GetMapping("/load/{year}")
    public  R load(@PathVariable int year){
        return R.isOk().data(financiaService.load(year));
    }
}
