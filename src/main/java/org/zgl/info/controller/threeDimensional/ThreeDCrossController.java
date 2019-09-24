package org.zgl.info.controller.threeDimensional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.zgl.info.bean.PageData;
import org.zgl.info.controller.BaseController;
import org.zgl.info.service.threeDimensional.ThreeDService;

/**
 * 三维接口访问
 * @author stb
 */
@CrossOrigin(origins = {"http://localhost:9999", "null"},allowedHeaders="*",allowCredentials="true",methods = {RequestMethod.POST})
@RestController
@RequestMapping(value="/3D")
@ComponentScan({"org.zgl.info.service"})
public class ThreeDCrossController extends BaseController{

	@Resource
	private ThreeDService threeDService;
	
	/**
	 * 三维信息数据接口
	 * 此命令用于HT调用
	 * ●车道指示灯（单面）
	 * ●车道指示灯（双面）
	 * ●射流风机
	 * ●加强照明回路（洞内）
	 * ●加强照明回路（洞外）
	 * 设备的数据（包括基础信息、运行状态、设备状态等）。
	 * @author stb
	 * @param devId(编号) sdevType(设备类型) capture_time(时间戳)
	 * @return {devId(编号),sdevType(设备类型),direction(方向),pileNo(桩号),commStatus(状态),errorStatus(错误状态),errorDesc(错误内容),cStatus,controlType(控制类型),controlInfo(控制信息)}
	 */
	@RequestMapping(value="/plc_ctrl_data",method=RequestMethod.POST)
	public Map<String,Object> getPlcCtrlData(){
		Map<String,Object> result = new HashMap<String,Object>();
		try {
			PageData pd = this.getPageData();
			List<PageData> list = threeDService.getPlcCtrlData(pd);
			if(list!=null && list.size()>0) {
				result.put("result",true);
				result.put("list",list);
			}else {
				result.put("result",false);
				result.put("msg","所查结果没有");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("result",false);
			result.put("msg","后台出错联系对接人");
		}
		return result;
	}
	
	
	/**
	 * 此命令用于HT调用
	 * ●COVI仪
	 * ●光照度仪
	 * ●风速风向仪
	 * ●超高检测仪
	    *     设备的数据（包括基础信息、运行状态、设备状态等）。
	 * @author stb
	 * @param devId(编号) sdevType(设备类型) capture_time(时间戳)
	 * @return {devId,sdevType,direction,pileNo,commStatus,errorStatus,errorDesc,cDataShow}
	 */
	@RequestMapping(value="/plc_capt_data",method=RequestMethod.POST)
	public Map<String,Object> getPlcCaptData(){
		Map<String,Object> result = new HashMap<String,Object>();
		try {
			PageData pd = this.getPageData();
			List<PageData> list = threeDService.getPlcCaptData(pd);
			if(list!=null && list.size()>0) {
				result.put("result",true);
				result.put("list",list);
			}else {
				result.put("result",false);
				result.put("msg","所查结果没有");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("result",false);
			result.put("msg","后台出错联系对接人");
		}
		return result;
	}
	
	/**
	 * 此命令用于HT调用
	 * ●消防（手报）
	 * ●消防（烟感）
	 * ●消防（感温光缆）
	 * 设备的数据（包括基础信息、运行状态、设备状态等）。
	 * @author stb
	 * @param devId(编号) sdevType(设备类型) capture_time(时间戳)
	 * @return {devId,sdevType,direction,pileNo,commStatus,errorStatus,errorDesc,alarmType,alarmTemp}
	 */
	@RequestMapping(value="/firealarm_capt_data",method=RequestMethod.POST)
	public Map<String,Object> getFirealarmCaptData(){
		Map<String,Object> result = new HashMap<String,Object>();
		try {
			PageData pd = this.getPageData();
			List<PageData> list = threeDService.getFirealarmCaptData(pd);
			if(list!=null && list.size()>0) {
				result.put("result",true);
				result.put("list",list);
			}else {
				result.put("result",false);
				result.put("msg","所查结果没有");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("result",false);
			result.put("msg","后台出错联系对接人");
		}
		return result;
	}
	
	/**
	 * 此命令用于HT调用
	 * ●线圈车检器
	 * 设备的数据（包括基础信息、运行状态、设备状态等）。
	 * @author stb
	 * @param devId(编号) sdevType(设备类型) capture_time(时间戳)
	 * @return {devId,sdevType,direction,pileNo,commStatus,errorStatus,errorDesc,vh,vspeed,voccupy}
	 */
	@RequestMapping(value="/cj_capt_data",method=RequestMethod.POST)
	public Map<String,Object> getCjCaptData(){
		Map<String,Object> result = new HashMap<String,Object>();
		try {
			PageData pd = this.getPageData();
			List<PageData> list = threeDService.getCjCaptData(pd);
			if(list!=null && list.size()>0) {
				result.put("result",true);
				result.put("list",list);
			}else {
				result.put("result",false);
				result.put("msg","所查结果没有");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("result",false);
			result.put("msg","后台出错联系对接人");
		}
		return result;
	}
	
	/**
	 * 此命令用于HT调用
	 * ●摄像机(枪机)
	 * ●摄像机(云台)
	 * ●摄像机(球机)
	 * 设备的数据（包括基础信息、运行状态、设备状态等）。
	 * @author stb
	 * @param devId(编号) sdevType(设备类型) capture_time(时间戳)
	 * @return {devId,sdevType,direction,pileNo,commStatus,errorStatus,errorDesc,devIp,devPort,username,password}
	 */
	@RequestMapping(value="/sxj_ctrl_data",method=RequestMethod.POST)
	public Map<String,Object> getSxjCtrlData(){
		Map<String,Object> result = new HashMap<String,Object>();
		try {
			PageData pd = this.getPageData();
			List<PageData> list = threeDService.getSxjCtrlData(pd);
			if(list!=null && list.size()>0) {
				result.put("result",true);
				result.put("list",list);
			}else {
				result.put("result",false);
				result.put("msg","所查结果没有");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("result",false);
			result.put("msg","后台出错联系对接人");
		}
		return result;
	}
	
	/**
	 * 此命令用于HT调用
	 * ●紧急电话
	 * 设备的数据（包括基础信息、运行状态、设备状态等）。
	 * @author stb
	 * @param devId(编号) sdevType(设备类型) capture_time(时间戳)
	 * @return {devId,sdevType,direction,pileNo,commStatus,errorStatus,errorDesc,cStatus}
	 */
	@RequestMapping(value="/phone_capt_data",method=RequestMethod.POST)
	public Map<String,Object> getPhoneCaptData(){
		Map<String,Object> result = new HashMap<String,Object>();
		try {
			PageData pd = this.getPageData();
			List<PageData> list = threeDService.getPhoneCaptData(pd);
			if(list!=null && list.size()>0) {
				result.put("result",true);
				result.put("list",list);
			}else {
				result.put("result",false);
				result.put("msg","所查结果没有");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("result",false);
			result.put("msg","后台出错联系对接人");
		}
		return result;
	}
	
	/**
	 * 此命令用于HT调用
	 * ●紧急电话
	 * 设备的数据（包括基础信息、运行状态、设备状态等）。
	 * @author stb
	 * @param devId(编号) sdevType(设备类型) capture_time(时间戳)
	 * @return {devId,sdevType,direction,pileNo,commStatus,errorStatus,errorDesc,cStatus}
	 */
	@RequestMapping(value="/broadcast_ctrl_data",method=RequestMethod.POST)
	public Map<String,Object> getBroadcastCtrlData(){
		Map<String,Object> result = new HashMap<String,Object>();
		try {
			PageData pd = this.getPageData();
			List<PageData> list = threeDService.getBroadcastCtrlData(pd);
			if(list!=null && list.size()>0) {
				result.put("result",true);
				result.put("list",list);
			}else {
				result.put("result",false);
				result.put("msg","所查结果没有");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("result",false);
			result.put("msg","后台出错联系对接人");
		}
		return result;
	}
	
	/**
	 * 此命令用于HT调用
	 * ●A型情报板
	 * ●C型情报板
	 * ●F型情报板
	 * 设备的数据（包括基础信息、运行状态、设备状态等）。
	 * @author stb
	 * @param devId(编号) sdevType(设备类型) capture_time(时间戳)
	 * @return {devId,sdevType,direction,pileNo,commStatus,errorStatus,errorDesc,deployWord}
	 */
	@RequestMapping(value="/vms_ctrl_data",method=RequestMethod.POST)
	public Map<String,Object> getVmsCtrlData(){
		Map<String,Object> result = new HashMap<String,Object>();
		try {
			PageData pd = this.getPageData();
			List<PageData> list = threeDService.getVmsCtrlData(pd);
			if(list!=null && list.size()>0) {
				result.put("result",true);
				result.put("list",list);
			}else {
				result.put("result",false);
				result.put("msg","所查结果没有");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("result",false);
			result.put("msg","后台出错联系对接人");
		}
		return result;
	}
}
