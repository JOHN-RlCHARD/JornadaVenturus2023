package atividade2;

public class Carro {

    public String cor, marca;
    public int ano, marcha, velocidadeAtual, velocidadeMaxima;
    public boolean ligado;
    
    public Carro( String cor, String marca, int ano) {
        setMarcha(0);
        setVelocidadeAtual(0);
        setVelocidadeMaxima(0);
        setLigado(false);
    }
    
    public void ligar() {
        setLigado(true);
        System.out.println("O carro está ligado");
    }
    
    public void desligar() {
        setLigado(false);
        setMarcha(0);
        System.out.println("O carro está desligado");
    }
    
    public void acelerar() {
        if (isLigado() == false) System.out.println("O carro está desligado.");
        else {
            if (getVelocidadeAtual() == getVelocidadeMaxima()) System.out.println("Velocidade Máxima Atingida");
            else {
                setVelocidadeAtual(velocidadeAtual+10);
                System.out.println("Acelerando...");
                System.out.println("Velocidade Atual: "+getVelocidadeAtual());
            }
        }
    }
    
    public void pegarMarcha(int marcha) {
        if (isLigado() == false) System.out.println("O carro está desligado.");
        else {
            switch (marcha) {
                case -1:
                    setVelocidadeMaxima(-10);
                    System.out.println("Entrando em marcha Ré");
                    break;
                case 0:
                    setVelocidadeAtual(0);
                    System.out.println("Ponto Morto");
                    break;
                case 1:
                    setVelocidadeMaxima(40);
                    System.out.println("Marcha Média");
                    break;
                case 2:
                    setVelocidadeMaxima(80);
                    System.out.println("Marcha Alta");
                    break;
                default:
                    System.out.println("Marcha inválida");
            }
        }
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public int getMarcha() {
        return marcha;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public boolean isLigado() {
        return ligado;
    }
    
    
    
}
