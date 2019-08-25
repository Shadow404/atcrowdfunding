package com.yc.atcrowdfunding.dao;

import com.yc.atcrowdfunding.bean.TCert;
import com.yc.atcrowdfunding.bean.TCertExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCertMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cert
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int countByExample(TCertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cert
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int deleteByExample(TCertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cert
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cert
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int insert(TCert record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cert
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int insertSelective(TCert record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cert
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    List<TCert> selectByExample(TCertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cert
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    TCert selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cert
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") TCert record, @Param("example") TCertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cert
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int updateByExample(@Param("record") TCert record, @Param("example") TCertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cert
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(TCert record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cert
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int updateByPrimaryKey(TCert record);
}