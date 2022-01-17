package ir.tdroid.bitcoinwidget.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("tobtc")
    fun exchangeRates(
        @Query("currency") currency : String  = "USD",
        @Query("value") value : Int = 1
    ) : Float

}