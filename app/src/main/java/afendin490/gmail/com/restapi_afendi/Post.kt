package afendin490.gmail.com.restapi_afendi

import com.google.gson.annotations.SerializedName

data class Post(
    //@SerializedName("body")
    val body: String,
    //@SerializedName("userId")
    val id: Int,
    //@SerializedName("title")
    val title: String,
    //@SerializedName("userId")
    val userId: Int
)
