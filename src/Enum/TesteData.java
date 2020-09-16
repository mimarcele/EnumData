package Enum;

public class TesteData {
        public static void main(String[] args) {

            DiaSemana dia = DiaSemana.DOMINGO;

            System.out.println(dia.toString() + " - " + dia.getValor());

            Data data = new Data(22, 03, 2015, DiaSemana.SEXTA);
            System.out.println(data);
        }
    }

