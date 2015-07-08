package com.esolz.mypropertyapp.Customviews;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by ltp on 08/07/15.
 */
public class OpenSansSemiBoldTextView extends TextView {

    public OpenSansSemiBoldTextView(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
        init();
    }

    public OpenSansSemiBoldTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public OpenSansSemiBoldTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public void init() {

        super.setTypeface(Typeface.createFromAsset(getContext().getAssets(),
                "OpenSans-Semibold.ttf"));

    }

}
