package com.poweruniverse.nim.base.message;

import net.sf.json.JSONObject;

import com.poweruniverse.nim.base.bean.UserInfo;
import com.poweruniverse.nim.base.description.Application;
import com.poweruniverse.nim.base.description.Component;
import com.poweruniverse.nim.base.description.Webservice;


public class InvokeEnvelope{
	private static int maxid = 0;
	private int id = -1;
	private Component invokeComponent = null;//发出请求服务的组件
	private UserInfo invokeUser = null;//发出请求服务的用户
	
	private Webservice targetWebservice = null;//被请求的组件-服务 
	private String targetMethodName = null;//被请求的组件-服务- 方法名称
	
	private JSONObject params = null;//请求参数
	
	public InvokeEnvelope(String sourceCmpName,UserInfo user,String targetCmpName,String targetWsName,String targetMethodName,JSONObject argument) throws Exception {
		super();
		this.id = ++maxid;
		if(!Application.getInstance().containsComponent(sourceCmpName)){
			throw new Exception("in InvokeEnvelope constuctor:源组件"+sourceCmpName+"不存在！");
		}
		this.invokeComponent = Application.getInstance().getComponent(sourceCmpName);
		this.invokeUser = user;
		
		if(!Application.getInstance().containsComponent(targetCmpName)){
			throw new Exception("in InvokeEnvelope constuctor:目标组件"+targetCmpName+"不存在！");
		}
		Component targetComponent = Application.getInstance().getComponent(targetCmpName);
		
		if(!targetComponent.containsWebservice(targetWsName)){
			throw new Exception("in InvokeEnvelope constuctor:服务"+targetCmpName+"."+targetWsName+"不存在！");
		}
		this.targetWebservice = targetComponent.getWebservice(targetWsName);
		this.targetMethodName = targetMethodName;
				
		this.params = argument;
	}

	/**
	 * 判断是否内部调用
	 */
	public boolean isInnerInvoke() {
		return targetWebservice.getComponent().isLocalComponent();
	}

	/**
	 * 取得要调用的方法名称
	 */
	public String getTargetMethodName(){
		return this.targetMethodName;
	}

	public JSONObject getParams() {
		return this.params;
	}

	public Component getInvokeComponent() {
		return this.invokeComponent;
	}

	public UserInfo getInvokeUser() {
		return this.invokeUser;
	}

	public Webservice getTargetWebservice() {
		return targetWebservice;
	}

	@Override
	public String toString() {
		String userInfo = "";
		if(this.getInvokeUser()!=null){
			userInfo = this.getInvokeUser().getDengLuDH()+"("+this.getInvokeUser().getYongHuMC()+")";
		}
		return this.id+" 用户 "+userInfo+"从"+this.getInvokeComponent().getName()+" 请求"+this.getTargetWebservice()+"."+this.getTargetMethodName()+"服务，参数:"+this.getParams();
	}

	public int getId() {
		return id;
	}	


}
