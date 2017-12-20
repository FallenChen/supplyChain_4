package cn.com.edzleft.dao.trade.assistContract;

import cn.com.edzleft.entity.AssistContract;
import cn.com.edzleft.util.page.PageUtil;

import java.util.List;

/**
 * Created by ibmtech on 2017/12/18.
 */
public interface AssistContractMapper {

    /**
     * 根据主合同id 查询辅合同集合
     * @param contractId
     */
    public List<AssistContract> selectAssistContractListById(Integer contractId);


}
