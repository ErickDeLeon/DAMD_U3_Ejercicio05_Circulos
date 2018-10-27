package mx.edu.ittepic.damd_u3_ejercicio05_circulos;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Lienzo extends View {

    Circulos c1, c2, c3, c4;

    public Lienzo (Context context){
        super(context);

        c1 = new Circulos(500,170,Color.CYAN, this, 100);
        c1.mover(5,5);

        c2 = new Circulos(400,600,Color.YELLOW, this, 50);
        c2.mover(5,5);

        c3 = new Circulos(160,1900,Color.BLUE, this, 150);
        c3.mover(5,10);

        c4 = new Circulos(600,1500,Color.MAGENTA, this, 75);
        c4.mover(5,10);


    }

    public void onDraw(Canvas c){
        super.onDraw(c);
        Paint p = new Paint();

        c1.pintar(c,p);
        c2.pintar(c,p);
        c3.pintar(c,p);
        c4.pintar(c,p);

    }
}
