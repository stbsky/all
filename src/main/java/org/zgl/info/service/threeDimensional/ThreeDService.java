package org.zgl.info.service.threeDimensional;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.zgl.info.bean.PageData;
import org.zgl.info.mapper.threeDimensional.ThreeDMapper;

@ComponentScan({"org.zgl.info.mapper"})
@Service("threeDService")
public class ThreeDService {

	@Resource
	private ThreeDMapper threeDMapper;
	
	/**
	 * About PLC control info contain CDD CD SL JQZM
	 * @author stb
	 * @param pd
	 * @return list
	 */
	public List<PageData> getPlcCtrlData(PageData pd) {
		List<PageData> allList = new ArrayList<PageData>();
		//根据不同类型来判断查找的内容
		if(pd.get("sdevType")!=null && !pd.getString("sdevType").equals("")) {
			if(pd.getString("sdevType").equals("CDD")) {//车道指示灯双面
				allList = threeDMapper.getPlcCtrlData_CDD(pd);
			}else if(pd.getString("sdevType").equals("CD")) {//车道指示灯单面
				allList = threeDMapper.getPlcCtrlData_CD(pd);
			}else if(pd.getString("sdevType").equals("SL")) {//射流风机
				allList = threeDMapper.getPlcCtrlData_SL(pd);
			}else if(pd.getString("sdevType").equals("JQZM")) {//加强照明
				allList = threeDMapper.getPlcCtrlData_JQZM(pd);
			}
		}else {
			//默认查找全部
			List<PageData> list_cdd = threeDMapper.getPlcCtrlData_CDD(pd);
			List<PageData> list_cd = threeDMapper.getPlcCtrlData_CD(pd);
			List<PageData> list_sl = threeDMapper.getPlcCtrlData_SL(pd);
			List<PageData> list_jqzm = threeDMapper.getPlcCtrlData_JQZM(pd);
			allList.addAll(list_cdd);allList.addAll(list_cd);allList.addAll(list_sl);allList.addAll(list_jqzm);
		}
		return allList;
	}

	/**
	 * About PLC show info contain COVI LA TW CG
	 * @author stb
	 * @param pd
	 * @return list
	 */
	public List<PageData> getPlcCaptData(PageData pd) {
		List<PageData> allList = new ArrayList<PageData>();
		//根据不同类型来判断查找的内容
		if(pd.get("sdevType")!=null && !pd.getString("sdevType").equals("")) {
			if(pd.getString("sdevType").equals("COVI")) {//covi
				allList = threeDMapper.getPlcCaptData_COVI(pd);
			}else if(pd.getString("sdevType").equals("LA")) {//光照度仪
				allList = threeDMapper.getPlcCaptData_LA(pd);
			}else if(pd.getString("sdevType").equals("TW")) {//温湿度仪器
				allList = threeDMapper.getPlcCaptData_TW(pd);
			}else if(pd.getString("sdevType").equals("CG")) {//超高
				allList = threeDMapper.getPlcCaptData_CG(pd);
			}
		}else {
			//默认查找全部
			List<PageData> list_covi = threeDMapper.getPlcCaptData_COVI(pd);
			List<PageData> list_la = threeDMapper.getPlcCaptData_LA(pd);
			List<PageData> list_tw = threeDMapper.getPlcCaptData_TW(pd);
			List<PageData> list_cg = threeDMapper.getPlcCaptData_CG(pd);
			allList.addAll(list_covi);allList.addAll(list_la);allList.addAll(list_tw);allList.addAll(list_cg);
		}
		return allList;
	}

	/**
	 * About Firealarm show info contain HAB YG GWGL
	 * @author stb
	 * @param pd
	 * @return list
	 */
	public List<PageData> getFirealarmCaptData(PageData pd) {
		List<PageData> allList = new ArrayList<PageData>();
		//根据不同类型来判断查找的内容
		if(pd.get("sdevType")!=null && !pd.getString("sdevType").equals("")) {
			if(pd.getString("sdevType").equals("HAB")) {//手报
				allList = threeDMapper.getFirealarmCaptData_HAB(pd);
			}else if(pd.getString("sdevType").equals("YG")) {//烟感
				allList = threeDMapper.getFirealarmCaptData_YG(pd);
			}else if(pd.getString("sdevType").equals("GWGL")) {//感温光缆
				allList = threeDMapper.getFirealarmCaptData_GWGL(pd);
			}
		}else {
			//默认查找全部
			List<PageData> list_hab = threeDMapper.getFirealarmCaptData_HAB(pd);
			List<PageData> list_yg = threeDMapper.getFirealarmCaptData_YG(pd);
			List<PageData> list_gwgl = threeDMapper.getFirealarmCaptData_GWGL(pd);
			allList.addAll(list_hab);allList.addAll(list_yg);allList.addAll(list_gwgl);
		}
		return allList;
	}

	/**
	 * About loopgroup show info
	 * @author stb
	 * @param pd
	 * @return list
	 */
	public List<PageData> getCjCaptData(PageData pd) {
		// TODO Auto-generated method stub
		return threeDMapper.getCjCaptData(pd);
	}

	/**
	 * About camera show info
	 * @author stb
	 * @param pd
	 * @return list
	 */
	public List<PageData> getSxjCtrlData(PageData pd) {
		// TODO Auto-generated method stub
		return threeDMapper.getSxjCtrlData(pd);
	}

	/**
	 * About phone show info
	 * @author stb
	 * @param pd
	 * @return list
	 */
	public List<PageData> getPhoneCaptData(PageData pd) {
		// TODO Auto-generated method stub
		return threeDMapper.getPhoneCaptData(pd);
	}

	/**
	 * About broadcast show info
	 * @author stb
	 * @param pd
	 * @return list
	 */
	public List<PageData> getBroadcastCtrlData(PageData pd) {
		// TODO Auto-generated method stub
		return threeDMapper.getBroadcastCtrlData(pd);
	}

	/**
	 * About vms show info
	 * @author stb
	 * @param pd
	 * @return list
	 */
	public List<PageData> getVmsCtrlData(PageData pd) {
		// TODO Auto-generated method stub
		return threeDMapper.getVmsCtrlData(pd);
	}
	

}
