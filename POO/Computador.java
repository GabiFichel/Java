public class Computador {
    String processador;
    String placaDeVideo;
    String sistemaOperacional;
    int qntdDeRam;
    int armazenamento;

    public String getProcessador(){
        return processador;
    }
    public void setProcessador(String processador){
        this.processador = processador;
    }
    public String getPlacaDeVideo(){
        return  placaDeVideo;
    }
    public void setPlacaDeVideo(String placaDeVideo){
        this.placaDeVideo = placaDeVideo;
    }
    public String getSistemaOperacional(){
        return  sistemaOperacional;
    }
    public void setSistemaOperacional(String sistemaOperacional){
        this.sistemaOperacional = sistemaOperacional;
    }
    public int getQntdDeRam(){
        return qntdDeRam;
    }
    public void setQntdDeRam(int qntdDeRam){
        this.qntdDeRam = qntdDeRam;
    }
    public int getArmazenamento(){
        return armazenamento;
    }
    public void setArmazenamento(int armazenamento){
        this.armazenamento = armazenamento;
    }
}
