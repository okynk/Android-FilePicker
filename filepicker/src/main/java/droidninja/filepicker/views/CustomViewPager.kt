package droidninja.filepicker.views

import android.content.Context
import android.util.AttributeSet
import androidx.viewpager.widget.ViewPager
import android.view.MotionEvent

class CustomViewPager : ViewPager {

    var swipeEnabled: Boolean = false

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        this.swipeEnabled = true
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        return if (this.swipeEnabled) {
            super.onTouchEvent(event)
        } else false

    }

    override fun onInterceptTouchEvent(event: MotionEvent): Boolean {
        return if (this.swipeEnabled) {
            super.onInterceptTouchEvent(event)
        } else false

    }
}