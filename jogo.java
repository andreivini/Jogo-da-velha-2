package com.example.celso.jogodavelha;

/**
 * Created by Celso on 23/05/2017.
 */


import android.widget.ImageButton;
        import java.util.ArrayList;
        import java.util.List;


public class jogo{

    private List<ImageButton> imageButtons = new ArrayList<>();
    private int[] serie = new int[2];

    public jogo(ImageButton...imageButtons) {
        for (ImageButton btn : imageButtons)
            this.imageButtons.add(btn);
        this.serie[0] = 0;
        this.serie[1] = 0;
    }

    public jogo addSerie(int jogador) {
        jogo g = (++serie[jogador] < 3) ? null : this;
        return g;
    }

    public List<ImageButton> getImageButtons() {
        return this.imageButtons;
    }
}