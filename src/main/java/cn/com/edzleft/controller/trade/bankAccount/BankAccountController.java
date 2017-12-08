package cn.com.edzleft.controller.trade.bankAccount;

import cn.com.edzleft.entity.BankAccount;
import cn.com.edzleft.entity.SessionInfo;
import cn.com.edzleft.service.trade.bankAccount.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by ibmtech on 2017/12/6.
 */
@Controller
@RequestMapping(value = "/bankAccount")
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;

    /**
     * 查询所有银行卡
     * @return
     */
    @RequestMapping(value = "getAllBankAccoun" ,method = RequestMethod.POST)
    @ResponseBody
    public List<BankAccount> getAllBankAccount(HttpServletRequest request, HttpServletResponse response, HttpSession sessionInfo){
        //设置跨域访问
        response.setContentType("text/plain");
        response.setHeader("Pragma", "No-cache");
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setHeader("Access-Control-Allow-Origin", "*");//添加跨域访问
        String jsonpCallback = request.getParameter("jsonpCallback");

       //获取当前用户id
        SessionInfo session = (SessionInfo) sessionInfo.getAttribute("sessionInfo");
        Integer userId = session.getAdmin().getUserId();
        List<BankAccount> bankAccounts = bankAccountService.queryBankAccountByUserId(userId);
        return bankAccounts;
    }

    /**
     * 数据存到session
     */
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    @ResponseBody
    public String saveInformation(BankAccount bankAccount){
        SessionInfo sessionInfo = new SessionInfo();
        sessionInfo.setBankAccount(bankAccount);
        System.out.println("1111");
        return "/trade/information/bankTwo";
    }

    /**
     * 添加银行卡
     * @return
     */
    @RequestMapping(value = "addBankAccount",method = RequestMethod.POST)
    @ResponseBody
    public  int addBankAccount(BankAccount bankAccount,HttpSession session){
        int i = bankAccountService.addBankAcount(bankAccount, session);
        return i;
    }

    /**
     * 根据id删除银行卡
     * @return
     */
    @RequestMapping(value = "/deleteBankAccount",method = RequestMethod.POST)
    @ResponseBody
    public int deleteBankAccount(Integer id){
        int flag = bankAccountService.cutBankAccountById(id);
        return flag;
    }

    /**
     * 设置默认的银行卡
     * @param id
     * @param value
     * @param session
     * @return
     */
    @RequestMapping(value = "/setDefaultBank" ,method = RequestMethod.POST)
    @ResponseBody
    public int setDefaultAccount(Integer id,Integer value,HttpSession session){
        int i = bankAccountService.setbankAccount(id, value, session);
        return i;
    }
}
