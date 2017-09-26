package com.example.user.mtglifetracker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

/**
 * TODO: document your custom view class.
 */
public class LifeButtonView extends android.support.v7.widget.AppCompatButton {

    private int modifier;
    private int playerIdx;

    public LifeButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    public void setModifier(int mod) {
        modifier = mod;
    }

    public int getModifier() {
        return modifier;
    }

    public void setPlayerIdx(int idx) {
        playerIdx = idx;
    }

    public int getPlayerIdx() {
        return playerIdx;
    }
}
