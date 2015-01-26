package lib;

public class MM1_lib {
  private double lambda;
  private double mu;
  private double rho;

  public MM1_lib(double lambda, double mu) {
    this.lambda = lambda;
    this.mu = mu;
    this.rho = lambda/mu;
  }
  
  public double getRho(){
    return rho;
  }
  
  public double getLength(){
    return (rho / (1.0 - rho));
  }
  
  public double getQueue(){
    return (rho * rho / (1.0 - rho));
  }
  
  public double getTime(){
    return (1.0 / (mu * (1.0 - rho)));
  }
  
  public double getWtime(){
    return (rho / (mu * (1.0 - rho)));
  }
}
