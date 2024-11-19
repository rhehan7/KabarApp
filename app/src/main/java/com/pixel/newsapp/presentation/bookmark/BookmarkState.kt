package com.pixel.newsapp.presentation.bookmark

import com.pixel.newsapp.domain.model.Article

data class BookmarkState(
    val articles: List<Article> = emptyList()
)