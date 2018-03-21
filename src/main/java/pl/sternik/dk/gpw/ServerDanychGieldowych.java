package pl.sternik.dk.gpw;

import java.util.Observer;

public interface ServerDanychGieldowych {
    void addObserver(Observer o);

    void symulujTransakcje();
}