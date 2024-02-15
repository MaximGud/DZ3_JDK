public class App {
    public static void main(String[] args) throws Exception {
//1
Object a = 3;
Object b = "5adsc";

System.out.println("Сумма двух объектов равна = " + Calculator.sum(a,b));


   



//3.
Pair pair1 = new Pair (a,b);
System.out.println(pair1);

    
}
}