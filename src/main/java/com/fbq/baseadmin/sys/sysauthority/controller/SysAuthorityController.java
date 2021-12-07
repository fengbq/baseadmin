package com.fbq.baseadmin.sys.sysauthority.controller;

import com.fbq.baseadmin.common.controller.CommonController;
import com.fbq.baseadmin.sys.sysauthority.pojo.SysAuthority;
import com.fbq.baseadmin.sys.sysauthority.service.SysAuthorityService;
import com.fbq.baseadmin.sys.sysauthority.vo.SysAuthorityVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/sys/sysAuthority/")
public class SysAuthorityController extends CommonController<SysAuthorityVo, SysAuthority, String> {
    @Autowired
    private SysAuthorityService sysAuthorityService;

    @GetMapping("authority")
    public ModelAndView authority(){
        return new ModelAndView("sys/authority/authority");
    }

}
