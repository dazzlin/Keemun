
public final class Wage {
  private final double amount ;
  
  public Wage(double amount) {
    this.amount = amount;
  }
  
  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    
    if (obj instanceof Wage) {
      return this.amount == ((Wage)obj).amount;
    }
    
    return false;
  }
  
  @Override
  public int hashCode() {
    int result = 17;
    long doubleFieldBits = Double.doubleToLongBits(this.amount);     // 64 bits (double) » 64-bit (long) » 32-bit (int)
    result = 31 * result + (int)(doubleFieldBits ^ (doubleFieldBits >>> 32));
    return result;
  }
}
