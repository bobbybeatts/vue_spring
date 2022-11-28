package kr.co.seoulit.erp.logistic.production.to;

import lombok.Data;

@Data
public class WorkSiteSimulationTO {

	private String workOrderNo;
	private String mrpNo;
	private String mpsNo;
	private String workSieteName;
	private String wdItem;
	private String parentItemCode;
	private String parentItemName;
	private String itemClassIfication;
	private String itemCode;
	private String itemName;
	private String requiredAmount;

}