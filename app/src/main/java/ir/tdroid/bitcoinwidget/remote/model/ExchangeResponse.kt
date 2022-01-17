package ir.tdroid.bitcoinwidget.remote.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class ExchangeResponse(
    @SerializedName("AUD")
    var aUD: AUD? = null,
    @SerializedName("BRL")
    var bRL: BRL? = null,
    @SerializedName("CAD")
    var cAD: CAD? = null,
    @SerializedName("CHF")
    var cHF: CHF? = null,
    @SerializedName("CLP")
    var cLP: CLP? = null,
    @SerializedName("CNY")
    var cNY: CNY? = null,
    @SerializedName("DKK")
    var dKK: DKK? = null,
    @SerializedName("EUR")
    var eUR: EUR? = null,
    @SerializedName("GBP")
    var gBP: GBP? = null,
    @SerializedName("HKD")
    var hKD: HKD? = null,
    @SerializedName("INR")
    var iNR: INR? = null,
    @SerializedName("ISK")
    var iSK: ISK? = null,
    @SerializedName("JPY")
    var jPY: JPY? = null,
    @SerializedName("KRW")
    var kRW: KRW? = null,
    @SerializedName("NZD")
    var nZD: NZD? = null,
    @SerializedName("PLN")
    var pLN: PLN? = null,
    @SerializedName("RUB")
    var rUB: RUB? = null,
    @SerializedName("SEK")
    var sEK: SEK? = null,
    @SerializedName("SGD")
    var sGD: SGD? = null,
    @SerializedName("THB")
    var tHB: THB? = null,
    @SerializedName("TRY")
    var tRY: TRY? = null,
    @SerializedName("TWD")
    var tWD: TWD? = null,
    @SerializedName("USD")
    var uSD: USD? = null
) {
    @Keep
    data class AUD(
        @SerializedName("buy")
        var buy: Double? = null,
        @SerializedName("last")
        var last: Double? = null,
        @SerializedName("15m")
        var m: Double? = null,
        @SerializedName("sell")
        var sell: Double? = null,
        @SerializedName("symbol")
        var symbol: String? = null
    )

    @Keep
    data class BRL(
        @SerializedName("buy")
        var buy: Double? = null,
        @SerializedName("last")
        var last: Double? = null,
        @SerializedName("15m")
        var m: Double? = null,
        @SerializedName("sell")
        var sell: Double? = null,
        @SerializedName("symbol")
        var symbol: String? = null
    )

    @Keep
    data class CAD(
        @SerializedName("buy")
        var buy: Double? = null,
        @SerializedName("last")
        var last: Double? = null,
        @SerializedName("15m")
        var m: Double? = null,
        @SerializedName("sell")
        var sell: Double? = null,
        @SerializedName("symbol")
        var symbol: String? = null
    )

    @Keep
    data class CHF(
        @SerializedName("buy")
        var buy: Double? = null,
        @SerializedName("last")
        var last: Double? = null,
        @SerializedName("15m")
        var m: Double? = null,
        @SerializedName("sell")
        var sell: Double? = null,
        @SerializedName("symbol")
        var symbol: String? = null
    )

    @Keep
    data class CLP(
        @SerializedName("buy")
        var buy: Int? = null,
        @SerializedName("last")
        var last: Int? = null,
        @SerializedName("15m")
        var m: Int? = null,
        @SerializedName("sell")
        var sell: Int? = null,
        @SerializedName("symbol")
        var symbol: String? = null
    )

    @Keep
    data class CNY(
        @SerializedName("buy")
        var buy: Double? = null,
        @SerializedName("last")
        var last: Double? = null,
        @SerializedName("15m")
        var m: Double? = null,
        @SerializedName("sell")
        var sell: Double? = null,
        @SerializedName("symbol")
        var symbol: String? = null
    )

    @Keep
    data class DKK(
        @SerializedName("buy")
        var buy: Double? = null,
        @SerializedName("last")
        var last: Double? = null,
        @SerializedName("15m")
        var m: Double? = null,
        @SerializedName("sell")
        var sell: Double? = null,
        @SerializedName("symbol")
        var symbol: String? = null
    )

    @Keep
    data class EUR(
        @SerializedName("buy")
        var buy: Double? = null,
        @SerializedName("last")
        var last: Double? = null,
        @SerializedName("15m")
        var m: Double? = null,
        @SerializedName("sell")
        var sell: Double? = null,
        @SerializedName("symbol")
        var symbol: String? = null
    )

    @Keep
    data class GBP(
        @SerializedName("buy")
        var buy: Double? = null,
        @SerializedName("last")
        var last: Double? = null,
        @SerializedName("15m")
        var m: Double? = null,
        @SerializedName("sell")
        var sell: Double? = null,
        @SerializedName("symbol")
        var symbol: String? = null
    )

    @Keep
    data class HKD(
        @SerializedName("buy")
        var buy: Double? = null,
        @SerializedName("last")
        var last: Double? = null,
        @SerializedName("15m")
        var m: Double? = null,
        @SerializedName("sell")
        var sell: Double? = null,
        @SerializedName("symbol")
        var symbol: String? = null
    )

    @Keep
    data class INR(
        @SerializedName("buy")
        var buy: Double? = null,
        @SerializedName("last")
        var last: Double? = null,
        @SerializedName("15m")
        var m: Double? = null,
        @SerializedName("sell")
        var sell: Double? = null,
        @SerializedName("symbol")
        var symbol: String? = null
    )

    @Keep
    data class ISK(
        @SerializedName("buy")
        var buy: Double? = null,
        @SerializedName("last")
        var last: Double? = null,
        @SerializedName("15m")
        var m: Double? = null,
        @SerializedName("sell")
        var sell: Double? = null,
        @SerializedName("symbol")
        var symbol: String? = null
    )

    @Keep
    data class JPY(
        @SerializedName("buy")
        var buy: Double? = null,
        @SerializedName("last")
        var last: Double? = null,
        @SerializedName("15m")
        var m: Double? = null,
        @SerializedName("sell")
        var sell: Double? = null,
        @SerializedName("symbol")
        var symbol: String? = null
    )

    @Keep
    data class KRW(
        @SerializedName("buy")
        var buy: Double? = null,
        @SerializedName("last")
        var last: Double? = null,
        @SerializedName("15m")
        var m: Double? = null,
        @SerializedName("sell")
        var sell: Double? = null,
        @SerializedName("symbol")
        var symbol: String? = null
    )

    @Keep
    data class NZD(
        @SerializedName("buy")
        var buy: Double? = null,
        @SerializedName("last")
        var last: Double? = null,
        @SerializedName("15m")
        var m: Double? = null,
        @SerializedName("sell")
        var sell: Double? = null,
        @SerializedName("symbol")
        var symbol: String? = null
    )

    @Keep
    data class PLN(
        @SerializedName("buy")
        var buy: Double? = null,
        @SerializedName("last")
        var last: Double? = null,
        @SerializedName("15m")
        var m: Double? = null,
        @SerializedName("sell")
        var sell: Double? = null,
        @SerializedName("symbol")
        var symbol: String? = null
    )

    @Keep
    data class RUB(
        @SerializedName("buy")
        var buy: Double? = null,
        @SerializedName("last")
        var last: Double? = null,
        @SerializedName("15m")
        var m: Double? = null,
        @SerializedName("sell")
        var sell: Double? = null,
        @SerializedName("symbol")
        var symbol: String? = null
    )

    @Keep
    data class SEK(
        @SerializedName("buy")
        var buy: Double? = null,
        @SerializedName("last")
        var last: Double? = null,
        @SerializedName("15m")
        var m: Double? = null,
        @SerializedName("sell")
        var sell: Double? = null,
        @SerializedName("symbol")
        var symbol: String? = null
    )

    @Keep
    data class SGD(
        @SerializedName("buy")
        var buy: Double? = null,
        @SerializedName("last")
        var last: Double? = null,
        @SerializedName("15m")
        var m: Double? = null,
        @SerializedName("sell")
        var sell: Double? = null,
        @SerializedName("symbol")
        var symbol: String? = null
    )

    @Keep
    data class THB(
        @SerializedName("buy")
        var buy: Double? = null,
        @SerializedName("last")
        var last: Double? = null,
        @SerializedName("15m")
        var m: Double? = null,
        @SerializedName("sell")
        var sell: Double? = null,
        @SerializedName("symbol")
        var symbol: String? = null
    )

    @Keep
    data class TRY(
        @SerializedName("buy")
        var buy: Double? = null,
        @SerializedName("last")
        var last: Double? = null,
        @SerializedName("15m")
        var m: Double? = null,
        @SerializedName("sell")
        var sell: Double? = null,
        @SerializedName("symbol")
        var symbol: String? = null
    )

    @Keep
    data class TWD(
        @SerializedName("buy")
        var buy: Double? = null,
        @SerializedName("last")
        var last: Double? = null,
        @SerializedName("15m")
        var m: Double? = null,
        @SerializedName("sell")
        var sell: Double? = null,
        @SerializedName("symbol")
        var symbol: String? = null
    )

    @Keep
    data class USD(
        @SerializedName("buy")
        var buy: Double? = null,
        @SerializedName("last")
        var last: Double? = null,
        @SerializedName("15m")
        var m: Double? = null,
        @SerializedName("sell")
        var sell: Double? = null,
        @SerializedName("symbol")
        var symbol: String? = null
    )
}