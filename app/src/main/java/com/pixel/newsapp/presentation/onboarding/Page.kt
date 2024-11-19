package com.pixel.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.pixel.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "Getting to know the world of cryptocurrency",
        description = "Learn more about Bitcoin, blockchain technology, and how this digital currency is changing the way we transact in the modern era.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "The Beauty and Majesty of Besakih Temple",
        description = "Explore the beauty of Besakih Temple, Bali's largest and oldest temple complex that stands majestically at the foot of Mount Agung.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Healthy Living Starts with Food",
        description = "Understand how a healthy food can be the foundation for maintaining a healthy body, increasing energy, and extending life expectancy.",
        image = R.drawable.onboarding3
    )
)