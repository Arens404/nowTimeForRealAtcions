class Monsters {
  private String name;
  private boolean mutant;
  private int power;
  private int speed;
  private String side; //evil, good, neutral

  public Monsters (String name, boolean mutant, int power, int speed, String side) {
    this.name = name;
    this.mutant = mutant;
    this.power = power;
    this.speed = speed;
    this.side = side;
  }

  @Override
  public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Monsters)) return false;

      Monsters monsters = (Monsters) o;

      if (mutant != monsters.mutant) return false;
      if (power != monsters.power) return false;
      if (speed != monsters.speed) return false;
      if (name != null ? !name.equals(monsters.name) : monsters.name != null) return false;
      return side != null ? side.equals(monsters.side) : monsters.side == null;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (mutant ? 1 : 0);
    result = 31 * result + power;
    result = 31 * result + speed;
    result = 31 * result + (side != null ? side.hashCode() : 0);
    return result;
  }

  public String getName() {
    return name;
  }

  public void setName() {
    this.name = name;
  }

  public boolean isMutant() {
    return mutant;
  }

  public void setMutant(boolean mutant) {
    this.mutant = mutant;
  }

  public int getPower() {
    return power;
  }

  public void setPower(int power) {
    this.power = power;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }
}



