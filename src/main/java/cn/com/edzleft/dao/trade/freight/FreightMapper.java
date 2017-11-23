package cn.com.edzleft.dao.trade.freight;

import cn.com.edzleft.entity.Freight;

import java.util.List;

/**
 * Created by ibmtech on 2017/11/22.
 */
public interface FreightMapper {

    /**
     * 查询所有的货运单位
     */
    public List<Freight> selectAllFreight();

    /**
     * 添加货运单位
     */
    public void insertFreight(Freight freight);

    /**
     * 根据货运单位id 删除货运单位
     */
    public void deleteFreight(Integer id);

    /**
     * 设置为默认货运单位
     */
    public int updateFreight(Freight freight);

    /**
     * 查询出默认地址的货运单位
     */
    public List<Freight> selectFreightByAddress();

}
