package com.devbaucha.dictionaryapp.feature_dictionary.domain.model

data class Definition(
    val antonyms: List<String>,
    val definition: String,
    //Make it nullable
    val example: String,
    val synonyms: List<String>
)
