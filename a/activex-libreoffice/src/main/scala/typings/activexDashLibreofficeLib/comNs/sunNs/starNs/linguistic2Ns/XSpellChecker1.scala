package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XSpellChecker1 extends XSupportedLanguages {
  def isValid(
    aWord: java.lang.String,
    nLanguage: scala.Double,
    aProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  ): scala.Boolean
  def spell(
    aWord: java.lang.String,
    nLanguage: scala.Double,
    aProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  ): XSpellAlternatives
}

object XSpellChecker1 {
  @scala.inline
  def apply(
    Languages: activexDashInteropLib.SafeArray[scala.Double],
    acquire: js.Function0[scala.Unit],
    getLanguages: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    hasLanguage: js.Function1[scala.Double, scala.Boolean],
    isValid: js.Function3[
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, 
      scala.Boolean
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    spell: js.Function3[
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, 
      XSpellAlternatives
    ]
  ): XSpellChecker1 = {
    val __obj = js.Dynamic.literal(Languages = Languages, acquire = acquire, getLanguages = getLanguages, hasLanguage = hasLanguage, isValid = isValid, queryInterface = queryInterface, release = release, spell = spell)
  
    __obj.asInstanceOf[XSpellChecker1]
  }
}

