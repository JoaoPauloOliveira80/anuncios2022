package com.vigjoaopaulo.api_rest_2021.apis;

public class Apis {
    public static String TUPI= "10.0.0.4";
    public static String CASA= "192.168.1.104";
    public static String IP= CASA;

    public static final String API_ANUNCIO = "http://"+IP+":8080/anuncios/";

    public  String getAnuncio(){
        return API_ANUNCIO;
    }
}
