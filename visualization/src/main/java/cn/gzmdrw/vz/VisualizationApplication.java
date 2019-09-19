package cn.gzmdrw.vz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(value = {"cn.gzmdrw.vz.mapper"})
public class VisualizationApplication {

    public static void main(String[] args) {
        SpringApplication.run(VisualizationApplication.class, args);
    }

}
