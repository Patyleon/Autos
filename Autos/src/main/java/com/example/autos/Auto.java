package com.example.autos;

public class Auto {
    private String marca;
    private String modelo;
    private int fecha;


public Auto (String ma,String mo, int fe){
     marca= ma;
     modelo=mo;
     fecha=fe;
}


    public Auto (){
        marca= "Nissan";
        modelo="Tsuru";
        fecha=1992;
    }

    public String toString(){
    String cadena = "\nmarca:"+ this.marca+"\nmodelo:"+ this.modelo+"\fecha:"+ this.fecha;
    return  cadena;
    }

 public  static void main (String [] args){
     Auto Tsuru = new Auto ("Nissan","Tsuru",1992);
     Auto Kia = new Auto ("Kia","Cherokee",2022);
     Auto jeep = new Auto ("Jeep","Tsuru",1992);
     Auto Volkswagen = new Auto ("Volkswagen","Tsuru",1992);
     Auto Audi = new Auto ("Audi","Tsuru",1992);
    }
}
