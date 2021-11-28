package com.devbaucha.dictionaryapp.feature_dictionary.domain.repository

import com.devbaucha.dictionaryapp.core.util.Resource
import com.devbaucha.dictionaryapp.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {
    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}
