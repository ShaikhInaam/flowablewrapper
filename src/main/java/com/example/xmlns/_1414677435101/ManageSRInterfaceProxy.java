package com.example.xmlns._1414677435101;

public class ManageSRInterfaceProxy implements com.example.xmlns._1414677435101.ManageSRInterface {
  private String _endpoint = null;
  private com.example.xmlns._1414677435101.ManageSRInterface manageSRInterface = null;
  
  public ManageSRInterfaceProxy() {
    _initManageSRInterfaceProxy();
  }
  
  public ManageSRInterfaceProxy(String endpoint) {
    _endpoint = endpoint;
    _initManageSRInterfaceProxy();
  }
  
  private void _initManageSRInterfaceProxy() {
    try {
      manageSRInterface = (new com.example.xmlns._1414677435101.ManageSRServiceLocator()).getManageSRInterface();
      if (manageSRInterface != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)manageSRInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)manageSRInterface)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (manageSRInterface != null)
      ((javax.xml.rpc.Stub)manageSRInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.example.xmlns._1414677435101.ManageSRInterface getManageSRInterface() {
    if (manageSRInterface == null)
      _initManageSRInterfaceProxy();
    return manageSRInterface;
  }
  
  public ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd.GetNatureAndTypeDetailsResponse opGetNatureAndTypeDetails(ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsRequest_xsd.GetNatureAndTypeDetailsRequest getNatureAndTypeDetailsRequest) throws java.rmi.RemoteException, ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.ManageSRFaultResponse_xsd.ManageSRFault{
    if (manageSRInterface == null)
      _initManageSRInterfaceProxy();
    return manageSRInterface.opGetNatureAndTypeDetails(getNatureAndTypeDetailsRequest);
  }
  
  public ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd.GetThirdPartyComplaintDtlsResponse opGetThirdPartyComplaintDtls(ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsRequest_xsd.GetThirdPartyComplaintDtlsRequest getThirdPartyComplaintDtlsRequest) throws java.rmi.RemoteException, ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.ManageSRFaultResponse_xsd.ManageSRFault{
    if (manageSRInterface == null)
      _initManageSRInterfaceProxy();
    return manageSRInterface.opGetThirdPartyComplaintDtls(getThirdPartyComplaintDtlsRequest);
  }
  
  public ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.UpdateComplaintResponse_xsd.UpdateComplaintDtlsResponse opUpdateComplaint(ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.UpdateComplaintRequest_xsd.UpdateComplaintDtlsRequest updateComplaintRequest) throws java.rmi.RemoteException, ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.ManageSRFaultResponse_xsd.ManageSRFault{
    if (manageSRInterface == null)
      _initManageSRInterfaceProxy();
    return manageSRInterface.opUpdateComplaint(updateComplaintRequest);
  }
  
  public ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintResponse_xsd.CreateComplaintResponse opCreateComplaint(ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintRequest_xsd.CreateComplaintRequest createComplaintRequest) throws java.rmi.RemoteException, ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.ManageSRFaultResponse_xsd.ManageSRFault{
    if (manageSRInterface == null)
      _initManageSRInterfaceProxy();
    return manageSRInterface.opCreateComplaint(createComplaintRequest);
  }
  
  
}