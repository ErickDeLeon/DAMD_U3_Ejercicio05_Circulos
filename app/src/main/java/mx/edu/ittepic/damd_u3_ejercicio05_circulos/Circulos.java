package mx.edu.ittepic.damd_u3_ejercicio05_circulos;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.CountDownTimer;

public class Circulos {

    float x, y, radio;
    int desplazamientox, desplazamientoy;
    CountDownTimer t;
    int color;

    public Circulos (int posx, int  posy, int c, final Lienzo l, final int rad){
        x=posx;
        y=posy;
        radio=rad;
        color=c;

        t = new CountDownTimer(1000, 10) {
            @Override
            public void onTick(long millisUntilFinished) {

                x+=desplazamientox;

                if(x >= l.getWidth()-radio){
                    desplazamientox *= -1;
                }
                if(x <= radio){
                    desplazamientox *= -1;
                }


                y+=desplazamientoy;

                if(y >= l.getHeight()-radio){
                    desplazamientoy *= -1;
                }
                if (y <= radio){
                    desplazamientoy *= -1;
                }

                l.invalidate();

            }

            @Override
            public void onFinish() {
                start();
            }
        };


    }

    public void pintar(Canvas c, Paint p){

        p.setColor(color);
        c.drawCircle(x,y,radio,p);
    }

    public void mover(int desplax, int desplay ){

        desplazamientox = desplax;
        desplazamientoy = desplay;
        t.start();

    }


}
