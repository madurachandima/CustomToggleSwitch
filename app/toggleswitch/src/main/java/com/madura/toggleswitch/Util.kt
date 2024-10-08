package com.madura.toggleswitch

import android.content.Context

fun dp2px(context: Context, dp: Float): Float {
    val metrics = context.resources.displayMetrics
    return dp * (metrics.densityDpi / 160f)
}