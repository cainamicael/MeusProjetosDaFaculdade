package samsung;

public class Celular implements Touch {
    
    private boolean ligado;
    private boolean desbloqueado;
    private boolean whatsappAberto;
    private boolean instagramAberto;

    public Celular () {
        this.ligado = false;
        this.desbloqueado = false;
        this.whatsappAberto = false;
        this.instagramAberto = false;
    }

    public boolean isLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public boolean isDesbloqueado() {
        return desbloqueado;
    }
    public void setDesbloqueado(boolean desbloqueado) {
        this.desbloqueado = desbloqueado;
    }
    public boolean isWppAberto() {
        return whatsappAberto;
    }
    public void setWppAberto(boolean wppAberto) {
        this.whatsappAberto = wppAberto;
    }
    public boolean isInstaAberto() {
        return instagramAberto;
    }
    public void setInstaAberto(boolean instaAberto) {
        this.instagramAberto = instaAberto;
    }

    //metodos abstratos

    @Override
    public void abrirInstagram() {
        if (isLigado() && isDesbloqueado() && !(isInstaAberto())){
            System.out.println("Abrindo Instagram...");
            setInstaAberto(true);
        }else {
            System.out.println("Verifique se está ligado ou desbloqueado, ou então, o app já deve estar aberto!");
        }
    }

    @Override
    public void abrirWhatsapp() {
        if (isLigado() && isDesbloqueado() && !(isWppAberto())){
            System.out.println("Abrindo o whatsapp...");
            setWppAberto(true);
        }else {
            System.out.println("Verifique se está ligado ou desbloqueado, ou então, o app já deve estar aberto!");
        }   
    }

    @Override
    public void bloquear() {
        if (isLigado() && isDesbloqueado()){
            System.out.println("Celular bloqueado");
            setDesbloqueado(false);
        }else {
            System.out.println("O celular está desligado!");
        }
    }

    @Override
    public void desbloquear() {
        if (isLigado() && !(isDesbloqueado())){
            System.out.println("Desbloqueado!");
            setDesbloqueado(true);
        }else {
            System.out.println("O celular está desligado");
        }
    }

    @Override
    public void desligar() {
        if (isLigado()){
            System.out.println("Desligando...");
            setLigado(false);
            setDesbloqueado(false);
            setWppAberto(false);
            setInstaAberto(false);
        }else {
            System.out.println("O celular já está desligado!");
        }   
    }

    @Override
    public void fecharInstagram() {
        if (isLigado() && isDesbloqueado() && isInstaAberto()){
            System.out.println("Fechando instagram...");
            setInstaAberto(false);
        }else {
            System.out.println("O insagram já está fechado!");
        } 
    }

    @Override
    public void fecharWhatsapp() {
        if (isLigado() && isDesbloqueado() && isWppAberto()){
            System.out.println("Fechando o whatsapp...");
           setWppAberto(false);
        }else {
            System.out.println("O whatsapp já está fechado! ");
        } 
    }

    @Override
    public void ligar() {
        if (!(isLigado())){
            System.out.println("Iniciando Celular...");
            setLigado(true);
        }else{
            System.out.println("O celular já está ligado");
        }       
    }

    @Override
    public void status() {
        System.out.printf("%n");
        if (isLigado())
            System.out.println("Celular Ligado");
        else 
            System.out.println("Celular Desligado");
        if (isDesbloqueado())
            System.out.println("Celular Desbloqueado");
        else 
            System.out.println("Celular Bloqueado");
        if (isWppAberto())
            System.out.println("Whatsapp aberto");
        else 
            System.out.println("Whatsapp Fechado");
        if (isInstaAberto())
            System.out.println("Instagram aberto");
        else 
            System.out.println("Instagram Fechado");
        System.out.printf("%n");
    }

    @Override
    public void statusLogico() {
        System.out.printf("%n");
        System.out.println("Ligado? " + isLigado());
        System.out.println("Desbloqueado? " + isDesbloqueado());
        System.out.println("Whatsapp aberto? " + isWppAberto());
        System.out.println("Instagram Aberto? " + isInstaAberto());
        System.out.printf("%n");
    }

}
