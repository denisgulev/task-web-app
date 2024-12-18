package com.example.entities

import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId

data class Task(
    @BsonId
    val id: ObjectId,
    val name: String,
    val description: String,
    val priority: Priority,
    val userId: ObjectId
)

@Serializable
enum class Priority {
    Low, Medium, High, Vital
}
