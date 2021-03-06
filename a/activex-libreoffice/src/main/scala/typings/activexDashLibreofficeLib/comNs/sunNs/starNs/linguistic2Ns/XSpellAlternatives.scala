package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gives access to the results of failed spell checking attempts and may provide spelling alternatives.
  *
  * This is used by the {@link com.sun.star.linguistic2.XSpellChecker.spell()} function when the word was not found to be correct. Suggestions for other
  * words to be used may be provided along with a failure-type that may specify why the word was not correct.
  * @see com.sun.star.linguistic2.SpellFailure
  */
trait XSpellAlternatives
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the sequence of suggested spelling alternatives. */
  val Alternatives: stdLib.SafeArray[java.lang.String]
  /** @returns the number of suggested spelling alternatives available. */
  val AlternativesCount: scala.Double
  /**
    * @returns the type (reason) for spell checking to have failed verification.
    * @see com.sun.star.linguistic2.SpellFailure
    */
  val FailureType: scala.Double
  /** @returns the Locale which specifies the language of the misspelled word. */
  val Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** @returns the word that was misspelled. */
  val Word: java.lang.String
  /** @returns the sequence of suggested spelling alternatives. */
  def getAlternatives(): stdLib.SafeArray[java.lang.String]
  /** @returns the number of suggested spelling alternatives available. */
  def getAlternativesCount(): scala.Double
  /**
    * @returns the type (reason) for spell checking to have failed verification.
    * @see com.sun.star.linguistic2.SpellFailure
    */
  def getFailureType(): scala.Double
  /** @returns the Locale which specifies the language of the misspelled word. */
  def getLocale(): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** @returns the word that was misspelled. */
  def getWord(): java.lang.String
}

object XSpellAlternatives {
  @scala.inline
  def apply(
    Alternatives: stdLib.SafeArray[java.lang.String],
    AlternativesCount: scala.Double,
    FailureType: scala.Double,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Word: java.lang.String,
    acquire: () => scala.Unit,
    getAlternatives: () => stdLib.SafeArray[java.lang.String],
    getAlternativesCount: () => scala.Double,
    getFailureType: () => scala.Double,
    getLocale: () => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    getWord: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XSpellAlternatives = {
    val __obj = js.Dynamic.literal(Alternatives = Alternatives, AlternativesCount = AlternativesCount, FailureType = FailureType, Locale = Locale, Word = Word, acquire = js.Any.fromFunction0(acquire), getAlternatives = js.Any.fromFunction0(getAlternatives), getAlternativesCount = js.Any.fromFunction0(getAlternativesCount), getFailureType = js.Any.fromFunction0(getFailureType), getLocale = js.Any.fromFunction0(getLocale), getWord = js.Any.fromFunction0(getWord), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSpellAlternatives]
  }
}

