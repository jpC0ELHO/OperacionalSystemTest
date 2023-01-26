package IAS;

public class IAosMain {
    public static void main(String[] args) {


        iaos IA1=new iaos();
        IA1.estado=true;
        IA1.Nome="Malu";
        IA1.memoria_tipo="RAM/ROM";
        IA1.tipoia="Suporte Tecnico";
        IA1.qt_linguagem=6;

        iaos IA2=new iaos();
        IA2.estado=false;
        IA2.Nome="Javis";
        IA2.memoria_tipo="RAM/ROM";
        IA2.tipoia="Suporte Técnico, Pesquisa, Segurança e Auxilio Saúde. ";
        IA2.qt_linguagem=36;

        iaos IA3=new iaos();
        IA3.estado=false;
        IA3.Nome="FA";
        IA3.memoria_tipo="RAM/ROM/Sensorial";
        IA3.tipoia="Suporte Técnico, Pesquisa, Segurança e Auxilio Saúde, Engenharia Civil, Mecatrônica, Física, Aerodinâmica.";
        IA3.qt_linguagem=120;

        IA1.caract();
        IA1.Comunicar();
        IA1.Seguranca();
        IA1.Pesquisar();
        IA1.Desligar();
        IA1.funcionar();

        System.out.println("");
        IA2.caract();
        IA2.Comunicar();
        IA2.Seguranca();
        IA2.Pesquisar();
        IA2.funcionar();

        System.out.println("");

        IA3.Ligar();
        IA3.caract();
        IA3.Comunicar();
        IA3.Seguranca();
        IA3.Pesquisar();
        IA3.funcionar();





    }
}