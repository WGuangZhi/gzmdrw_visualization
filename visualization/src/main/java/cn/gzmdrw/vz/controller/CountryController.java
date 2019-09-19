package cn.gzmdrw.vz.controller;

import cn.gzmdrw.vz.common.R;
import cn.gzmdrw.vz.entity.Country;
import cn.gzmdrw.vz.entity.GDP;
import cn.gzmdrw.vz.entity.Permission;
import cn.gzmdrw.vz.entity.Year;
import cn.gzmdrw.vz.service.CountryService;
import cn.gzmdrw.vz.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Resource
    private PermissionService permissionService;
    @GetMapping("/list")
    public R list(){
        return R.isOk().data(countryService.list());
    }

    @GetMapping("/load/{id}")
    public R load(@PathVariable int id){
        return R.isOk().data(countryService.load(id));
    }

    @GetMapping("/permission/list")
    public R pers(){
        List<Permission> pers=permissionService.list();
        List<Permission> pers2=new ArrayList<Permission>();
        List<Permission> pers3=null;

        for (Permission per:pers){
            if (per.getParentId()==0){
                pers2.add(per);
            }else {
                for (Permission permission:pers2){
                    if (permission.getId()==per.getParentId()){
                        //pers3.add(per);
                        pers3=new ArrayList<Permission>();
                        if (permission.getPers()!=null)
                            pers3=permission.getPers();
                        pers3.add(per);
                        permission.setPers(pers3);
                        //permission.setPres(newPer);
                    }
                }
            }
        }
        return R.isOk().data(pers2);
    }
}
