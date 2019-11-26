package com.briup.cms.web.controller;

import com.briup.cms.bean.Link;
import com.briup.cms.service.ILinkService;
import com.briup.cms.util.Message;
import com.briup.cms.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/link")
@Api(description = "链接管理")
public class LinkController {
    @Autowired
    private ILinkService linkService;

    @PostMapping("/add")
    @ApiOperation("添加链接")
    public Message addLink(Link link){
        linkService.saveOrupdate(link);
        return MessageUtil.success();
    }

    @GetMapping("/deleteById")
    @ApiOperation("根据id删除链接")
    @ApiImplicitParam(name = "id",value = "链接id",paramType = "query",dataType = "int",required = true)
    public Message deleteLink(int id){
        linkService.deleteLink(id);
        return MessageUtil.success();
    }

    @GetMapping("/queryById")
    @ApiOperation("根据id查询数据")
    @ApiImplicitParam(name = "id",value = "链接id",paramType = "query",dataType = "int",required = true)
    public Message<Link> queryById(int id){
       Link link = linkService.findById(id);
        return MessageUtil.success(link);
    }

    @PostMapping("/update")
    @ApiOperation("修改链接")
    private Message update(Link link){
        linkService.saveOrupdate(link);
        return MessageUtil.success();
    }

    @GetMapping("/findALL")
    @ApiOperation("查询所有链接")
    public Message<List<Link>> findAll(){
        List list = linkService.findAll();
        return  MessageUtil.success(list);
    }


}
