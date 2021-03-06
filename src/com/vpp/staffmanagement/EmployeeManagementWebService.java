
package com.vpp.staffmanagement;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "employeeManagementWebService", targetNamespace = "http://staffmanagement.vpp.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmployeeManagementWebService {


    /**
     * 
     * @return
     *     returns java.util.List<com.vpp.staffmanagement.Employee>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllEmployees", targetNamespace = "http://staffmanagement.vpp.com/", className = "com.vpp.staffmanagement.GetAllEmployees")
    @ResponseWrapper(localName = "getAllEmployeesResponse", targetNamespace = "http://staffmanagement.vpp.com/", className = "com.vpp.staffmanagement.GetAllEmployeesResponse")
    public List<Employee> getAllEmployees();

    /**
     * 
     * @param arg0
     * @throws SystemUnavailableException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "registerEmployee", targetNamespace = "http://staffmanagement.vpp.com/", className = "com.vpp.staffmanagement.RegisterEmployee")
    @ResponseWrapper(localName = "registerEmployeeResponse", targetNamespace = "http://staffmanagement.vpp.com/", className = "com.vpp.staffmanagement.RegisterEmployeeResponse")
    public void registerEmployee(
        @WebParam(name = "arg0", targetNamespace = "")
        Employee arg0)
        throws SystemUnavailableException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.vpp.staffmanagement.Employee>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchBySurname", targetNamespace = "http://staffmanagement.vpp.com/", className = "com.vpp.staffmanagement.SearchBySurname")
    @ResponseWrapper(localName = "searchBySurnameResponse", targetNamespace = "http://staffmanagement.vpp.com/", className = "com.vpp.staffmanagement.SearchBySurnameResponse")
    public List<Employee> searchBySurname(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dummyInMemoryMethod", targetNamespace = "http://staffmanagement.vpp.com/", className = "com.vpp.staffmanagement.DummyInMemoryMethod")
    @ResponseWrapper(localName = "dummyInMemoryMethodResponse", targetNamespace = "http://staffmanagement.vpp.com/", className = "com.vpp.staffmanagement.DummyInMemoryMethodResponse")
    public double dummyInMemoryMethod();

    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "addEmployeeNote", targetNamespace = "http://staffmanagement.vpp.com/", className = "com.vpp.staffmanagement.AddEmployeeNote")
    @ResponseWrapper(localName = "addEmployeeNoteResponse", targetNamespace = "http://staffmanagement.vpp.com/", className = "com.vpp.staffmanagement.AddEmployeeNoteResponse")
    public void addEmployeeNote();

}
