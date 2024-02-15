public class Pair {
  // 3. Напишите обобщенный класс Pair, который представляет собой пару значений
  // разного типа. Класс должен иметь методы getFirst(), getSecond()
  // для получения значений каждого из составляющих пары, а также переопределение
  // метода toString(), возвращающее строковое представление пары.

  private Object obj1;
  private Object obj2;

  public Pair(Object obj1, Object obj2) {
    this.obj1 = obj1;
    this.obj2 = obj2;
  }

  public Object getFirst() {
    return obj1;
  }

  public Object getSecond() {
    return obj2;
  }

  @Override
  public String toString() {
    return "Pair [obj1=" + obj1 + ", obj2=" + obj2 + "]";
  }
}
