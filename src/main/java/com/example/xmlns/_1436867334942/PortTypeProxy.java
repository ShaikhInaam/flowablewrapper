package com.example.xmlns._1436867334942;

public class PortTypeProxy implements PortType {
  private String _endpoint = null;
  private PortType portType = null;
  
  public PortTypeProxy() {
    _initPortTypeProxy();
  }
  
  public PortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initPortTypeProxy();
  }
  
  private void _initPortTypeProxy() {
    try {
      portType = (new UCMSComplaintsLocator()).getPortTypeEndpoint1();
      if (portType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)portType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)portType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (portType != null)
      ((javax.xml.rpc.Stub)portType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public PortType getPortType() {
    if (portType == null)
      _initPortTypeProxy();
    return portType;
  }
  
  public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusFromUCMSResponse_xsd.UpdateComplaintStatusFromUCMSResponse opUpdateComplaintStatusFromUCMS(ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusFromUCMSRequest_xsd.UpdateComplaintRequest updateComplaintStatusFromUCMSRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage{
    if (portType == null)
      _initPortTypeProxy();
    return portType.opUpdateComplaintStatusFromUCMS(updateComplaintStatusFromUCMSRequest);
  }
  
  public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSResponse_xsd.UpdateComplaintInUCMSResponse opUpdateComplaintDetailsInUCMS(ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequest updateComplaintDetailsInUCMSRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage{
    if (portType == null)
      _initPortTypeProxy();
    return portType.opUpdateComplaintDetailsInUCMS(updateComplaintDetailsInUCMSRequest);
  }
  
  public ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintResponse_xsd.ResolveComplaintInUCMSResponse opResolveComplaint(ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintRequest_xsd.ResolveComplaintInUCMSRequest resolveComplaintRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage{
    if (portType == null)
      _initPortTypeProxy();
    return portType.opResolveComplaint(resolveComplaintRequest);
  }
  
  public ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponse opGetComplaintDtls(ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsRequest_xsd.GetComplaintDetailsRequest getComplaintDtlsRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage{
    if (portType == null)
      _initPortTypeProxy();
    return portType.opGetComplaintDtls(getComplaintDtlsRequest);
  }
  
  public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusInUCMSResponse_xsd.UpdateComplaintInUCMSResponse opUpdateComplaintStatusInUCMS(ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusInUCMSRequest_xsd.UpdateComplaintInUCMSRequest updateComplaintInUCMSRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage{
    if (portType == null)
      _initPortTypeProxy();
    return portType.opUpdateComplaintStatusInUCMS(updateComplaintInUCMSRequest);
  }
  
  
}