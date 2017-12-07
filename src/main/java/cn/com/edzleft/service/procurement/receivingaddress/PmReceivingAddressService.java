package cn.com.edzleft.service.procurement.receivingaddress;

import cn.com.edzleft.entity.ReceivingAddress;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface PmReceivingAddressService {
	int deleteByPrimaryKey(Integer rAddressId);

    ReceivingAddress selectByPrimaryKey(String cId);

    int updateByPrimaryKeySelective(ReceivingAddress record);

    int updateByPrimaryKeyWithBLOBs(ReceivingAddress record);

    int updateByPrimaryKey(ReceivingAddress record);


	ReceivingAddress queryReceivingAddress(Integer addressId);

	List<ReceivingAddress> selectByPrimaryKey(Integer userId);

	int setDefaultAddress(Integer id, HttpSession session, Integer value);

	int deleteAddress(Integer id);

	int insert(ReceivingAddress ra);

	int insert(ReceivingAddress ra, HttpSession session);






}
