package lib;

public class MMS_lib {
  private double lambda;
  private double mu;
  private double rho;
  private int s;
  private double alpha;
  
  public MMS_lib(double lambda, double mu,int s) {
    this.lambda = lambda;
    this.mu = mu;
    this.alpha = lambda/mu;
    this.rho = this.alpha/s;
    this.s = s;
  }
  
  public double getRho(){
    return this.rho;
  }
  
  public int getFactrial(int s){
    int f = 1;
    for(int i = s ; i > 1 ; i--){
      f *= i;
    }
    return f;
  }
  
  public int getConbination(int s, int r){
    return this.getFactrial(s)/(this.getFactrial(r)*this.getFactrial(s-r));
  }
  
  public double getP0(){
    double p0 = 0.0, p01 = 0.0, p02 = 0.0;
    for(int k = 0; k < this.s; k++){
      p01 += Math.pow(this.alpha, k)/this.getFactrial(k);
    }
    p02 += Math.pow(this.alpha, this.s)/(this.getFactrial(this.s)*(1-this.rho));
    p0 = 1 / (p01 + p02);
    return p0;
  }
  
  public double getLq(){
    double lq = 0.0;
    lq = Math.pow(this.s, this.s) * Math.pow(this.rho, this.s+1) * this.getP0();
    lq /= (this.getFactrial(this.s) * Math.pow(1-this.rho, 2));
    return lq;
  }
  
  public double getL(){
    return this.getLq() + this.alpha;
  }
  
  public double getWq(){
    return this.getLq() / this.lambda;
  }
  
  public double getW(){
    return this.getWq() + 1 / this.mu;
  }
}
