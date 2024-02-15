public class Calculator {
  // 1. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
//  Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.



  
  public static Object sum (Object obj1, Object obj2) {
    if(obj1 instanceof Integer && obj2 instanceof Integer){
      int sum = (Integer) obj1 + (Integer) obj2;
      return sum;
    }
    else {System.out.println("Одно из двух значений или два значения не являеются числовыми. Операция сложения не может быть выполнена");}
    return 0;
    }
    
  public static Object multiply(Object obj1, Object obj2) {
    if(obj1 instanceof Integer && obj2 instanceof Integer){
      int res = (Integer) obj1 * (Integer) obj2;
      return res;
    }
    else {System.out.println("Одно из двух значений или два значения не являеются числовыми. Операция умножения не может быть выполнена");}
    return 0;
    }

  public static Object divide(Object obj1, Object obj2) {
    if(obj1 instanceof Integer && obj2 instanceof Integer){
      int res = (Integer) obj1 /(Integer) obj2;
      return res;
    }
    else {System.out.println("Одно из двух значений или два значения не являеются числовыми. Операция деления не может быть выполнена");}
    return 0;
    }

  public static Object subtract(Object obj1, Object obj2) {
    if(obj1 instanceof Integer && obj2 instanceof Integer){
      int res = (Integer) obj1 - (Integer) obj2;
      return res;
    }
    else {System.out.println("Одно из двух значений или два значения не являеются числовыми. Операция вычитания не может быть выполнена");}
    return 0;
    }
}
