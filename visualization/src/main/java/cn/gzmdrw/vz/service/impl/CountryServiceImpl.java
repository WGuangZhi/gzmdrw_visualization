package cn.gzmdrw.vz.service.impl;

import cn.gzmdrw.vz.entity.Country;
import cn.gzmdrw.vz.entity.GDP;
import cn.gzmdrw.vz.entity.Year;
import cn.gzmdrw.vz.mapper.CountryMapper;
import cn.gzmdrw.vz.service.CountryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CountryServiceImpl implements CountryService {
    @Resource
    private CountryMapper countryMapper;
    @Override
    public Map list() {
        Map map=new HashMap();
        List<Country> countries=countryMapper.list();
        List<String> countrs=new ArrayList<String>();//国家
        List<Integer> years=new ArrayList<Integer>();//年份
        List<String> cnDGP=new ArrayList<String>();//中国
        List<String> jpDGP=new ArrayList<String>();//日本
        List<String> rkDGP=new ArrayList<String>();//韩国
        List<String> brDGP=new ArrayList<String>();//英国
        List<String> gmDGP=new ArrayList<String>();//德国
        List<String> usDGP=new ArrayList<String>();//美国
        for (Country count:countries){
            countrs.add(count.getCountry());
            //取其中一个年份数据
            if(count.getId()==1){
                for(Year y:count.getC_years()){
                    years.add(y.getYear());
                }
            }
            for(Year year:count.getC_years()){
                for(GDP gdp:year.getC_gdps()){
                    //gdp.getMeiyuan();
                    if(gdp.getCountryId()==1){
                        cnDGP.add(gdp.getMeiyuan());//中国
                    }else if(gdp.getCountryId()==2){
                        jpDGP.add(gdp.getMeiyuan());//日本
                    }else if(gdp.getCountryId()==3){
                        rkDGP.add(gdp.getMeiyuan());//韩国
                    }else if(gdp.getCountryId()==4){
                        brDGP.add(gdp.getMeiyuan());//英国
                    }else if(gdp.getCountryId()==5){
                        gmDGP.add(gdp.getMeiyuan());//德国
                    }else if(gdp.getCountryId()==6){
                        usDGP.add(gdp.getMeiyuan());//美国
                    }
                }
            }
        }
        map.put("countrs",countrs);//国家裂变
        map.put("years",years);//年份
        map.put("cnDGP",cnDGP);//中国
        map.put("jpDGP",jpDGP);//日本
        map.put("rkDGP",rkDGP);//韩国
        map.put("brDGP",brDGP);//英国
        map.put("gmDGP",gmDGP);//德国
        map.put("usDGP",usDGP);//美国
        return map;
    }

    @Override
    public Map load(int id) {
        Map map=new HashMap<>();
        List<Country> countrys=countryMapper.load(id);
        List<Map> listMap=new ArrayList<Map>();
        List<String> opinion=new ArrayList<String>();
        for(Country countr:countrys){
            opinion.add(countr.getCountry());
            for (Year yea:countr.getC_years()){
                for (GDP gd:yea.getC_gdps()){
                    Map opinionData=new HashMap();
                    opinionData.put("value",gd.getMeiyuan());
                    opinionData.put("name",countr.getCountry());
                    listMap.add(opinionData);
                }
            }
        }
        map.put("opinion",opinion);
        map.put("opinionData",listMap);
        return map;
    }
}
