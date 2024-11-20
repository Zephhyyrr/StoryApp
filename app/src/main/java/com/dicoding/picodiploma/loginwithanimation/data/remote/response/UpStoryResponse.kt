package com.dicoding.picodiploma.loginwithanimation.data.remote.response

import com.google.gson.annotations.SerializedName

data class UpStoryResponse(

	@field:SerializedName("error")
	val error: Boolean? = null,

	@field:SerializedName("message")
	val message: String? = null
)
