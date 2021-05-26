import java.util.Scanner;

public class Triangles{
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Coloque su nombre: ");
        String userName = scan.nextLine().trim();
        
        if(userName.length() == 0)
            userName = "Invitado";
        System.out.println("Bienvenido "+ userName);

        while (true){
            
            System.out.println(
                "Menu:\n"+
                "1 area\n"+
                "2 perimetro\n"+
                "3 hipotenusa\n"+
                "4 altura\n"+
                "5 tipo de triangulo por lado\n"+
                "6 tipo de triangulo por angulo\n"+
                "7 catetos adyacente\n"+
                "8 ?\n"+
                "9 ?\n"+
                "10 ?\n"+
                " --otro numero para salir-- "
                );
            int option = Integer.parseInt(scan.nextLine());
            switch(option){
                case 1: 
                    //area
                    area();
                    break;
                case 2:
                    perimetro();
                    break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 6: break;
                case 7: break;
                case 8: break;
                case 9: break;
                case 10: break;

                default: 
                    salir();
            }
        }
        
    }
    public static void salir(){
        while (true){
            System.out.println("Deseas salir?(s/n)");
            String res = scan.nextLine();
            if(res.equals("s"))
                System.exit(0);
            else if(res.equals("n"))
                return;
            else System.out.println("Ingrese `s` o `n`");
        }
    }
    public static Triangle leerTrianguloPorLados(){
        Triangle res;
        res = new Triangle(
            leerLado("Coloque lado A"),
            leerLado("Coloque lado B"),
            leerLado("Coloque lado C") );
        return res;
    }
    public static double leerLado(String msg){
        while (true){
            System.out.println(msg);
            double res = Double.parseDouble(scan.nextLine());
            if (res < 0)
                System.out.println("Error numero negativo");
            else
                return res;
        }
    }

    public static void perimetro(){
        Triangle tri = leerTrianguloPorLados();
        System.out.println("El perimetro es: "+tri.perimeter());
    }
    public static void area(){
        Triangle tri = leerTrianguloPorLados();
        System.out.println("El area es: "+tri.area());
    }
}