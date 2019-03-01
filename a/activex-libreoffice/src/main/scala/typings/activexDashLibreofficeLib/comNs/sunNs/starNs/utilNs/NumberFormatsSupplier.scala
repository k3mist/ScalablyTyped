package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides an supplier of number formats
  * @see NumberFormats
  * @see NumberFormatter
  * @since OOo 1.1.2
  */
trait NumberFormatsSupplier extends XNumberFormatsSupplier {
  /** Create using default locale. */
  def createWithDefaultLocale(): scala.Unit
  /**
    * Create using specific locale.
    * @param Locale the locale of the number formats supplier
    */
  def createWithLocale(Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Unit
}

object NumberFormatsSupplier {
  @scala.inline
  def apply(
    NumberFormatSettings: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    NumberFormats: XNumberFormats,
    acquire: js.Function0[scala.Unit],
    createWithDefaultLocale: js.Function0[scala.Unit],
    createWithLocale: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Unit],
    getNumberFormatSettings: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getNumberFormats: js.Function0[XNumberFormats],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): NumberFormatsSupplier = {
    val __obj = js.Dynamic.literal(NumberFormatSettings = NumberFormatSettings, NumberFormats = NumberFormats, acquire = acquire, createWithDefaultLocale = createWithDefaultLocale, createWithLocale = createWithLocale, getNumberFormatSettings = getNumberFormatSettings, getNumberFormats = getNumberFormats, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[NumberFormatsSupplier]
  }
}

