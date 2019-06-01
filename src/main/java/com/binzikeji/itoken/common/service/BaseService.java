package com.binzikeji.itoken.common.service;

import com.binzikeji.itoken.common.domain.BaseDomain;
import com.github.pagehelper.PageInfo;

import javax.xml.ws.Service;

/**
 * @Description
 * @Author Bin
 * @Date 2019/4/22 17:05
 **/
public interface BaseService<T extends BaseDomain> {

    int insert(T t, String createBy);

    int delete(T t);

    int update(T t, String updateBy);

    int count(T t);

    T selectOne(T t);

    PageInfo<T> page(int pageNum, int pageSize, T t);
}
