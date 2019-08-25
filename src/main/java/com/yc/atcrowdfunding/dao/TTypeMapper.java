package com.yc.atcrowdfunding.dao;

import com.yc.atcrowdfunding.bean.TType;
import com.yc.atcrowdfunding.bean.TTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_type
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int countByExample(TTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_type
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int deleteByExample(TTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_type
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_type
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int insert(TType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_type
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int insertSelective(TType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_type
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    List<TType> selectByExample(TTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_type
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    TType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_type
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") TType record, @Param("example") TTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_type
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int updateByExample(@Param("record") TType record, @Param("example") TTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_type
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(TType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_type
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int updateByPrimaryKey(TType record);
}