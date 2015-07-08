package com.esolz.mypropertyapp.Customviews;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by ltp on 08/07/15.
 */
public class OpenSansRegularEditText extends EditText {

    public OpenSansRegularEditText(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
        init();
    }

    public OpenSansRegularEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public OpenSansRegularEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public void init() {

        super.setTypeface(Typeface.createFromAsset(getContext().getAssets(),
                "OpenSans-Regular.ttf"));

    }

}

