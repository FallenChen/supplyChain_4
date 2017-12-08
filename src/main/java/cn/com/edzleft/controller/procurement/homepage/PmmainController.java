package cn.com.edzleft.controller.procurement.homepage;

import cn.com.edzleft.entity.*;
import cn.com.edzleft.service.procurement.freight.PmFreightService;
import cn.com.edzleft.service.procurement.homepage.PmHomePageService;
import cn.com.edzleft.service.procurement.receivingaddress.PmReceivingAddressService;
import cn.com.edzleft.service.trade.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by ASUS on 2017/11/15.
 */
@RequestMapping("/procurementMain")
@Controller

public class PmmainController {
	@Autowired
	private PmHomePageService pmHomePageService;
	
	@Autowired
    private AccountService accountService;

	@Autowired
	private PmFreightService pmfreightservice;
	
	@Autowired
	private PmReceivingAddressService pmreceivingAddressservice;
	
	
	/**
	 * 添加银行卡第三步
	 * @return
	 */
	@RequestMapping(value="bankThree")
	public String bankThree(){
		return "/procurement/information/bankThree";
	}
	
	/**
	 * 添加银行卡第二步
	 * @return
	 */
	@RequestMapping(value="bankTwo")
	public String bankTwo(){
		return "/procurement/information/bankTwo";
	}
	
	/**
	 * 添加银行卡第一步
	 * @return
	 */
	@RequestMapping(value="bankOne")
	public String bankOne(){
		
		return "/procurement/information/bankOne";
	}
	
	/**
	 * 管理收货信息
	 * @return
	 */
	@RequestMapping(value = "glshxx")
	public ModelAndView glshxx(HttpSession sessionInfo){
        ModelAndView modelAndView = new ModelAndView("/procurement/information/information");
        SessionInfo session = (SessionInfo) sessionInfo.getAttribute("sessionInfo");
        Integer userId = session.getAdmin().getUserId();
        Information information = pmHomePageService.homePageSelect(userId);
        modelAndView.addObject("information",information);
        modelAndView.addObject("messages", "recieverAddress");
        return modelAndView;
	}
	
    /**
     * 认证资料
     * @return
     */
    @RequestMapping(value = "zlrz")
    public String zlrz(){
        return "procurement/information/attestation";
    }

    /**
     * 资料编辑
     * @return
     */
    @RequestMapping(value = "updateInformation")
    public ModelAndView updateInformation(HttpSession sessionInfo){
    	ModelAndView mv = new ModelAndView("procurement/information/updateInformation");
        SessionInfo session = (SessionInfo) sessionInfo.getAttribute("sessionInfo");
        Integer userId = session.getAdmin().getUserId();
        Information information = pmHomePageService.homePageSelect(userId);
        mv.addObject("information",information);
        return mv;
    }
    /**
     * 确认修改资料
     */
    
    @RequestMapping(value = "cupdateInformation")
    @ResponseBody
    public int updateInformation(Information information){
    	int i = pmHomePageService.updateInformation(information);
        return i;
    }

    /**
     * 查看订单
     * @return
     */
	@RequestMapping("insertOrder")
	public String insertOrder(){
		return "procurement/order/insertOrder";
	}

    /**
     * 订单查看
     * @return
     */
	@RequestMapping(value = "ddck")
	public ModelAndView ddck(String value){
		ModelAndView mv = new ModelAndView("/procurement/order/viewOrder");
		Order order  = pmHomePageService.selectByPrimaryKey(value);
		//获取运货单位
		Integer logisticsUnitId = order.getLogisticsUnitId();
		Integer addressId = order.getReceivingAddressId();
		
        Freight freight = pmfreightservice.queryFreightById(logisticsUnitId);
        ReceivingAddress receivingAddress = pmreceivingAddressservice.queryReceivingAddress(addressId);
		
        mv.addObject("order", order);
		mv.addObject("freight", freight);
		mv.addObject("receivingAddress",receivingAddress);
        return mv;
    }

    /**
     * 账户安全
     * @return
     */
    @RequestMapping(value = "messages")
    public ModelAndView messages(HttpSession sessionInfo){
        ModelAndView modelAndView = new ModelAndView("/procurement/information/information");
        SessionInfo session = (SessionInfo) sessionInfo.getAttribute("sessionInfo");
        Integer userId = session.getAdmin().getUserId();
        Information information = pmHomePageService.homePageSelect(userId);
        modelAndView.addObject("information",information);
        modelAndView.addObject("messages", "profile");
        return modelAndView;
    }

