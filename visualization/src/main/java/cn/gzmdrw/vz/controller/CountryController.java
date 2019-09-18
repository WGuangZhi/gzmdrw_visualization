package cn.gzmdrw.vz.controller;

import cn.gzmdrw.vz.common.R;
import cn.gzmdrw.vz.service.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/country")
public class CountryController {
    @Resource
    private CountryService countryService;

    @GetMapping("/list")
    public R list(){
        return R.isOk().data(countryService.list());
    }

    @GetMapping("/load/{id}")
    public R load(@PathVariable int id){
        return R.isOk().data(countryService.load(id));
    }
}
