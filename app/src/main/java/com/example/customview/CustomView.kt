package com.example.customview

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.Nullable
import androidx.constraintlayout.widget.ConstraintLayout

class CustomView(context: Context, @Nullable attrs: AttributeSet) :
    ConstraintLayout(context, attrs) {

    private var view: View = LayoutInflater.from(context).inflate(R.layout.custom_view, this, true)
    private var imageView: ImageView
    private var titleTextView: TextView
    private var subtitleTextView: TextView
    private var imageDrawable: Drawable?
    private var title: String?
    private var subtitle: String?
    private var btnClick: Button
    private var buttonText: String?

    init {
        imageView = view.findViewById(R.id.imageView)
        titleTextView = view.findViewById(R.id.titleTextView)
        subtitleTextView = view.findViewById(R.id.subtitleTextView)
        btnClick = view.findViewById(R.id.btnClick)

        val typedArray = context.theme.obtainStyledAttributes(attrs, R.styleable.CustomView, 0, 0)

        try {
            imageDrawable = typedArray.getDrawable(R.styleable.CustomView_setImageDrawable)
            title = typedArray.getString(R.styleable.CustomView_setTitle)
            subtitle = typedArray.getString(R.styleable.CustomView_setSubTitle)
            buttonText = typedArray.getString(R.styleable.CustomView_setTitle)
            imageView.setImageDrawable(imageDrawable)
            titleTextView.text = title
            subtitleTextView.text = subtitle
            btnClick.text = buttonText
            titleTextView.textSize = 30F
            titleTextView.setTextColor(Color.BLACK)
            subtitleTextView.setTextColor(Color.RED)

        } finally {
            typedArray.recycle()
        }

    }


    fun setImageDrawable(drawable: Drawable?) {
        imageView.setImageDrawable(drawable)
    }

    fun getImageDrawable(): Drawable? {
        return imageDrawable
    }

    fun setTitle(text: String?) {
        titleTextView.text = text
    }

    fun getTitle(): String? {
        return title
    }

    fun setSubtitle(text: String?) {
        subtitleTextView.text = text
    }

    fun getSubtitle(): String? {
        return subtitle
    }

    fun getButton(): String? {
        return buttonText
    }

    fun setButton(text: String?) {
        btnClick.text = text
    }
}