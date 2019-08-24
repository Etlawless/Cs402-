package DefaultNamespace;

public class ScoreServiceProxy implements DefaultNamespace.ScoreService {
  private String _endpoint = null;
  private DefaultNamespace.ScoreService scoreService = null;
  
  public ScoreServiceProxy() {
    _initScoreServiceProxy();
  }
  
  public ScoreServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initScoreServiceProxy();
  }
  
  private void _initScoreServiceProxy() {
    try {
      scoreService = (new DefaultNamespace.ScoreServiceServiceLocator()).getScoreService();
      if (scoreService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)scoreService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)scoreService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (scoreService != null)
      ((javax.xml.rpc.Stub)scoreService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DefaultNamespace.ScoreService getScoreService() {
    if (scoreService == null)
      _initScoreServiceProxy();
    return scoreService;
  }
  
  public void reset() throws java.rmi.RemoteException{
    if (scoreService == null)
      _initScoreServiceProxy();
    scoreService.reset();
  }
  
  public int getWins() throws java.rmi.RemoteException{
    if (scoreService == null)
      _initScoreServiceProxy();
    return scoreService.getWins();
  }
  
  public int getTies() throws java.rmi.RemoteException{
    if (scoreService == null)
      _initScoreServiceProxy();
    return scoreService.getTies();
  }
  
  public int getLosses() throws java.rmi.RemoteException{
    if (scoreService == null)
      _initScoreServiceProxy();
    return scoreService.getLosses();
  }
  
  public DefaultNamespace.Score updateScore(int wins, int losses, int ties) throws java.rmi.RemoteException{
    if (scoreService == null)
      _initScoreServiceProxy();
    return scoreService.updateScore(wins, losses, ties);
  }
  
  public int increaseWins() throws java.rmi.RemoteException{
    if (scoreService == null)
      _initScoreServiceProxy();
    return scoreService.increaseWins();
  }
  
  public DefaultNamespace.Score getScore() throws java.rmi.RemoteException{
    if (scoreService == null)
      _initScoreServiceProxy();
    return scoreService.getScore();
  }
  
  public int increaseTies() throws java.rmi.RemoteException{
    if (scoreService == null)
      _initScoreServiceProxy();
    return scoreService.increaseTies();
  }
  
  public int increaseLosses() throws java.rmi.RemoteException{
    if (scoreService == null)
      _initScoreServiceProxy();
    return scoreService.increaseLosses();
  }
  
  
}