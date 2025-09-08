package org.example;

public class PlacaVideo extends Componente {

    private static PlacaVideo placaVideo = new PlacaVideo();

    private PlacaVideo() {};

    public static PlacaVideo getInstancia() {
        return placaVideo;
    }
}
