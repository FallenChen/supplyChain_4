package cn.com.edzleft.dao.captial.letter;

import cn.com.edzleft.entity.CreditTable;
import cn.com.edzleft.entity.Letter;
import cn.com.edzleft.util.page.PageUtil;

import java.util.List;
import java.util.Map;

public interface CreditTableMapper {

    /**授信
     * 根据Map<String,Object>对象查询符合条件的总数据数
     * @param  userPage
     * @return
     */
    int getCrownEntityCountsByConditions(PageUtil<CreditTable> userPage);

    /**授信
     * 根据Map<String,Object>分页查询
     * @param userPage
     * @param
     * @return
     */
    List<CreditTable> getCrownEntityListByConditions(PageUtil<CreditTable> userPage);

    List<Letter> getCrownEntityListByConditionss(PageUtil<Letter> userPage);
    /**
     * 接口查询授信
     * @return
     */
    List<Map<String,Object>> creditSelect();
}