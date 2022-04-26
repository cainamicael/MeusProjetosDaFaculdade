package classes;

public class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    public Pessoa(String nome, double peso, double altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    public double calculoImc(){
        return this.peso/(this.altura*this.altura);
    }
    public String toString(){
        return nome + ", seu peso é: " + peso + " kg e o seu IMC é " + calculoImc()+". Você está: ";
    }
    public String classificacao(double imc){
        if (imc < 17){
            return "Seu IMC é menor que 17 | Vc está muito abaixo do peso! Você presisa engordar urgentemente!";
        }else if(imc >= 17 && imc <= 18.49){
            return "Seu IMC está entre 17 e 18,49 | Vc está abaixo do peso! Engorde mais um pouquinho!";
        }else if(imc >= 18.5 && imc <= 24.99){
            return "Seu IMC está entre 18,5 e 24,99 | Seu peso está normal! Continue assim!";
        }else if(imc >= 25 && imc <= 29.99){
            return "Seu IMC está entre 25 e 29,99 | Vc está um pouco acima do peso! Faça uma dieta!";
        }else if(imc >= 30 && imc <= 34.99){
            return "Seu IMC está entre 30 e 34,99 | Vc está um pouco obeso!  Faça uma dieta mais séria!";
        }else if(imc >= 35 && imc <= 39.99){
            return "Seu IMC está entre 35 e 39,99 | Vc está com obesidade severa!  Faça uma dieta séria urgentemente!";
        }else if(imc >= 40){
            return "Seu IMC está maior ou igual á 40 | Vc está com obesidade Morbida!  Procure um médico, faça uma dieta séria urgentemente ou uma cirurgia bariátrica!";
        }else{
            return "";
        }

    }
    

    
}
