public class ConvertToString {

    public void numberToWords(char num[]) {
        int len = num.length;

        if (len == 0) {
            System.out.println("Não permitido vazio");
            return;
        }

        if (len > 3) {
            System.out.println("\n O número tem mais de 3 dígitos");
            return;
        }

        String[] unidade = new String[]{"Zero", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove"};
        String[] dezenaUnico = new String[]{"Dez", "Onze", "Doze", "Treze", "Quatorze", "Quinze", "Dezesseis", "Dezessete", "Dezoito", "Dezenove"};
        String[] dezena = new String[]{"", "", "Vinte", "Trinta", "Quarenta", "Cinquenta", "Sessenta", "Setenta", "Oitenta", "Noventa"};
        String[] centena = new String[]{"", "Cento", "Duzentos", "Trezentos", "Quatrocentos", "Quinhentos", "Seiscentos", "Setecentos", "Oitocentos", "Novecentos"};

        System.out.print(String.valueOf(num) + ": ");

        if (len == 1) {
            System.out.println(unidade[num[0] - '0']);
            return;
        }

        if (len == 2) {
            if (num[0] == '1') {
                System.out.println(dezenaUnico[num[1] - '0']);
            } else {
                System.out.print(dezena[num[0] - '0']);
                if (num[1] != '0') {
                    System.out.print(" e " + unidade[num[1] - '0']);
                }
                System.out.println();
            }
            return;
        }

        if (len == 3) {
            if (num[0] == '1' && num[1] == '0' && num[2] == '0') {
                System.out.println("Cem");
                return;
            } else {
                System.out.print(centena[num[0] - '0']);
                if (num[1] == '1') {
                    System.out.print(" e " + dezenaUnico[num[2] - '0']);
                } else {
                    if (num[1] != '0') {
                        System.out.print(" e " + dezena[num[1] - '0']);
                    }
                    if (num[2] != '0') {
                        System.out.print(" e " + unidade[num[2] - '0']);
                    }
                }
                System.out.println();
            }
        }
    }
}