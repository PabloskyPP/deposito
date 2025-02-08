public class Main {

    public static void main(String[] args) {
        operativa_cuenta(2300); //el método se realiza en la cuenta con valor 2300
    }

    public static void operativa_cuenta(double cantidad) { //se recibe el nuevo parámetro cantidad
        CCuenta cuenta0; //declaración de variables
        double saldoActual;

        cuenta0 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta0.estado();
        System.out.println("El saldo actual es" + saldoActual);

        try {
            cuenta0.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta0.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}


