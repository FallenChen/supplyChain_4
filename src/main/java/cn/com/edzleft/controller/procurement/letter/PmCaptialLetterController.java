package cn.com.edzleft.controller.procurement.letter;

import cn.com.edzleft.entity.CreditTable;
import cn.com.edzleft.entity.Letter;
import cn.com.edzleft.service.procurement.letter.PmLetterService;
import cn.com.edzleft.util.page.DataGridJson;
import cn.com.edzleft.util.page.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
@RequestMapping("/Pmletter")
@Controller
public class PmCaptialLetterController {
	@Autowired
	private PmLetterService letterService;
	
	/**
     * 用信管理
     * @param pageNumber 开始页数
     * @param pageSize 每页条数
     * @param letterNumber 用信编号
     * @param belongCredit 所属授信
     * @param letterStatus 状态
     * @param applicant 申请人
     * @return
     */
	 @RequestMapping(value = "/pmUseLetter")
	 @ResponseBody
    public DataGridJson letterSelect(Integer pageNumber,Integer pageSize ,String letterNumber,String belongCredit,String letterStatus,String applicant){
        PageUtil<Letter> userPage = new PageUtil<>();
        HashMap<String,Object> whereMaps =new HashMap<>();
        whereMaps.put("letterNumber",letterNumber);
        whereMaps.put("belongCredit",belongCredit);
        whereMaps.put("letterStatus",letterStatus);
        whereMaps.put("applicant",applicant);
        DataGridJson dgj = new DataGridJson();
        userPage.setCpage(pageNumber);
        userPage.setPageSize(pageSize);
        userPage.setWhereMap(whereMaps);
        userPage = letterService.getOrderEntityListByConditions(userPage);
        dgj.setTotal(userPage.getTotalCount());
        dgj.setRows(userPage.getList());
        return dgj;
    }

    /**
     * 授信管理
     * @param pageNumber 开始页数
     * @param pageSize 每页条数
     * @param creditNumber 授信编号
     * @param creditGrantor 授信方
     * @param creditStatus 状态
     * @param applicant 申请人
     * @return
     */
   
    @RequestMapping(value = "/pmcreditLetter")
    @ResponseBody
    public DataGridJson crownSelect(Integer pageNumber,Integer pageSize ,String creditNumber,String creditGrantor,String creditStatus,String applicant){
        PageUtil<CreditTable> userPage = new PageUtil<>();
        HashMap<String,Object> whereMaps =new HashMap<>();
        whereMaps.put("creditNumber",creditNumber);
        whereMaps.put("creditGrantor",creditGrantor);
        whereMaps.put("creditStatus",creditStatus);
        whereMaps.put("applicant",applicant);
        DataGridJson dgj = new DataGridJson();
        userPage.setCpage(pageNumber);
        userPage.setPageSize(pageSize);
        userPage.setWhereMap(whereMaps);
        userPage = letterService.getCrownEntityListByConditions(userPage);
        dgj.setTotal(userPage.getTotalCount());
        dgj.setRows(userPage.getList());
        return dgj;
        
    }

}
