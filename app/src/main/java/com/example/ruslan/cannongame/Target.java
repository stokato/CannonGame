package com.example.ruslan.cannongame;

public class Target extends GameElement {
    private int mHitReward;

    public Target(CannonView view, int color, int hitReward, int x, int y, int width,
                  int length, float velocityY) {
        super(view, color, CannonView.TARGET_SOUND_ID, x, y, width, length, velocityY);

        this.mHitReward = hitReward;
    }

    // Возвращает прирост при попадании в мишень.
    public int getHitReward() {
        return mHitReward;
    }
}
