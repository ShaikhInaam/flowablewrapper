package com.example.xmlns._1433759742497;

public class INCommunicationManagementProxy implements com.example.xmlns._1433759742497.INCommunicationManagement {
  private String _endpoint = null;
  private com.example.xmlns._1433759742497.INCommunicationManagement iNCommunicationManagement = null;
  
  public INCommunicationManagementProxy() {
    _initINCommunicationManagementProxy();
  }
  
  public INCommunicationManagementProxy(String endpoint) {
    _endpoint = endpoint;
    _initINCommunicationManagementProxy();
  }
  
  private void _initINCommunicationManagementProxy() {
    try {
      iNCommunicationManagement = (new com.example.xmlns._1433759742497.INCommunicationManagementHttpsLocator()).getINCommunicationManagementEndpoint();
      if (iNCommunicationManagement != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iNCommunicationManagement)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iNCommunicationManagement)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iNCommunicationManagement != null)
      ((javax.xml.rpc.Stub)iNCommunicationManagement)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.example.xmlns._1433759742497.INCommunicationManagement getINCommunicationManagement() {
    if (iNCommunicationManagement == null)
      _initINCommunicationManagementProxy();
    return iNCommunicationManagement;
  }
  
  public ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponse opUpdateCSProfile(ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequest updateCSProfileRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage{
    if (iNCommunicationManagement == null)
      _initINCommunicationManagementProxy();
    return iNCommunicationManagement.opUpdateCSProfile(updateCSProfileRequest);
  }
  
  public ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsResponse_xsd.GetDADetailsResponse opGetDADetails(ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsRequest_xsd.GetDADetailsRequest getDADetailsRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage{
    if (iNCommunicationManagement == null)
      _initINCommunicationManagementProxy();
    return iNCommunicationManagement.opGetDADetails(getDADetailsRequest);
  }
  
  public ae.etisalat.www.Middleware.INCommunicationManagement.GetSuperNumberResponse_xsd.GetSuperNumberResponse opGetSuperNumber(ae.etisalat.www.Middleware.INCommunicationManagement.GetSuperNumberRequest_xsd.GetSuperNumberRequest getSuperNumberRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage{
    if (iNCommunicationManagement == null)
      _initINCommunicationManagementProxy();
    return iNCommunicationManagement.opGetSuperNumber(getSuperNumberRequest);
  }
  
  public ae.etisalat.www.Middleware.INCommunicationManagement.GetCardDetailsResponse_xsd.GetCardDetailsResponse opGetCardDetails(ae.etisalat.www.Middleware.INCommunicationManagement.GetCardDetailsRequest_xsd.GetCardDetailsRequest getCardDetailsRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage{
    if (iNCommunicationManagement == null)
      _initINCommunicationManagementProxy();
    return iNCommunicationManagement.opGetCardDetails(getCardDetailsRequest);
  }
  
  public ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionResponse_xsd.SubmitVoucherActionResponse opSubmitVoucherAction(ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionRequest_xsd.SubmitVoucherActionRequest submitVoucherActionRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage{
    if (iNCommunicationManagement == null)
      _initINCommunicationManagementProxy();
    return iNCommunicationManagement.opSubmitVoucherAction(submitVoucherActionRequest);
  }
  
  public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponse opGetAccountDetails(ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsRequest_xsd.GetAccountDetailsRequest getAccountDetailsRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage{
    if (iNCommunicationManagement == null)
      _initINCommunicationManagementProxy();
    return iNCommunicationManagement.opGetAccountDetails(getAccountDetailsRequest);
  }
  
  public ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsResponse_xsd.GetRechargeDetailsResponse opGetRechargeDetails(ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsRequest_xsd.GetRechargeDetailsRequest getRechargeDetailsRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage{
    if (iNCommunicationManagement == null)
      _initINCommunicationManagementProxy();
    return iNCommunicationManagement.opGetRechargeDetails(getRechargeDetailsRequest);
  }
  
  
}