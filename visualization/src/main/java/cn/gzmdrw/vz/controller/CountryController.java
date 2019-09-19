package cn.gzmdrw.vz.controller;

import cn.gzmdrw.vz.common.R;
import cn.gzmdrw.vz.entity.Country;
import cn.gzmdrw.vz.entity.GDP;
import cn.gzmdrw.vz.entity.Year;
import cn.gzmdrw.vz.service.CountryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
