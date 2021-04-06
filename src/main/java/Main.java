import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int numero1=0;
    do {
        int num;
        int a =0;
        int b=0;
        do{
            try {
                System.out.println("Ingrese Numero a");
                a = (int)teclado.nextInt();
                num =0;
            }catch (Exception e){
                System.out.println("numero Invalido");
                teclado.next();
                num=1;
            }
        }while (num==1);
        do{
            try {
                System.out.println("Ingrese Numero b");
                b = (int)teclado.nextInt();
                num =0;
            }catch (Exception e){
                System.out.println("numero Invalido");
                teclado.next();
                num=1;
            }
        }while (num==1);

        System.out.println("Que operacion quiere hacer");
        System.out.println("[1] sumar");
        System.out.println("[2] restar");
        System.out.println("[3] multiplicar");
        System.out.println("[4] dividir");
        int opcion =1;
        do{
            try {
                opcion = teclado.nextInt();
                if (opcion>4 || opcion<1){
                    System.out.println("Opcion no valida Reintente");
                    num=1;
                }else{
                    num =0;
                }
            }catch (Exception e){
                System.out.println("numero Invalido");
                System.out.println("Reintente");
                teclado.next();
                num=1;
            }
        }while (num==1);
        int numero;
        switch (opcion){
            case 1:  numero = sumar(a,b);
                System.out.println("El numero sumado es: " + numero);
                break;
            case 2:  numero = restar(a,b);
                System.out.println("El numero restado es: " + numero);
                break;
            case 3: numero = multiplicar(a,b);
                System.out.println("El numero multiplicado es: " + numero);
                break;
            case 4:
                if (b==0){
                    System.out.println("No se puede dividir por 0");
                    break;
                }else{
                    numero = dividir(a,b);
                    System.out.println("El numero dividido es: " + numero);
                    break;
                }
        }
        int repetir=0;
        do {
            try {
                System.out.println("Desea repetir");
                System.out.println("[1] Si");
                System.out.println("[2] No");
                numero1= teclado.nextInt();
                if (numero1<1 || numero1>2){
                    System.out.println("Opcion no valida");
                    repetir=0;
                }else{
                    repetir=1;
                }
            }catch (Exception e){
                System.out.println("Opcion no valida");
                teclado.next();
                repetir=0;
            }
        }while (repetir==0);
    }while (numero1==1);


}

    private static int dividir(int a, int b) {
        int numero = a/b;
        return numero;
    }

    private static int multiplicar(int a, int b) {
        int numero = a*b;
        return numero;
    }

    private static int restar(int a, int b) {
        int numero = a-b;
        return numero;
    }

    private static int sumar(int a, int b) {
        int numero = a+b;
        return numero;
    }


}
