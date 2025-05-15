public class Helicoptero{
    private boolean ligado;
    private double altitude;
    private int capacidade;
    private int pessoas;

    public Helicoptero(boolean ligado, double altitude, int capacidade, int pessoas){
        this.ligado = false;
        this.altitude = 0;
        this.capacidade = 4;
        this.pessoas = 0;
    }

    public Helicoptero() {
    }

    public boolean entrar(){
        if(pessoas < capacidade){
            pessoas++;
            return true;
        }
        return false;
    }

    public boolean sair(){
        if(pessoas > 0){
            pessoas--;
            return true;
        }
        return false;
    }

    public boolean ligar(){
        if(!ligado) {
            ligado = true;
            return true;
        }
        return false;
    }

    public boolean decolar(int novaAltitude){
        if(ligado  && altitude == 0 && novaAltitude > 0){
            altitude = novaAltitude;
            return true;
        }
        return false;
    }

    public boolean aterrissar(){
        if(ligado && altitude > 0){
            ligado = true;
            return true;
        }
        return false;
    }

    public boolean desligar(){
        if(ligado){
            ligado = false;
            return true;
        }
        return false;
    }
    //GETS
    public boolean getLigado(){
        return ligado;
    }

    public double getAltitude(){
        return altitude;
    }

    public int getCapacidade(){
        return capacidade;
    }

    public int getPessoas(){
        return pessoas;
    }
    //SETS
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public void setAltitude(double altitude){
        this.altitude = altitude;
    }

    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }

    public void setPessoas(int pessoas){
        this.pessoas = pessoas;
    }

    public String toSring(){
        return"Helicoptero | ligado: " + ligado +
        " | altitude: " + altitude +
        " | capacidade: " + capacidade +
        " | pessoas: " + pessoas;
    }
}