    /**
     * 基本资料
     * @return
     */
    @RequestMapping(value = "ziliao")
    public ModelAndView ziliao(HttpSession sessionInfo){
        ModelAndView mv = new ModelAndView("/procurement/information/information");
        SessionInfo session = (SessionInfo) sessionInfo.getAttribute("sessionInfo");
        Integer userId = session.getAdmin().getUserId();
        Information information = pmHomePageService.homePageSelect(userId);
        mv.addObject("information",information);
        mv.addObject("messages", "home");
        return mv;
    }
    /**
     * main资料
     */
   @RequestMapping(value = "/xtsy")
    public ModelAndView mains(HttpSession sessionInfo){
        ModelAndView mv = new ModelAndView("/procurement/mains");
        SessionInfo session = (SessionInfo) sessionInfo.getAttribute("sessionInfo");
        Integer userId = session.getAdmin().getUserId();
        Information information = pmHomePageService.homePageSelect(userId);
        mv.addObject("information",information);
        return mv;
    }
    
    /**
     * 资金账户
     * @return
     */
    @RequestMapping(value = "zijin")
    public ModelAndView zijin(HttpSession sessionInfo){
        ModelAndView modelAndView = new ModelAndView("/procurement/information/information");
        SessionInfo session = (SessionInfo) sessionInfo.getAttribute("sessionInfo");
        Integer userId = session.getAdmin().getUserId();
        Information information = pmHomePageService.homePageSelect(userId);
        modelAndView.addObject("information",information);
        modelAndView.addObject("messages", "settings");
        return modelAndView;
    }

    /**
     * 我的设置
     * @return
     */
    @RequestMapping(value = "setting")
    public String setting(){
        return "/procurement/setting/setting";
    }
    /**
     * ukey 证书
     * @return
     */
    @RequestMapping(value = "ukeyZs")
    public String ukeyZs(){
        return "/procurement/certificate/certificate";
    }

    /**
     * 添加发票
     * @return
     */
    @RequestMapping(value = "tjfp")
    public String tjfp(){
        return "/procurement/invoice/insert";
    }

    /**
     * 发票管理
     * @return
     */
    @RequestMapping(value = "fpgl")
    public String fpgl(){
        return "/procurement/invoice/invoice";
    }

    /**
     * 财务管理
     * @return
     */
    @RequestMapping(value = "cwgl")
    public String cwgl(){
        return "/procurement/financing/financing";
    }

    /**
     * 订单管理
     * @return
     */
    @RequestMapping(value = "ddgl")
    public String ddgl(){
        return "/procurement/order/order";
    }

    /**
     * 新增合同
     * @return
     */
    @RequestMapping(value = "xzht")
    public String xzht(){
        return "/procurement/contract/insert";
    }
    @RequestMapping(value = "xzht1")
    public String xzht1(){
        return "/procurement/contract/inserts";
    }

    /**
     * 编辑合同
     * @return
     */
    @RequestMapping(value = "htbj")
    public String htbj(){
        return "/procurement/contract/update";
    }
    /**
     * 合同详情
     * @return
     */
    @RequestMapping(value = "htxq")
    public String htxq(){
        return "/procurement/contract/particulars";
    }

    /**
     * 采购方合同签约
     * @return
     */
    @RequestMapping(value = "htqy")
    public String htqy(){
        return "/procurement/contract/contract";
    }

    /**
     * 采购方授用信管理
     * @return
     */
    @RequestMapping(value = "syxgl")
    public String management(){
        return "/procurement/management/management";
    }


    /**
     * 采购方首页
     * @return
     */
    @RequestMapping(value = "/procurementMain")
    public ModelAndView procurementMain(HttpSession sessionInfo){
    	 ModelAndView mv = new ModelAndView("procurement/main");
         SessionInfo session = (SessionInfo) sessionInfo.getAttribute("sessionInfo");
         Integer userId = session.getAdmin().getUserId();
         String userName = session.getAdmin().getUserName();
         Information information = pmHomePageService.homePageSelect(userId);
         Account account = accountService.queryAccountByName(userName);
         mv.addObject("information",information);
         mv.addObject("account",account);
         return mv;
    }

    /**
     * 采购方资料维护
     * @return
     */
    @RequestMapping(value = "/zhxx")
    public ModelAndView information(HttpSession sessionInfo){
    	ModelAndView mv = new ModelAndView("/procurement/information/information");
        SessionInfo session = (SessionInfo) sessionInfo.getAttribute("sessionInfo");
        Integer userId = session.getAdmin().getUserId();
        Information information = pmHomePageService.homePageSelect(userId);
        mv.addObject("information",information);
        return mv;
    }
    
    
    /**
     * 根据用户ID查询默认地址
     */
    
    

}
