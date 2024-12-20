package com.dicoding.picodiploma.loginwithanimation.costumview

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class EditTextEmail : AppCompatEditText {
    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init()
    }

    private fun init() {
        addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                val emailPattern = "^[A-Za-z0-9]+@[A-Za-z]+\\.com\$"

                if (!s.toString().matches(emailPattern.toRegex())) {
                    setError("Email harus diakhiri dengan 'user@email.com'", null)
                } else {
                    error = null
                }
            }

            override fun afterTextChanged(s: Editable) {}
        })
    }
}
