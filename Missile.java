package com.nalayak.ShootThePlanes;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by NALAYAK on 3/25/2018.
 */

public class Missile {
    int x, y;
    int mVelocity;
    Bitmap missile;

    public Missile(Context context) {
        missile = BitmapFactory.decodeResource(context.getResources(), R.drawable.missile);
        x = GameView.dWidth / 2 - getMissleWidth() / 2;
        y = GameView.dHeight - GameView.tankHeight - getMissileHeight() / 2;
        mVelocity = 50;
    }

    public int getMissleWidth() {
        return missile.getWidth();
    }

    public int getMissileHeight() {
        return missile.getHeight();
    }
}
