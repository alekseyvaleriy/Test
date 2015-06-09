package alxdm.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.TextPaint;
import android.util.AttributeSet;

import android.widget.TextView;

public class RotateTextView  extends TextView {
    //private Paint mPaint = makePaint(Color.BLUE);
    private String mRotateText = "Жратва";
    private TextPaint mPaint = getPaint();

    public RotateTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        // TODO Auto-generated constructor stub
        init();
    }

    public RotateTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
        init();
    }

    public RotateTextView(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
        init();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int viewWidth = getWidth();
        int viewHeight = getHeight();
        canvas.translate(viewWidth / 2, viewHeight / 2);
        for (int i = 0; i < 10; i++) {
            canvas.drawText(mRotateText, 30, 0, mPaint);
            canvas.rotate(36);
        }
    }

    private void init(){
        mPaint.setColor(Color.BLUE);
        mPaint.setTextSize(50);
        mPaint.setAntiAlias(true);
    }
}