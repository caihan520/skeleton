package cn.tellsea.core.base.controller;

import cn.tellsea.core.base.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class BaseController<T> {

    @Autowired
    public BaseService<T> baseService;

    @GetMapping("selectAll")
    @ResponseBody
    public List<T> selectAll() {
        return baseService.selectAll();
    }
}
