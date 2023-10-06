
public class Main {
    public static void main(String[] args) {



        Capitan capitan0= new Capitan("Julian","Landinez","7bd55426");
        Capitan capitan1= new Capitan("Xavi", "Hernandez", "3gr21357");
        Capitan capitan2= new Capitan("wilson", "Naufrago", "7pn62593");
        Capitan capitan3= new Capitan("memo", "perez", "5hg85699");

        Velero v1= new Velero( capitan0, 55000, 20000, 2022, 15,6);
        Velero v2= new Velero(capitan1, 30000, 20000, 2020,10, 3 );
        Yate y1= new Yate(capitan2,80000, 20000, 2021, 16, 6 );
        Yate y2= new Yate(capitan3, 100000, 20000, 2016, 18,10);



        System.out.println("A continuacion se montraran las embarcaciones disponibles con su respectivo capitan");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(v1.validar());
        System.out.println(v1);
        System.out.println(v1.calcularValorAdicional());
        System.out.println("el monto total del alquiler es: "+ v1.calcularAlquiler());

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(v2.validar());
        System.out.println(v2);
        System.out.println(v2.calcularValorAdicional());
        System.out.println("el monto total del alquiler es: "+ v2.calcularAlquiler());

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(y1.validar());
        System.out.println(y1);
        System.out.println(y1.calcularValorAdicional());
        System.out.println("el monto total del alquiler es: "+ y1.calcularAlquiler());

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(y2.validar());
        System.out.println(y2);
        System.out.println(y2.calcularValorAdicional());
        System.out.println("el monto total del alquiler es: "+ y2.calcularAlquiler());
















    }

}