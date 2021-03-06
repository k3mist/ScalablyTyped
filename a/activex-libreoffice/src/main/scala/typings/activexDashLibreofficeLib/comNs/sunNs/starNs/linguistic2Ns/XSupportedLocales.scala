package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Offers information about which languages are supported by the object.
  *
  * This interface has to be implemented by {@link com.sun.star.linguistic2.SpellChecker} , {@link com.sun.star.linguistic2.Hyphenator} and {@link
  * com.sun.star.linguistic2.Thesaurus} implementations in order to be queried for the languages they can use.
  * @see com.sun.star.lang.Locale
  * @see com.sun.star.uno.XInterface
  */
trait XSupportedLocales
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the sequence of all supported languages. */
  val Locales: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
  /** @returns the sequence of all supported languages. */
  def getLocales(): stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
  /**
    * @param aLocale specifies the language being checked for support by the object.
    * @returns `TRUE` if the language is supported, otherwise `FALSE` .
    */
  def hasLocale(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Boolean
}

object XSupportedLocales {
  @scala.inline
  def apply(
    Locales: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    acquire: () => scala.Unit,
    getLocales: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    hasLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XSupportedLocales = {
    val __obj = js.Dynamic.literal(Locales = Locales, acquire = js.Any.fromFunction0(acquire), getLocales = js.Any.fromFunction0(getLocales), hasLocale = js.Any.fromFunction1(hasLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSupportedLocales]
  }
}

