package OperacionalSystem;


import IAS.iaos;

public class OperacionalSystemOSS {
    public static void main(String[] args) {


       iaos iaSoftware=new iaos();
       iaSoftware.funcionar();

        software sistemaOP1=new software("RAM/ROM","IA tipo Auxiliar.",true);
        sistemaOP1.nome="P.E.B.A";
        sistemaOP1.setMemoria_tipo("RAM/ROM");
        sistemaOP1.qt_linguagem=6;
        sistemaOP1.setTipo_ia("Auxiliar de Funções");
        sistemaOP1.sistema_tipo="Sistema Operacional Privado";






        sistemaOP1.Ligar();
        sistemaOP1.menuIniciar();



    }
}
