package com.briup.cms.service;

import com.briup.cms.bean.Link;
import com.briup.cms.exception.CustomerException;

import java.util.List;

public interface ILinkService {
    void saveOrupdate(Link link) throws CustomerException;

    void deleteLink(int id) throws CustomerException;

    Link findById(int id) throws  CustomerException;

    List<Link> findAll() throws  CustomerException;




}
