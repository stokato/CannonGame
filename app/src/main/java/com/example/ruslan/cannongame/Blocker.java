package com.example.ruslan.cannongame;

public class Blocker extends GameElement {
    private int mMissPenatly; // Петля времени при попадании в блок.

    public Blocker(CannonView view, int color, int mMissPenatly, int x, int y, int width,
                   int length, float volocityY) {
        super(view, color, CannonView.BLOCKER_SOUND_ID, x, y, width, length, volocityY);

        this.mMissPenatly = mMissPenatly;
    }

    // Возвращает штраф при попадании в блок
    public int getMissPenatly() {
        return mMissPenatly;
    }
}
