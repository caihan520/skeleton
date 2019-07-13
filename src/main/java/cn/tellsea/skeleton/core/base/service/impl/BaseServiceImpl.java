package cn.tellsea.skeleton.core.base.service.impl;

import cn.tellsea.skeleton.core.base.mapper.MyMapper;
import cn.tellsea.skeleton.core.base.service.BaseService;
import cn.tellsea.skeleton.core.common.enums.StatusEnums;
import cn.tellsea.skeleton.core.common.exception.SkeletonException;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 基类接口实现类
 *
 * @author tellsea
 * @date 2019/7/12
 * @param <T> 不能为空
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    private MyMapper<T> mapper;

    @Override
    public void insert(T record) {
        if (record == null) {
            throw new SkeletonException(StatusEnums.PARAM_NOT_NULL);
        }
        mapper.insert(record);
    }

    @Override
    public void insertSelective(T record) {
        if (record == null) {
            throw new SkeletonException(StatusEnums.PARAM_NOT_NULL);
        }
        mapper.insertSelective(record);
    }

    @Override
    public void insertList(List<? extends T> recordList) {
        if (CollectionUtils.isEmpty(recordList)) {
            throw new SkeletonException(StatusEnums.PARAM_NOT_NULL);
        }
        mapper.insertList(recordList);
    }

    @Override
    public void insertUseGeneratedKeys(T record) {
        if (record == null) {
            throw new SkeletonException(StatusEnums.PARAM_NOT_NULL);
        }
        mapper.insertUseGeneratedKeys(record);
    }

    @Override
    public void delete(T record) {
        if (record == null) {
            throw new SkeletonException(StatusEnums.PARAM_NOT_NULL);
        }
        mapper.delete(record);
    }

    @Override
    public void deleteByPrimaryKey(Object key) {
        if (ObjectUtils.isEmpty(key)) {
            throw new SkeletonException(StatusEnums.PARAM_NOT_NULL);
        }
        mapper.deleteByPrimaryKey(key);
    }

    @Override
    public void deleteByIds(String ids) {
        if (StringUtils.isEmpty(ids)) {
            throw new SkeletonException(StatusEnums.PARAM_NOT_NULL);
        }
        mapper.deleteByIds(ids);
    }

    @Override
    public void deleteByExample(Object example) {
        if (ObjectUtils.isEmpty(example)) {
            throw new SkeletonException(StatusEnums.PARAM_NOT_NULL);
        }
        mapper.deleteByExample(example);
    }

    @Override
    public void updateByPrimaryKey(T record) {
        if (record == null) {
            throw new SkeletonException(StatusEnums.PARAM_NOT_NULL);
        }
        mapper.updateByPrimaryKey(record);
    }

    @Override
    public void updateByPrimaryKeySelective(T record) {
        if (record == null) {
            throw new SkeletonException(StatusEnums.PARAM_NOT_NULL);
        }
        mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public void updateByExample(T record, Object example) {
        if (record == null || ObjectUtils.isEmpty(example)) {
            throw new SkeletonException(StatusEnums.PARAM_NOT_NULL);
        }
        mapper.updateByExample(record, example);
    }

    @Override
    public void updateByExampleSelective(T record, Object example) {
        if (record == null || ObjectUtils.isEmpty(example)) {
            throw new SkeletonException(StatusEnums.PARAM_NOT_NULL);
        }
        mapper.updateByExampleSelective(record, example);
    }

    @Override
    public void updateBatchByPrimaryKeySelective(List<? extends T> recordList) {
        if (CollectionUtils.isEmpty(recordList)) {
            throw new SkeletonException(StatusEnums.PARAM_NOT_NULL);
        }
        mapper.updateBatchByPrimaryKeySelective(recordList);
    }

    @Override
    public T selectByPrimaryKey(Object key) {
        if (ObjectUtils.isEmpty(key)) {
            throw new SkeletonException(StatusEnums.PARAM_NOT_NULL);
        }
        return mapper.selectByPrimaryKey(key);
    }

    @Override
    public T selectOne(T record) {
        if (record == null) {
            throw new SkeletonException(StatusEnums.PARAM_NOT_NULL);
        }
        return mapper.selectOne(record);
    }

    @Override
    public T selectOneByExample(Object example) {
        if (ObjectUtils.isEmpty(example)) {
            throw new SkeletonException(StatusEnums.PARAM_NOT_NULL);
        }
        return mapper.selectOneByExample(example);
    }

    @Override
    public List<T> select(T record) {
        if (record == null) {
            throw new SkeletonException(StatusEnums.PARAM_NOT_NULL);
        }
        return mapper.select(record);
    }

    @Override
    public List<T> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public List<T> selectByExample(Object example) {
        if (ObjectUtils.isEmpty(example)) {
            throw new SkeletonException(StatusEnums.PARAM_NOT_NULL);
        }
        return mapper.selectByExample(example);
    }

    @Override
    public List<T> selectByRowBounds(T record, RowBounds rowBounds) {
        if (record == null || rowBounds == null) {
            throw new SkeletonException(StatusEnums.PARAM_NOT_NULL);
        }
        return mapper.selectByRowBounds(record, rowBounds);
    }

    @Override
    public List<T> selectByExampleAndRowBounds(Object example, RowBounds rowBounds) {
        if (ObjectUtils.isEmpty(example) || rowBounds == null) {
            throw new SkeletonException(StatusEnums.PARAM_NOT_NULL);
        }
        return mapper.selectByExampleAndRowBounds(example, rowBounds);
    }
}
