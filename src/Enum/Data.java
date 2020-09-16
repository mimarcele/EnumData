package Enum;

public class Data {
        private int dia;
        private int mes;
        private int ano;
        private DiaSemana diaSemana;

        public Data(int dia, int mes, int ano, DiaSemana diaSemana) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            this.diaSemana = diaSemana;
        }

        public void setDia(int dia){
            this.dia = dia;
        }
        public int getDia(){
            return this.dia;
        }
        public void setMes(int mes){
            this.mes = mes;
        }
        public int getMes(){
            return this.mes;
        }
        public void setAno(int ano){
            this.ano = ano;
        }
        public int getAno(){
            return this.ano;
        }
        public void setDiaSemana(DiaSemana dia){
            this.diaSemana = diaSemana;
        }
        public DiaSemana getDiaSemana(){
            return this.diaSemana;
        }
    }
