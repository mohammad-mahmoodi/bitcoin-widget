package ir.tdroid.bitcoinwidget.data

import android.content.SharedPreferences
import com.nhaarman.mockitokotlin2.*
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class BitcoinValueLocalDataSourceTest {
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var sharedPreferencesEditor: SharedPreferences.Editor
    private lateinit var bitcoinValueLocalDataSource: BitcoinValueLocalDataSource


    @Before
    fun setup() {
        sharedPreferences = mock()
        sharedPreferencesEditor = mock()
        whenever(sharedPreferences.edit())
            .thenReturn(sharedPreferencesEditor)

        bitcoinValueLocalDataSource = BitcoinValueLocalDataSource(sharedPreferences)
    }

    @Test
    fun saveBitcoin_shouldSaveToSharedPreferences() {
        val bitcoinPrice = 100.0
        bitcoinValueLocalDataSource.setBitcoinPrice(bitcoinPrice)
        inOrder(sharedPreferencesEditor) {
            verify(sharedPreferencesEditor).putString(any(), eq(bitcoinPrice.toString()))
            verify(sharedPreferencesEditor).putLong(any(), any())
            verify(sharedPreferencesEditor).apply()
        }
    }

    @Test
    fun getBitcoin_shouldSaveToSharedPreferences() {
        bitcoinValueLocalDataSource.getBitcoinPrice()
            verify(sharedPreferences).getString(any() , any())
            verify(sharedPreferences).getLong(any(), any())

    }
}