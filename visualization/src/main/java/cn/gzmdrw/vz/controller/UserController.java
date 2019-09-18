package cn.gzmdrw.vz.controller;

import javax.annotation.Resource;

import cn.gzmdrw.vz.common.R;
import org.springframework.web.bind.annotation.*;

import cn.gzmdrw.vz.entity.User;
import cn.gzmdrw.vz.service.UserService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {
	@Resource
	private UserService userService;
	
	@GetMapping("/load/{id}")
	public R load(@PathVariable int id){
		return R.isOk().data(userService.load(id));
	}

	@GetMapping("list")
	public R list(){
		return R.isOk().data(userService.list());
	}
}
