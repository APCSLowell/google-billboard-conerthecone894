String e = "2.71828182845904523536028747135266249775724709369995957496696762772407663035354759457138217852516642742746639193200305992181741359662904357";

class winning {
  
  public boolean isPrime(long x){
    if (x <= 1) {
      return false;
    }

  int factors = 0;

  for (int i = 1; i <= Math.sqrt(x); i++) {
    if (x % i == 0) {
      factors++;

      if (factors > 1) {
        return false;
      }
    }
  }
  
  return true;
  }
  
}

winning c = new winning();

for(int i = 2; i < e.length(); i++){
  if (c.isPrime(Long.parseLong(e.substring(i, i+10))) == true){
    System.out.println(e.substring(i, i+10));
    break;
  }
}

//7427466391
