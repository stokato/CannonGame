package com.example.ruslan.cannongame;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;

public class Cannon {
    private int mBaseRadius;
    private int mBarrelLength;
    private Point mBarrelEnd = new Point();  // Конечная точка ствола
    private double mBarrelAngle; // Угол наклона ствола
    private Cannonball cannonball;
    private Paint mPaint = new Paint(); // Объект для рисования пушки
    private CannonView mView; // Представление, в котором находится пушка

    public Cannon(CannonView view, int baseRadius, int barrelLength, int barrelWidth) {
        mView = view;
        mBaseRadius = baseRadius;
        mBarrelLength = barrelLength;

        mPaint.setStrokeWidth(barrelWidth);
        mPaint.setColor(Color.BLACK);
        align(Math.PI / 2);
    }

    private void align(double barrelAngle) {
        mBarrelAngle = barrelAngle;

        mBarrelEnd.x = (int) (mBarrelLength * Math.sin(barrelAngle));
        mBarrelEnd.y = (int) (-mBarrelLength * Math.cos(barrelAngle)) + mView.getScreenHeigh() / 2;
    }
}
