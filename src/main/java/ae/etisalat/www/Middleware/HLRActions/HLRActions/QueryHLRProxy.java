package ae.etisalat.www.Middleware.HLRActions.HLRActions;

public class QueryHLRProxy implements QueryHLR {
  private String _endpoint = null;
  private QueryHLR queryHLR = null;
  
  public QueryHLRProxy() {
    _initQueryHLRProxy();
  }
  
  public QueryHLRProxy(String endpoint) {
    _endpoint = endpoint;
    _initQueryHLRProxy();
  }
  
  private void _initQueryHLRProxy() {
    try {
      queryHLR = (new HLRActionsLocator()).getQueryHLREndpoint0();
      if (queryHLR != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)queryHLR)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)queryHLR)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (queryHLR != null)
      ((javax.xml.rpc.Stub)queryHLR)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public QueryHLR getQueryHLR() {
    if (queryHLR == null)
      _initQueryHLRProxy();
    return queryHLR;
  }
  
  public ae.etisalat.www.Middleware.HLRActions.QueryHLRResponse_xsd.QueryHLRResponse queryHLR(ae.etisalat.www.Middleware.HLRActions.QueryHLRRequest_xsd.QueryHLRRequest queryHLRRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage{
    if (queryHLR == null)
      _initQueryHLRProxy();
    return queryHLR.queryHLR(queryHLRRequest);
  }
  
  
}