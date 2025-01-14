package com.pixel.newsapp.data.remote.dto

import com.pixel.newsapp.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)