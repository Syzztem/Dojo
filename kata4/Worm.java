public  class  Worm {
  private  int  pv;
  private  int  strength;
  private String name;

  public Worm(int  pv, int  strength, String name) {
	  this.pv = pv;
	  this.strength = strength;
	  this.name = name;
  }

  public String getName{
	  return name
  }

  public  int  getPv() {
	  return pv;
  }

  public  int  getStrength() {
	  return strength;
  }

  public  void  attack(Worm adv) {
	  adv.damage(strength);
  }

  public  void  damage(int  power) {
	  this.pv = pv - power;
  }
}

class  Arena {
  private  Worm  wormJ1;
  private  Worm  wormJ2;

  public  Arena(Worm  wormJ1, Worm  wormJ2){
	  this.wormJ1 = wormJ1;
	  this.wormJ2 = wormJ2;
  }

  public  String  fight() {
	  while (wormJ1.getPv() > 0 && wormJ2.getPv() > 0)
	  {
		wormJ1.attack(wormJ2);
		wormJ2.attack(wormJ1);
	  }
		if (wormJ2.getPv() <= 0)
			return wormJ1.getName;
		else 
			return wormJ2.getName;
  }
}

