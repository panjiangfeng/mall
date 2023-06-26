package com.test.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.test.entity.Userinfo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserinfoMapper extends BaseMapper<Userinfo> {
    String querySql = "SELECT a.*, b.username FROM userinfo AS a,user AS b where b.id = a.id ";
    String dimquerySql = "SELECT a.*, b.username FROM userinfo AS a,user AS b where b.id = a.id ";

    @Select(querySql)                    //多表的关联并且分页查询
    List<Userinfo> userinfoPagelistAnduser(Page page);

    @Select(dimquerySql)                    //多表的关联并且模糊查询
    List<Userinfo> userAnduserdimquery(QueryWrapper querywrapper);
}
