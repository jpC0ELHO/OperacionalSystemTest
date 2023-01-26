package Hardware;



public class interfaceOS {

    private hardware Sinais;

    private hardware Components;

    private boolean systemStatus;





    public interfaceOS(){}

    public interfaceOS(hardware sinais, hardware components) {
        Sinais = sinais;
        Components = components;
    }
    //============Public metods===============


    public boolean linkarInterfaces(hardware status0, hardware status1){
        if (!status0.isEnviando()&&status1.isRecebendo()){
            this.Sinais =status0;
            this.Components=status1;
            return true;

        }else{
            System.err.println("Sem sinal!");

        }
        return false;
    }

    public void FuncionandoAll(){
        if (linkarInterfaces(this.Sinais, this.Components))
            System.err.println("Sistema com erro, verifique as interfaces de hardware e software...");
        else {
            System.out.println("Todas as interfaces estão funcionando corretamente!");
        }
    }

    //========================Getters and Stters========================


    public hardware getSinais() {

        return Sinais;
    }

    public void setSinais(hardware sinais) {
        Sinais = sinais;
    }

    public hardware getComponents() {
        return Components;
    }

    public void setComponents(hardware components) {
        Components = components;
    }

    public boolean isSystemStatus() {
        return systemStatus;
    }

    public void setSystemStatus(boolean systemStatus) {
        this.systemStatus = systemStatus;
    }


}
