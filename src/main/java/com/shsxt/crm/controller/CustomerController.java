package com.shsxt.crm.controller;

import com.shsxt.crm.base.BaseController;
import com.shsxt.crm.service.CustomerService;
import com.shsxt.crm.vo.CustomerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 23125 on 2017/8/13.
 */
@Controller
@RequestMapping("customer")
public class CustomerController extends BaseController {
        @Autowired
    private CustomerService customerService;
        @RequestMapping("find_all")
    @ResponseBody
    public List<CustomerVO>findAll(){
            List<CustomerVO> customers = customerService.findAll();
            return customers;
        }

}
