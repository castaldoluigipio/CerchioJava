import java.util.Scanner;

class UsoCerchio{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);

        System.out.printf("Metti il primo raggio \n");
        double R= s.nextDouble();
        Cerchio C1=new Cerchio(R);

        System.out.println("Metti il secondo raggio \n");
        R = s.nextDouble();
        Cerchio C2=new Cerchio(R);

        double d1,d2,d3;
        double a,a2,a3;
        double p,p2,p3,R3;

        d1= C1.diametro();
        d2= C2.diametro();

        System.out.printf("\nDiametro C1 =%f, Diametro C2 =%f",d1,d2);

        a= C1.area();
        a2= C2.area();

        System.out.printf("\nArea C1 =%f, Area C2 =%f",a,a2);

        p= C1.perimetro();
        p2= C2.perimetro();

        System.out.printf("\nPerimetro C1 =%f, Perimetro C2 =%f",p,p2);

        R = C1.getRaggio() + C2.getRaggio();
        Cerchio C3=new Cerchio(R);

        p3= C3.perimetro();
        a3= C3.area();
        d3= C3.diametro();

         System.out.printf("\nPerimetro C3 =%f",p3);
         System.out.printf("\nArea C3 =%f",a3);
         System.out.printf("\nDiametro C3 =%f",d3);





        


    }
}