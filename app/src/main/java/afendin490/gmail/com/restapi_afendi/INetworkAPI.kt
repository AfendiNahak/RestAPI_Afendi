package afendin490.gmail.com.restapi_afendi

import io.reactivex.Observable
import retrofit2.http.GET

interface INetworkAPI {

    @GET("posts/")
    fun getAllPosts(): Observable<List<Post>>
}