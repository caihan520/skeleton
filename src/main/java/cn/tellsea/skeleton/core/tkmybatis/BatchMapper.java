package cn.tellsea.skeleton.core.tkmybatis;

import tk.mybatis.mapper.annotation.RegisterMapper;

/**
 * 批量操作接口
 *
 * @param <T>
 * @author sunchangtan
 */
@RegisterMapper
public interface BatchMapper<T> extends UpdateBatchByPrimaryKeySelectiveMapper<T> {
}
