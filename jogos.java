package com.example.celso.jogodavelha;

import java.util.ArrayList;
import java.util.List;

public class jogos {
    private List<jogo> games = new ArrayList<>();

    public jogos(jogo...games) {
        for (jogo g : games)
            this.games.add(g);
    }

    public jogo gamesAddSerie(int jogador) {
        jogo g;
        for (jogo game : games) {
            g = game.addSerie(jogador);
            if (g != null) return g;
        }
        return null;
    }
}