
package com.example.workerservice;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WorkerService", targetNamespace = "http://workerservice.example.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WorkerService {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setWorkingAt", targetNamespace = "http://workerservice.example.com/", className = "com.example.workerservice.SetWorkingAt")
    @ResponseWrapper(localName = "setWorkingAtResponse", targetNamespace = "http://workerservice.example.com/", className = "com.example.workerservice.SetWorkingAtResponse")
    public void setWorkingAt(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        XMLGregorianCalendar arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        XMLGregorianCalendar arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkWorkingAt", targetNamespace = "http://workerservice.example.com/", className = "com.example.workerservice.CheckWorkingAt")
    @ResponseWrapper(localName = "checkWorkingAtResponse", targetNamespace = "http://workerservice.example.com/", className = "com.example.workerservice.CheckWorkingAtResponse")
    public boolean checkWorkingAt(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        javax.xml.datatype.XMLGregorianCalendar arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        javax.xml.datatype.XMLGregorianCalendar arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "removeWorkingAt", targetNamespace = "http://workerservice.example.com/", className = "com.example.workerservice.RemoveWorkingAt")
    @ResponseWrapper(localName = "removeWorkingAtResponse", targetNamespace = "http://workerservice.example.com/", className = "com.example.workerservice.RemoveWorkingAtResponse")
    public void removeWorkingAt(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Date arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        Date arg2);

}
