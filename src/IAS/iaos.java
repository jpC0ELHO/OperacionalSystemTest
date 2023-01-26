package IAS;

public class iaos {


        public String Nome;
        public String memoria_tipo;
        public String tipoia;
        public int qt_linguagem;

        public boolean estado;

        public void caract(){
                System.out.println("IA nome: "+this.Nome);
                System.out.println("Memoria: "+this.memoria_tipo);
                System.out.println("Tipo de IA: "+this.tipoia);
                System.out.println("Linguagens suportadas: "+this.qt_linguagem);
        }

        public void Comunicar(){
                System.out.println("Comunicando...");

        }
        public void Pesquisar(){
                System.out.println("Pesquisando...");

        }
        public void Seguranca(){
        System.out.println("Ativando segurança....");

        }
        public void funcionar(){
                if(this.estado){
                        System.out.println("Sistema iniciando...");
                        System.out.println("Ligando... "+this.Nome);
                        System.out.println("Ligando... "+this.memoria_tipo);
                        System.out.println("Ligando... "+this.tipoia);
                }if(!this.estado) {
                        System.out.println("Desligando");
                        System.out.println("Encerrando... "+this.memoria_tipo);
                        System.out.println("Encerrando... "+this.Nome);
                        System.out.println("Encerrando... "+this.tipoia);
                }
        }
        public void Ligar(){
               this.estado=true;

        }
        public void Desligar(){
                this.estado=false;


        }
}


