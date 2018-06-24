package com.example.ruslan.cannongame;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public class GameElement {
    protected CannonView mView; // Представление.
    protected Paint mPaint = new Paint(); // Объект Paint для рисования
    protected Rect mShape; // Ограничивающий прямоугольник.
    private float mVelocityY; // Ветрикальная скорость.
    private int mSoundId; // Звук, связанный с GameElement

    public GameElement (CannonView view, int color, int soundId, int x, int y, int width,
                        int length, float velocityY) {
        this.mView = view;
        mPaint.setColor(color);
        mShape = new Rect(x, y, x + width, y + length); // Определение границ

        mSoundId = soundId;
        mVelocityY = velocityY;
    }

    public void update(double interval) {
        // Обновление вертикальной позиции
        mShape.offset(0, (int) (mVelocityY * interval));

        // Если GameElement сталкивается со стеной, изменить направление
        if (mShape.top < 0 && mVelocityY < 0 || mShape.bottom > mView.getScreenHeight() &&
                mVelocityY > 0)
            mVelocityY *= -1;
    }

    public void draw(Canvas canvas) {
        canvas.drawRect(mShape, mPaint);
    }

    public void playSound() {
        mView.playSound(mSoundId);
    }
}
