package com.chenxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version 1.0
 * @author chenxy
 * @<p>
 *     建表
 * </p>
 */
@Controller
@RequestMapping(value="/table")
public class TableController {

    @RequestMapping(value="/create-table")
    public String createTable(){

        return "table/create-table";
    }
}
