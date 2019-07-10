package cn.tellsea.core.base.service.impl;

import cn.tellsea.core.base.mapper.MyMapper;
import cn.tellsea.core.base.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    private MyMapper<T> mapper;

    @Override
    public List<T> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public T selectById(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    @Override
    public void insert(T entity) {
        mapper.insert(entity);
    }

    @Override
    public void insertByNotNull(T entity) {
        mapper.insertSelective(entity);
    }

    @Override
    public void deleteById(Object key) {
        mapper.deleteByPrimaryKey(key);
    }

    @Override
    public void deleteByIds(String ids) {
        mapper.deleteByIds(ids);
    }

    @Override
    public void updateById(T entity) {
        mapper.updateByPrimaryKey(entity);
    }

    @Override
    public void updateByIdNotNull(T entity) {
        mapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }
}
