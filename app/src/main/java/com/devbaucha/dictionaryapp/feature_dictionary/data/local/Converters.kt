package com.devbaucha.dictionaryapp.feature_dictionary.data.local

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.devbaucha.dictionaryapp.feature_dictionary.data.util.JsonParser
import com.devbaucha.dictionaryapp.feature_dictionary.domain.model.Meaning
import com.google.gson.reflect.TypeToken

/**
 * We are using Typed COnverter as we need to provide own instance of Type COnverter
 *
 */
@ProvidedTypeConverter
class Converters (private val jsonParser: JsonParser){

    @TypeConverter
    fun fromMeaningsJson(json: String) : List<Meaning>{
        return jsonParser.fromJson<ArrayList<Meaning>>(json, object : TypeToken<ArrayList<Meaning>>(){}.type)?: emptyList()
    }

    @TypeConverter
    fun toMeaningsJson(meanings: List<Meaning>): String{
        return jsonParser.toJson(meanings, object: TypeToken<ArrayList<Meaning>>(){}.type)?:"[]"
    }
}