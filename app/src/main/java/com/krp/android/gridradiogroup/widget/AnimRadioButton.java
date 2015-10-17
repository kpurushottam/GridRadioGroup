package com.krp.android.gridradiogroup.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/**
 * Created by root on 18/10/15.
 */
public class AnimRadioButton extends CompoundButton {
    public AnimRadioButton(Context context) {
        this(context, null);
    }

    public AnimRadioButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AnimRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * {@inheritDoc}
     * <p>
     * If the radio button is already checked, this method will not toggle the radio button.
     */
    @Override
    public void toggle() {
        // we override to prevent toggle when the radio is already
        // checked (as opposed to check boxes widgets)
        if (!isChecked()) {
            super.toggle();
        }
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        return AnimRadioButton.class.getName();
    }
}
