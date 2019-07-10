package cn.tellsea.core.base.service;

import java.util.List;

public interface BaseService<T> {

    /**
     * 查询所有
     *
     * @return
     */
    List<T> selectAll();

    /**
     * 根据id查询
     *
     * @param key
     * @return
     */
    T selectById(Object key);

    /**
     * 新增所有字段
     *
     * @param entity
     */
    void insert(T entity);

    /**
     * 根据非空字段新增
     *
     * @param entity
     */
    void insertByNotNull(T entity);

    /**
     * 根据id删除
     *
     * @param key
     */
    void deleteById(Object key);

    /**
     * 根据多个id批量删除
     *
     * @param ids
     */
    void deleteByIds(String ids);

    /**
     * 根据id更新所有字段
     *
     * @param entity
     */
    void updateById(T entity);

    /**
     * 根据id更新非空字段
     *
     * @param entity
     */
    void updateByIdNotNull(T entity);


    /**
     * 根据自定义条件查询
     *
     * @param example
     * @return
     */
    List<T> selectByExample(Object example);
}
