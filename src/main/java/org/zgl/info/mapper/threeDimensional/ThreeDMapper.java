package org.zgl.info.mapper.threeDimensional;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.zgl.info.bean.PageData;

@Mapper
public interface ThreeDMapper {
	
	/**
	 * About CDD Info and control Info
	 * @param pd
	 * @author stb
	 * @return list
	 */
	List<PageData> getPlcCtrlData_CDD(PageData pd);
	
	/**
	 * About CD Info and control Info
	 * @param pd
	 * @author stb
	 * @return list
	 */
	List<PageData> getPlcCtrlData_CD(PageData pd);
	
	/**
	 * About SL Info and control Info
	 * @param pd
	 * @author stb
	 * @return list
	 */
	List<PageData> getPlcCtrlData_SL(PageData pd);
	
	/**
	 * About JQZM Info and control Info
	 * @param pd
	 * @author stb
	 * @return list
	 */
	List<PageData> getPlcCtrlData_JQZM(PageData pd);

	/**
	 * About COVI Info and show Info
	 * @param pd
	 * @author stb
	 * @return list
	 */
	List<PageData> getPlcCaptData_COVI(PageData pd);
	
	/**
	 * About TW Info and show Info
	 * @param pd
	 * @author stb
	 * @return list
	 */
	List<PageData> getPlcCaptData_TW(PageData pd);
	
	/**
	 * About LA Info and show Info
	 * @param pd
	 * @author stb
	 * @return list
	 */
	List<PageData> getPlcCaptData_LA(PageData pd);
	
	/**
	 * About CG Info and show Info
	 * @param pd
	 * @author stb
	 * @return list
	 */
	List<PageData> getPlcCaptData_CG(PageData pd);

	/**
	 * About HAB Info and show Info
	 * @param pd
	 * @author stb
	 * @return list
	 */
	List<PageData> getFirealarmCaptData_HAB(PageData pd);
	
	/**
	 * About YG Info and show Info
	 * @param pd
	 * @author stb
	 * @return list
	 */
	List<PageData> getFirealarmCaptData_YG(PageData pd);
	
	/**
	 * About GWGL Info and show Info
	 * @param pd
	 * @author stb
	 * @return list
	 */
	List<PageData> getFirealarmCaptData_GWGL(PageData pd);

	/**
	 * About loopgroup Info and show Info
	 * @param pd
	 * @author stb
	 * @return list
	 */
	List<PageData> getCjCaptData(PageData pd);

	/**
	 * About camera Info and show Info
	 * @param pd
	 * @author stb
	 * @return list
	 */
	List<PageData> getSxjCtrlData(PageData pd);

	/**
	 * About phone Info and show Info
	 * @param pd
	 * @author stb
	 * @return list
	 */
	List<PageData> getPhoneCaptData(PageData pd);

	/**
	 * About broadcast Info and show Info
	 * @param pd
	 * @author stb
	 * @return list
	 */
	List<PageData> getBroadcastCtrlData(PageData pd);

	/**
	 * About cms Info and show Info
	 * @param pd
	 * @author stb
	 * @return list
	 */
	List<PageData> getVmsCtrlData(PageData pd);
	
}
