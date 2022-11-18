public class Application {
  public static boolean compareVoice (animals.Kotik first, animals.Kotik second){
    return first.getVoice().equals(second.getVoice());
  }
  public static void main(String[] args) {

    animals.Kotik kot = new animals.Kotik("Кузя","мур", 3,8);

    animals.Kotik koshka = new animals.Kotik();
    koshka.setName("Клеопатра");
    koshka.setVoice("мур");
    koshka.setSatiety(2);
    koshka.setWeight(6);

    for(String oneDay: kot.liveAnotherDay()){
      System.out.println(oneDay);
    }

    System.out.println("Имя котика: " + koshka.getName() + "," + " вес котика:" + koshka.getWeight());

    if (compareVoice(kot, koshka))
      System.out.println("Котики разговаривают одинаково");
    else
      System.out.println("Котики разговаривают по разному");


    System.out.println(animals.Kotik.getCount());
  }
}


