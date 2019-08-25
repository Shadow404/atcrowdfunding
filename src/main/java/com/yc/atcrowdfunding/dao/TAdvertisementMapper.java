package com.yc.atcrowdfunding.dao;

import com.yc.atcrowdfunding.bean.TAdvertisement;
import com.yc.atcrowdfunding.bean.TAdvertisementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAdvertisementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertisement
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int countByExample(TAdvertisementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertisement
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int deleteByExample(TAdvertisementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertisement
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertisement
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int insert(TAdvertisement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertisement
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int insertSelective(TAdvertisement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertisement
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    List<TAdvertisement> selectByExample(TAdvertisementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertisement
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    TAdvertisement selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertisement
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") TAdvertisement record, @Param("example") TAdvertisementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertisement
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int updateByExample(@Param("record") TAdvertisement record, @Param("example") TAdvertisementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertisement
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(TAdvertisement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertisement
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int updateByPrimaryKey(TAdvertisement record);
}