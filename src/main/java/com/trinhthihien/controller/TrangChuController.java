package com.trinhthihien.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TrangChuController {
    @RequestMapping("/")
    public String trangChu(){
        return "trangchu";
    }
    @RequestMapping("trangchu")
    public String returntrangChu(){
        return "trangchu";
    }
}
