package OperacionalSystem;

import java.util.Scanner;
public class software {

        public String nome;

        private String memoria_tipo;

        private String tipo_ia;

        public int qt_linguagem;

        private boolean statusSoftware;

        private boolean ligou;
        public String sistema_tipo;

        private String Logoin;

        private String Passward;


    public software(String memoria_tipo, String tipo_ia,boolean statusSoftware) {
        this.memoria_tipo = memoria_tipo;
        this.tipo_ia = tipo_ia;
        this.Logoin="jo1257";
        this.Passward="124578";
        this.statusSoftware=true;
    }


        public void Ligar(){
            setLigou(true);
            System.out.println("Iniciando..."+this.sistema_tipo);
            System.out.println("Iniciando Sistema..."+this.nome);
            System.out.println("Iniciando..."+this.memoria_tipo);
            System.out.println("Iniciando..."+this.qt_linguagem+" linguagens");
            System.out.println("Iniciando..."+this.tipo_ia+" IA");


        }
        public void menuIniciar(){
            Scanner menuInic=new Scanner(System.in);
            System.out.println("Escolha as opções de menu: ");
            System.out.println("Menu Principal/menu Adm digite 1:");
            System.out.println("Menu Secundario Usuario digite 2:");
            String menuOpcoe=menuInic.nextLine();

            switch (menuOpcoe){
                case"1":
                    this.menuPrincipal();
                    break;
                case "2":
                    this.menuPortas();
                    break;
            }
        }
        private void LoginUsu(){
            Scanner logon=new Scanner(System.in);
            System.out.println("Digite seu login:");
            String loginUsu=logon.nextLine();
            System.out.println("Digite sua senha:");
            String passUsu=logon.nextLine();

            if(loginUsu==this.Logoin){
                System.out.println("Usuario correto!");
            }else{
                System.err.println("Login invalido!");
            }
            if (passUsu==this.Passward){
                System.out.println("Senha correta, Efetuando login....");
            }else{
                System.err.println("Senha incorreta");
            }if((loginUsu==this.Logoin)&&(passUsu==this.Passward)){
                System.out.println("Login efetuado com sucesso, seja Bem-vindo "+this.Logoin);
            }
            System.out.println("Deseja voltar a o menu?");
            System.out.println("Digite 1 para voltar ao menu iniciar...");
            System.out.println("Digite 2 para voltar ao menu Principal...");
            System.out.println("Digite 3 para voltar ao menu de opções...");
            String menuRegress=logon.nextLine();

            switch (menuRegress){
                case"1":
                    this.menuIniciar();
                    break;
                case"2":
                    this.menuPrincipal();
                    break;
                case"3":
                    this.menuPortas();
                    break;
            }



        }
       // @Override
       public void iniciarProg(){
           System.out.println("Programas iniciados...");

       }
    private void menuPrincipal(){
            Scanner leia=new Scanner(System.in);
            System.out.println("Deseja iniciar o menu? ");

            System.out.println("Digite S para Sim e N para Não: ");
            String usuIniciar= leia.nextLine();

        if(usuIniciar.equals("S")||usuIniciar.equals("s")||usuIniciar.equals("Sim")||usuIniciar.equals("sim")){
            System.out.println("Pesquisando programas...");
            System.out.println("Menu iniciado...");
            System.out.println("Deseja iniciar o Firewall? ");
            String usuFirewall= leia.nextLine();

            if (usuFirewall.equals("S")||usuFirewall.equals("s")||usuFirewall.equals("Sim")||usuFirewall.equals("sim")){
                this.firewall();
            }if (usuFirewall.equals("N")||usuFirewall.equals("n")||usuFirewall.equals("Nao")||usuFirewall.equals("nao")||usuFirewall.equals("Não")||usuFirewall.equals("não")){
                System.err.println("Sistema desprotegido, tomar medidas de precaução ");
            }
        }
        if(usuIniciar.equals("N")||usuIniciar.equals("n")||usuIniciar.equals("não")||usuIniciar.equals("Não")||usuIniciar.equals("Nao")||usuIniciar.equals("nao")){

                System.out.println("Encerrando programas...");
                System.out.println("Sistema encerrando...");
            }
        }
    private void menuPortas(){
            Scanner leiaMenu=new Scanner(System.in);
            System.out.println("Menu de opções:");
            System.out.println("Para Iniciar programas digite 1");
            System.out.println("Alterar login e senha digite 2");
        System.out.println("Para Alterar linguagem digite 3");
        System.out.println("Para verificar espaço na memoria digite 4");
            System.out.println("Para retornar ao menu principal digite 5");
            System.out.println("Para Desligar ou Sair digite 6");
            String valor=leiaMenu.nextLine();

            switch (valor){
                case "1":
                    this.iniciarProg();
                    break;
                case "2" :
                    this.LoginUsu();
                    break;
                case "3":
                    this.Qt_linguagem();
                    break;
                case"4":
                    this.Memoria();
                    break;
                case "5":
                    this.menuPrincipal();
                    break;
                case "6":
                    this.Desligar();
                    break;
            }
        }
    private void firewall(){
            Scanner leia=new Scanner(System.in);
            System.out.println("Iniciando Firewall....");
            System.out.println("Deseja iniciar varredura do sistema?");
            String varredura= leia.nextLine();


            if (varredura.equals("S")||varredura.equals("s")||varredura.equals("Sim")||varredura.equals("sim")){
                this.varredura();
            }
            if (varredura.equals("N")||varredura.equals("n")||varredura.equals("Nao")||varredura.equals("nao")){
                System.err.println("Sistema desprotegido, tomar medidas de precaução ");
            }
        }

        public void varredura(){
            System.out.println("Iniciando varredura...");
            System.out.println("Ameaças eliminadas!");



        }
        
        public void Qt_linguagem(){


    }

    private void Memoria(){
            setMemoria_tipo(getMemoria_tipo());
        System.out.println(memoria_tipo);

    }
        public void Desligar(){
            Scanner leia=new Scanner(System.in);
            System.out.println("Deseja desligar? ");
            String onOff= leia.nextLine();
            if ((onOff.equals("Sim"))||(onOff.equals("sim")) || (onOff.equals("S"))||(onOff.equals("s"))){
                System.out.println("Desligando...");
            }
            else if  ((onOff.equals("Nao"))||(onOff.equals("nao")) ||(onOff.equals("N"))||(onOff.equals("n"))){
                System.out.println("Solicitação Cancelada.");

                this.menuPrincipal();

            }

        }

        //=========================================================================================
        //=========================================================================================

        //Get and Setters and Constructor:


    public boolean isLigou() {
        return ligou;
    }

    public void setLigou(boolean ligou) {
        this.ligou = ligou;
        this.isStatusSoftware(ligou);
    }

    public boolean isStatusSoftware(boolean ligou) {
        if(ligou){

            return true;

        }else{

            return false;
        }

    }

    public void setStatusSoftware(boolean statusSoftware) {
        this.statusSoftware = statusSoftware;
    }

    public String getLogoin() {
        return Logoin;
    }

    public void setLogoin(String logoin) {
        Logoin = logoin;
    }

    public String getPassward() {
        return Passward;
    }

    public void setPassward(String passward) {
        Passward = passward;
    }

    public String getTipo_ia() {
        return tipo_ia;
    }

    public void setTipo_ia(String tipo_ia) {
        this.tipo_ia = tipo_ia;
    }

    public String getMemoria_tipo() {
        return memoria_tipo;
    }

    public void setMemoria_tipo(String memoria_tipo) {
        this.memoria_tipo = memoria_tipo;
    }


}

