public static void main(String[] args) {
    ConvertToString convert = new ConvertToString();
    Scanner in = new Scanner(System.in);

    System.out.println("Digite um número de até 3 dígitos:");
    String input = in.nextLine();

    while (input.length() > 3 || !input.matches("\\d+")) {
        System.out.println("Entrada inválida. Digite um número de até 3 dígitos:");
        input = in.nextLine();
    }

    char[] num = input.toCharArray();

    convert.numberToWords(num);
}