package com.rays95.cinemarays

import android.content.Context
import android.graphics.Rect
import androidx.recyclerview.widget.RecyclerView

class ItemOffsetsDecoration(private val context: Context): RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, itemPosition: Int, parent: RecyclerView) {
        super.getItemOffsets(outRect, itemPosition, parent)
        val hSide = context.resources.getDimension(R.dimen.margin_mini_10).toInt()
        val vSide = context.resources.getDimension(R.dimen.margin_mini_10).toInt()
        outRect.set(hSide, vSide, hSide, vSide)
    }
}