package com.pixel.newsapp.domain.usecases.news

import com.pixel.newsapp.data.local.NewsDao
import com.pixel.newsapp.domain.model.Article
import javax.inject.Inject

class UpsertArticle @Inject constructor(
    private val newsDao: NewsDao
) {

    suspend operator fun invoke(article: Article){
        newsDao.upsert(article = article)
    }

}