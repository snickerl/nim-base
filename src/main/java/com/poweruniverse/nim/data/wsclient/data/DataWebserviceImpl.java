
package com.poweruniverse.nim.data.wsclient.data;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DataWebserviceImpl", targetNamespace = "http://webservice.data.nim.poweruniverse.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DataWebserviceImpl {


    /**
     * 
     * @param sql
     * @return
     *     returns com.poweruniverse.nim.data.wsclient.data.JsonMessageResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSqlVariable", targetNamespace = "http://webservice.data.nim.poweruniverse.com/", className = "com.poweruniverse.nim.data.wsclient.data.GetSqlVariable")
    @ResponseWrapper(localName = "getSqlVariableResponse", targetNamespace = "http://webservice.data.nim.poweruniverse.com/", className = "com.poweruniverse.nim.data.wsclient.data.GetSqlVariableResponse")
    @Action(input = "http://webservice.data.nim.poweruniverse.com/DataWebserviceImpl/getSqlVariableRequest", output = "http://webservice.data.nim.poweruniverse.com/DataWebserviceImpl/getSqlVariableResponse")
    public JsonMessageResult getSqlVariable(
        @WebParam(name = "sql", targetNamespace = "")
        String sql);

    /**
     * 
     * @param limit
     * @param start
     * @param sorts
     * @param filters
     * @param fields
     * @param shiTiLeiDH
     * @return
     *     returns com.poweruniverse.nim.data.wsclient.data.JsonDataResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStlList", targetNamespace = "http://webservice.data.nim.poweruniverse.com/", className = "com.poweruniverse.nim.data.wsclient.data.GetStlList")
    @ResponseWrapper(localName = "getStlListResponse", targetNamespace = "http://webservice.data.nim.poweruniverse.com/", className = "com.poweruniverse.nim.data.wsclient.data.GetStlListResponse")
    @Action(input = "http://webservice.data.nim.poweruniverse.com/DataWebserviceImpl/getStlListRequest", output = "http://webservice.data.nim.poweruniverse.com/DataWebserviceImpl/getStlListResponse")
    public JsonDataResult getStlList(
        @WebParam(name = "shiTiLeiDH", targetNamespace = "")
        String shiTiLeiDH,
        @WebParam(name = "start", targetNamespace = "")
        Integer start,
        @WebParam(name = "limit", targetNamespace = "")
        Integer limit,
        @WebParam(name = "fields", targetNamespace = "")
        String fields,
        @WebParam(name = "filters", targetNamespace = "")
        String filters,
        @WebParam(name = "sorts", targetNamespace = "")
        String sorts);

    /**
     * 
     * @param limit
     * @param start
     * @param caoZuoDH
     * @param gongNengDH
     * @param sorts
     * @param filters
     * @param fields
     * @return
     *     returns com.poweruniverse.nim.data.wsclient.data.JsonDataResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getGnList", targetNamespace = "http://webservice.data.nim.poweruniverse.com/", className = "com.poweruniverse.nim.data.wsclient.data.GetGnList")
    @ResponseWrapper(localName = "getGnListResponse", targetNamespace = "http://webservice.data.nim.poweruniverse.com/", className = "com.poweruniverse.nim.data.wsclient.data.GetGnListResponse")
    @Action(input = "http://webservice.data.nim.poweruniverse.com/DataWebserviceImpl/getGnListRequest", output = "http://webservice.data.nim.poweruniverse.com/DataWebserviceImpl/getGnListResponse")
    public JsonDataResult getGnList(
        @WebParam(name = "gongNengDH", targetNamespace = "")
        String gongNengDH,
        @WebParam(name = "caoZuoDH", targetNamespace = "")
        String caoZuoDH,
        @WebParam(name = "start", targetNamespace = "")
        Integer start,
        @WebParam(name = "limit", targetNamespace = "")
        Integer limit,
        @WebParam(name = "fields", targetNamespace = "")
        String fields,
        @WebParam(name = "filters", targetNamespace = "")
        String filters,
        @WebParam(name = "sorts", targetNamespace = "")
        String sorts);

    /**
     * 
     * @param id
     * @param caoZuoDH
     * @param gongNengDH
     * @param fields
     * @return
     *     returns com.poweruniverse.nim.data.wsclient.data.JsonDataResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getGnRecord", targetNamespace = "http://webservice.data.nim.poweruniverse.com/", className = "com.poweruniverse.nim.data.wsclient.data.GetGnRecord")
    @ResponseWrapper(localName = "getGnRecordResponse", targetNamespace = "http://webservice.data.nim.poweruniverse.com/", className = "com.poweruniverse.nim.data.wsclient.data.GetGnRecordResponse")
    @Action(input = "http://webservice.data.nim.poweruniverse.com/DataWebserviceImpl/getGnRecordRequest", output = "http://webservice.data.nim.poweruniverse.com/DataWebserviceImpl/getGnRecordResponse")
    public JsonDataResult getGnRecord(
        @WebParam(name = "gongNengDH", targetNamespace = "")
        String gongNengDH,
        @WebParam(name = "caoZuoDH", targetNamespace = "")
        String caoZuoDH,
        @WebParam(name = "id", targetNamespace = "")
        Integer id,
        @WebParam(name = "fields", targetNamespace = "")
        String fields);

    /**
     * 
     * @param property
     * @param gongNengDH
     * @param fields
     * @param shiTiLeiDH
     * @return
     *     returns com.poweruniverse.nim.data.wsclient.data.JsonDataResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getZdList", targetNamespace = "http://webservice.data.nim.poweruniverse.com/", className = "com.poweruniverse.nim.data.wsclient.data.GetZdList")
    @ResponseWrapper(localName = "getZdListResponse", targetNamespace = "http://webservice.data.nim.poweruniverse.com/", className = "com.poweruniverse.nim.data.wsclient.data.GetZdListResponse")
    @Action(input = "http://webservice.data.nim.poweruniverse.com/DataWebserviceImpl/getZdListRequest", output = "http://webservice.data.nim.poweruniverse.com/DataWebserviceImpl/getZdListResponse")
    public JsonDataResult getZdList(
        @WebParam(name = "gongNengDH", targetNamespace = "")
        String gongNengDH,
        @WebParam(name = "shiTiLeiDH", targetNamespace = "")
        String shiTiLeiDH,
        @WebParam(name = "property", targetNamespace = "")
        String property,
        @WebParam(name = "fields", targetNamespace = "")
        String fields);

    /**
     * 
     * @param id
     * @param fields
     * @param shiTiLeiDH
     * @return
     *     returns com.poweruniverse.nim.data.wsclient.data.JsonDataResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStlRecord", targetNamespace = "http://webservice.data.nim.poweruniverse.com/", className = "com.poweruniverse.nim.data.wsclient.data.GetStlRecord")
    @ResponseWrapper(localName = "getStlRecordResponse", targetNamespace = "http://webservice.data.nim.poweruniverse.com/", className = "com.poweruniverse.nim.data.wsclient.data.GetStlRecordResponse")
    @Action(input = "http://webservice.data.nim.poweruniverse.com/DataWebserviceImpl/getStlRecordRequest", output = "http://webservice.data.nim.poweruniverse.com/DataWebserviceImpl/getStlRecordResponse")
    public JsonDataResult getStlRecord(
        @WebParam(name = "shiTiLeiDH", targetNamespace = "")
        String shiTiLeiDH,
        @WebParam(name = "id", targetNamespace = "")
        Integer id,
        @WebParam(name = "fields", targetNamespace = "")
        String fields);

    /**
     * 
     * @param limit
     * @param sql
     * @param start
     * @param fields
     * @return
     *     returns com.poweruniverse.nim.data.wsclient.data.JsonDataResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSqlList", targetNamespace = "http://webservice.data.nim.poweruniverse.com/", className = "com.poweruniverse.nim.data.wsclient.data.GetSqlList")
    @ResponseWrapper(localName = "getSqlListResponse", targetNamespace = "http://webservice.data.nim.poweruniverse.com/", className = "com.poweruniverse.nim.data.wsclient.data.GetSqlListResponse")
    @Action(input = "http://webservice.data.nim.poweruniverse.com/DataWebserviceImpl/getSqlListRequest", output = "http://webservice.data.nim.poweruniverse.com/DataWebserviceImpl/getSqlListResponse")
    public JsonDataResult getSqlList(
        @WebParam(name = "sql", targetNamespace = "")
        String sql,
        @WebParam(name = "start", targetNamespace = "")
        Integer start,
        @WebParam(name = "limit", targetNamespace = "")
        Integer limit,
        @WebParam(name = "fields", targetNamespace = "")
        String fields);

    /**
     * 
     * @param limit
     * @param start
     * @param className
     * @param params
     * @return
     *     returns com.poweruniverse.nim.data.wsclient.data.JsonDataResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getJavaList", targetNamespace = "http://webservice.data.nim.poweruniverse.com/", className = "com.poweruniverse.nim.data.wsclient.data.GetJavaList")
    @ResponseWrapper(localName = "getJavaListResponse", targetNamespace = "http://webservice.data.nim.poweruniverse.com/", className = "com.poweruniverse.nim.data.wsclient.data.GetJavaListResponse")
    @Action(input = "http://webservice.data.nim.poweruniverse.com/DataWebserviceImpl/getJavaListRequest", output = "http://webservice.data.nim.poweruniverse.com/DataWebserviceImpl/getJavaListResponse")
    public JsonDataResult getJavaList(
        @WebParam(name = "className", targetNamespace = "")
        String className,
        @WebParam(name = "start", targetNamespace = "")
        Integer start,
        @WebParam(name = "limit", targetNamespace = "")
        Integer limit,
        @WebParam(name = "params", targetNamespace = "")
        String params);

    /**
     * 
     * @param limit
     * @param todoOnly
     * @param start
     * @param workflows
     * @param className
     * @param sorts
     * @param filters
     * @param fields
     * @return
     *     returns com.poweruniverse.nim.data.wsclient.data.JsonDataResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTodoList", targetNamespace = "http://webservice.data.nim.poweruniverse.com/", className = "com.poweruniverse.nim.data.wsclient.data.GetTodoList")
    @ResponseWrapper(localName = "getTodoListResponse", targetNamespace = "http://webservice.data.nim.poweruniverse.com/", className = "com.poweruniverse.nim.data.wsclient.data.GetTodoListResponse")
    @Action(input = "http://webservice.data.nim.poweruniverse.com/DataWebserviceImpl/getTodoListRequest", output = "http://webservice.data.nim.poweruniverse.com/DataWebserviceImpl/getTodoListResponse")
    public JsonDataResult getTodoList(
        @WebParam(name = "className", targetNamespace = "")
        String className,
        @WebParam(name = "start", targetNamespace = "")
        Integer start,
        @WebParam(name = "limit", targetNamespace = "")
        Integer limit,
        @WebParam(name = "fields", targetNamespace = "")
        String fields,
        @WebParam(name = "filters", targetNamespace = "")
        String filters,
        @WebParam(name = "sorts", targetNamespace = "")
        String sorts,
        @WebParam(name = "workflows", targetNamespace = "")
        String workflows,
        @WebParam(name = "todoOnly", targetNamespace = "")
        Boolean todoOnly);

}
