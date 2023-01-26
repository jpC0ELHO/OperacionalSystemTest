package Hardware;

public class hardware implements Controller {


    private int quantidadeHardware;

    private boolean emissor;
    private boolean recebendo;
    private boolean enviando;
    private boolean processando;
    private boolean distribuindo;

    //=========================Metodo construtor==========================

    public hardware() {


    }

    //===========================Getters and Setters=================================


    public boolean isEmissor(boolean recebendo) {

        if (recebendo){
            isRecebendo();
        }else {
            recebendo=false;
        }
        return false;
    }

    public void setEmissor(boolean emissor) {
        this.emissor = emissor;
    }

    public boolean isRecebendo() {

        return recebendo;
    }

    public void setRecebendo(boolean recebendo) {
        this.recebendo = recebendo;
        this.isEmissor(recebendo);
    }

    public boolean isEnviando() {

        return enviando;
    }

    public void setEnviando(boolean enviando) {
        this.enviando = enviando;
    }

    public boolean isProcessando() {
        return processando;
    }

    public void setProcessando(boolean processando) {
        this.processando = processando;
    }

    public boolean isDistribuindo() {
        return distribuindo;
    }

    public void setDistribuindo(boolean distribuindo) {
        this.distribuindo = distribuindo;
    }

    public int getQuantidadeHardware() {
        return quantidadeHardware;
    }

    public void setQuantidadeHardware(int quantidadeHardware) {
        this.quantidadeHardware = quantidadeHardware;
    }

    //=============================Constructor======================================
    @Override
    public void receberSinal() {
        if (!recebendo){
            System.err.println("Erro na emissão do sinal, verifique os hardwares....");

        }else{
            System.out.println("Recebendo Sinal...."+this.isRecebendo());
        }

    }

    @Override
    public void enviarPara() {
        if (!enviando){
            System.err.println("Erro na emissão do sinal....");

        }else{
            System.out.println("Enviando para OS(Operacional System)..."+this.isEnviando());

        }
    }

    @Override
    public void hardwareManutention() {
        System.err.println("Sistema interrompido para manutenção de hardware....");
        setRecebendo(false);
        setProcessando(false);
        setEnviando(false);
        setDistribuindo(false);


    }




    @Override
    public void instalHardware() {
        this.setProcessando(true);
        this.setEnviando(true);
        this.setDistribuindo(true);
        this.setRecebendo(true);
    }

    @Override
    public void usingHardware() {
        this.setRecebendo(true);
        this.setProcessando(true);
        this.setQuantidadeHardware(44);

        System.out.println("Hardware instalado!");
        System.out.println("Pronto para uso!");
        System.out.println("Quantidade de hardwares instalados: "+this.quantidadeHardware);
    }


    @Override
    public void menuSistema() {
        System.out.println("Hardware Emissor is: "+(this.enviando ?"Transmissão de sinal ok!":"Component error..."));
        System.out.println("Hardware Receptor is: "+(this.recebendo?"Recebendo sinal de componentes e transmitindo...":"Sem recebimento de sinal..."));
    }
}
