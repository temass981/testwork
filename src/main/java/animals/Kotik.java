package animals;


public class Kotik {

  private String name;
  private String voice;
  private int satiety;
  private int weight;
  private static int count;
  private static final int METHODS = 5;

  //создание геттеров и сеттеров
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setVoice(String voice) {
    this.voice = voice;
  }

  public String getVoice() {
    return voice;
  }

  public void setSatiety(int satiety) {
    this.satiety = satiety;
  }

  public int getSatiety() {
    return satiety;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public int getWeight() {
    return weight;
  }
  public static int getCount() {
    return count;
  }

  // создание конструктора без параметров
  public Kotik() {
    ++count;//в переменную count прибавляем один созданный экземляр
  }

  // создание конструктора с параметрами
  public Kotik(String name, String voice, int satiety, int weight) {
    this.name = name;
    this.voice = voice;
    this.satiety = satiety;
    this.weight = weight;
    ++count;//в переменную count прибавляем один созданный экземляр
  }

  //Создаем методы поведения котика и проверяем его сытость
  public boolean play() {
    if (satiety > 0) {
      satiety--;
      return true;
    } else {
      return false;
    }

  }

  public boolean sleep() {
    if (satiety > 0) {
      satiety--;
      return true;
    } else {
      return false;
    }
  }

  public boolean wash() {
    if (satiety > 0) {
      satiety--;
      return true;
    } else {
      return false;
    }
  }

  public boolean walk() {
    if (satiety > 0) {
      satiety--;
      return true;
    } else {
      return false;
    }
  }

  public boolean hunt() {
    if (satiety > 0) {
      satiety--;
      return true;
    } else {
      return false;
    }
  }

  //Создаем три перегрузки метода eat
  public void eat(int satiety) {
    this.satiety += satiety ;
  }

  public void eat(int satiety, String food) {
    this.satiety += satiety ;
  }

  //Назначем количество едениц сытости
  public void eat() {
    this.eat(3, "Сосиски");
  }

  //Рандомно вызываем один из методов поведения котика, проверяя его сытость,
  //если котик голодный, мы его кормим, если котик сытый, то он продолжает
  //заниматься своими делами
  public String[] liveAnotherDay() {
    String[] x = new String[24];
    for (int i = 0; i < x.length; i++) {
      int n = (int) (Math.random() * METHODS) + 1;
      switch (n) {
        case 1:
          if (this.play()) {
            x[i] = i + " - играл";
          } else {
            this.eat();
            x[i] = i + " - ел";
          }
          break;

        case 2:
          if (this.sleep()) {
            x[i] = i + " - спал";
          } else {
            this.eat();
            x[i] = i + " - ел";
          }
          break;
        case 3:
          if (this.wash()) {
            x[i] = i + " - умывался";
          } else {
            this.eat();
            x[i] = i + " - ел";
          }
          break;
        case 4:
          if (this.walk()) {
            x[i] = i + " - гулял";
          } else {
            this.eat();
            x[i] = i + " - ел";
          }
          break;
        case 5:
          if (this.hunt()) {
            x[i] = i + " - охотился";
          } else {
            this.eat();
            x[i] = i + " - ел";
          }
          break;
      }

    }
    return x;
  }
}
