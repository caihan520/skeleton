package cn.tellsea.core.base.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.DeleteByIdsMapper;

public interface MyMapper<T> extends Mapper<T>, DeleteByIdsMapper<T> {
}
