class Main {
  public static void main(String[] args) {
    Monsters monsterOne = new Monsters("Alien",false,100,7,"evil"); //1
    Monsters monsterTwo = new Monsters("Mind flayer", false, 1000, 3, "evil"); //5
    Monsters monsterThree = new Monsters("Cthulhu",false,1500,5,"evil"); //4
    Monsters monsterFour = new Monsters("Celestial Dragon", true,2000,8,"neutral"); //3
    Monsters monsterFive = new Monsters("Bloodsucker", true,50,6,"evil"); //2

    MonsterList monstersInList = new MonsterList();
    monstersInList.addAll(new Monsters[]{monsterOne, monsterTwo, monsterThree, monsterFour, monsterFive});
    monstersInList.sortByName(monstersInList);
    monstersInList.writeElements();
    System.out.println(monstersInList.size());
  }
}
