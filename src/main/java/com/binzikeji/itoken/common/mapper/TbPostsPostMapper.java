package com.binzikeji.itoken.common.mapper;

import com.binzikeji.itoken.common.domain.TbPostsPost;
import com.binzikeji.itoken.common.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.MyMapper;

@Repository
@CacheNamespace(implementation = RedisCache.class)
public interface TbPostsPostMapper extends MyMapper<TbPostsPost> {
}