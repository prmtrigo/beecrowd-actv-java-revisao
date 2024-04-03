public class 1001 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int primeiro_numero = input.nextInt();
        int segundo_numero = input.nextInt();
        
        int soma = primeiro_numero + segundo_numero;
        
        System.out.println("X = " + soma);
        
        input.close();
    }
}
