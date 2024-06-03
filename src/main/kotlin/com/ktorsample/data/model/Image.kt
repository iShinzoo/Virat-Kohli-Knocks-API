package com.ktorsample.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Image(
    val date : String,
    val description : String,
    val imageUrl : String
)
