package cn.tellsea.skeleton.core.base.service.impl;

import cn.tellsea.skeleton.core.base.mapper.MyMapper;
import cn.tellsea.skeleton.core.base.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    private MyMapper<T> mapper;

    public void allApi23() {
        // 新增
        mapper.insert(null);
        mapper.insertSelective(null);
        mapper.insertList(null);
        mapper.insertUseGeneratedKeys(null);
        // 修改
        mapper.updateByPrimaryKey(null);
        mapper.updateByPrimaryKeySelective(null);
        mapper.updateByExample(null, null);
        mapper.updateByExampleSelective(null, null);
        mapper.updateBatchByPrimaryKeySelective(null);
        // 删除
        mapper.delete(null);
        mapper.deleteByPrimaryKey(null);
        mapper.deleteByIds(null);
        mapper.deleteByExample(null);
        // 查询单个
        mapper.selectByPrimaryKey(null);
        mapper.selectOne(null);
        mapper.selectOneByExample(null);
        // 查询多个
        mapper.select(null);
        mapper.selectAll();
        mapper.selectByExample(null);
        mapper.selectByRowBounds(null, null);
        mapper.selectByExampleAndRowBounds(null, null);
        // 计数
        mapper.selectCount(null);
        mapper.selectCountByExample(null);
    }

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
