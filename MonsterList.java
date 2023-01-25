public class MonsterList {

  Monsters[] content;

  private int size = 0;

  private final int defaultCapacity = 10;

  public MonsterList() {
    content = new Monsters[defaultCapacity];
  }

  public void add(Monsters element) {
    if (content[size] == null) {
      content[size] = element;
      size++;
    }
  }

  public void addAll(Monsters[] elements) {
    for (int i = 0; i < elements.length; i++) {
      if (content[size] == null) {
        content[i] = elements[i];
        size++;
      }
    }
  }

  public void writeElements() {
    for (int i = 0; i < size; i++) {
      System.out.println(content[i].getName());
    }
  }

  public int size() {
    return size;
  }

  public void remove(int index) {
    if (content[index] != null) {
      if (index == 0) {
        for (int i = 1; i < size; i++) {
          content[index] = content[index + i];
        }
        size--;
      } else {
        content[index] = content[index + 1];
        size--;
      }
    }
  }

  public void remove(Monsters monster) {
    size--;
    int monsterIndex = 0;
    boolean monsterGate = false;
    for (int i = 0;i < size; i++) {
      if (monster.equals(content[i])) {
        monsterIndex = i;
        monsterGate = true;
      }
      if (monsterIndex == 0 && monsterGate) {
        content[monsterIndex] = content[i + 1];
      } else if (monsterGate) {
        content[monsterIndex] = content[monsterIndex + 1];
      }
    }
  }

  public int search(Monsters monster) {
    int result = 0;
    for (int i = 0; i < size; i++) {
      if (monster.equals(content[i])) {
        result = i;
      }
    }
    return result;
  }

  public int search(String monsterName) {
    int result = 0;
    for (int i = 0; i < size; i++) {
      if (monsterName.equals(content[i].getName())) {
        result = i;
      }
    }
    return result;
  }

  public void removeAll(Monsters[] elements) {
    for (int i = 0; i < elements.length; i++) {
      remove(elements[i]);
    }
  }

  public boolean contains(Monsters monster) {
    for (int i = 0; i < size; i++) {
      if (monster.equals(content[i])) {
        return true;
      }
    }
    return false;
  }

  public void sortByName(MonsterList monsterList) {
    for (int i = 0;i < monsterList.size; i++) {
      for (int j = 0;j < monsterList.size;j++) {
        if (monsterList.content[i].getName().compareTo(monsterList.content[j].getName()) > 0) {
          Monsters replace = content[j];
          content[j] = content[i];
          content[i] = replace;
        }
      }
    }
  }
}

