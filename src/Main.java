import Exceptions.ExcecaoCustomizada;

public static void main(String[] args) throws ExcecaoCustomizada
{
    ConvertToString convert = new ConvertToString();
    Scanner in = new Scanner(System.in);

    System.out.println("Digite um número de até 3 dígitos:");
    String input = in.nextLine();

    char[] num = input.toCharArray();
    convert.numberToWords(num);
}