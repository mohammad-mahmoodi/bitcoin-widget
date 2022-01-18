package ir.tdroid.bitcoinwidget.data

import android.content.SharedPreferences
import ir.tdroid.bitcoinwidget.data.model.BitcoinPriceDto
import javax.inject.Inject

class BitcoinValueLocalDataSource @Inject constructor(
    private val sharedPreferences: SharedPreferences
) {

   fun setBitcoinPrice(price : Double){
       sharedPreferences.edit().apply {
           putString("BitcoinPrice" , price.toString())
           putLong("BitcoinPriceUpdateTime" , System.currentTimeMillis())
       }.apply()
    }

    fun getBitcoinPrice() : BitcoinPriceDto{
        return  BitcoinPriceDto(
            price= sharedPreferences.getString("BitcoinPrice" , ""),
            time = sharedPreferences.getLong("BitcoinPriceUpdateTime" , 0)
        )
    }


}