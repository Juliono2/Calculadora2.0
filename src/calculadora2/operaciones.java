/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2;

/**
 *
 * @author Usuario
 */
public class operaciones {
    
    private String digito;
    private String resultado1;//
    private int resultado2;
    private boolean suma;
    private boolean multiplicacion;
    private boolean division;
    private boolean resta;
    private boolean borrar;
    private String clear;
    private boolean binario;
    private boolean octagonal;
    private boolean hexagonal;
    private boolean decimal;
    private int conversion;
    
    public operaciones(){
        
        digito="";
        suma = false;
        multiplicacion= false;
        division= false;
        resta= false;
        borrar = false;
        
        decimal= false;
        binario = false;
        octagonal = false;
        hexagonal = false;
        conversion = 10;
    }

    public String getClear() {
        return clear;
    }

    public void setClear(String clear) {
        this.clear = clear;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }

    public String getDigito() {
        return digito;
    }
    

    public void setConversion(int conversion) {
        this.conversion = conversion;
    }

    public int getConversion() {
        return conversion;
    }
 
    public void agregarNumero(int numero){
    setDigito(digito+numero);
}
    public void decimal(){
        decimal= true;
    }
    
    public void binario(){
        binario= true;
    }
    
    public void octagonal(){
        octagonal = true; 
    }
    
    public void hexagonal(){
        hexagonal = true;
    }
    
    public void decimal (String numero){
        
        this.digito = Integer.toString(Integer.parseInt(digito), 10);
        decimal = true;
    }
    public String binario (String numero){
        
        this.digito = Integer.toBinaryString(Integer.parseInt(digito));
        binario= true;
        
        return digito;
    }
    
    public void octagonal(String numero){
    
        this.digito = Integer.toOctalString(Integer.parseInt(digito));
        octagonal= true;
    }
    
    public void hexagonal(String numero){
        
        this.digito = Integer.toHexString(Integer.parseInt(digito));
        hexagonal= true;
    }
    
    public void conversion(){
        
        if (decimal == true){
            
            conversion =10;
            digito = "";
            
            setConversion(conversion);
        }
        if (binario == true){
           conversion = 2;
           digito= "";
           
           setConversion(conversion);
        }
        if (octagonal == true){
            conversion = 8;
            digito = "";

            setConversion(conversion);
        }
        if (hexagonal == true){
            conversion = 16;
            digito = "";

            setConversion(conversion);
        }
        
        decimal = false;
        binario = false;
        octagonal = false;
        hexagonal = false;

    } 
    
    public String imprimir (String numero){
        if (numero == ""){
            
        }
    return numero;
    }
    
    public void suma (String numero){
        
        this.resultado2 =  Integer.parseInt(numero);
        suma=true;
        setDigito("");
        
    }
    
    public void resta (String numero){
        
        this.resultado2 = Integer.parseInt(numero);
        resta=true;
        setDigito(""); 
        
    }
    
    public void multiplicacion (String numero){
        
        this.resultado2 = Integer.parseInt(numero);
        multiplicacion=true;
        setDigito("");
        
    }
    
    public void dividir (String numero){
        this.resultado2 = Integer.parseInt(numero);
        division=true;
        setDigito("");
        
    }
    public void borrar (String numero){
        this.resultado2 = Integer.parseInt(numero);
        borrar = true;
        setDigito("");
    }
    
    public int resultadoOperacion (String numero){
        
        digito="";
        
        if (suma == true){
            
            resultado2 = resultado2 + Integer.parseInt(numero);
            digito="";
            
        }
        
        if (multiplicacion == true){
            resultado2 = resultado2 * Integer.parseInt(numero);
            digito="";
        }
        
        if (division == true){
            
            resultado2 = resultado2 / Integer.parseInt(numero);
            digito="";
        }
        if (resta == true){
            
            resultado2 = resultado2 - Integer.parseInt(numero);
            digito="";
        }
        if (borrar == true){
            setClear("");
            digito="";
        }
        
        suma=false;
        resta=false;
        division=false;
        resta=false;
        
        return resultado2;
    }
    
}
