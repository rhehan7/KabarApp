package com.pixel.newsapp.domain.usecases.app_entry

import com.pixel.newsapp.domain.manger.LocalUserManger
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ReadAppEntry @Inject constructor(
    private val localUserManger: LocalUserManger
) {

    operator fun invoke(): Flow<Boolean> {
        return localUserManger.readAppEntry()
    }

}