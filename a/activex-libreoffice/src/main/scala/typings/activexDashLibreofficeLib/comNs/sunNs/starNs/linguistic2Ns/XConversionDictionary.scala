package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows the user to access a conversion dictionary.
  *
  * The dictionary consists of entries (pairs) of the form ( aLeftText, aRightText ). Those pairs can be added and removed. Also it can be looked for all
  * entries where the left text or the right text matches a given text. Thus it can be used for conversions in both directions.
  *
  * Restrictions to what has to be the left and right text are usually given by specific services implementing this interface.
  * @see com.sun.star.linguistic2.ConversionDictionary
  * @see com.sun.star.linguistic2.HangulHanjaConversionDictionary
  * @since OOo 1.1.2
  */
trait XConversionDictionary
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @returns the conversion type supported by the dictionary.
    * @see com.sun.star.linguistic2.ConversionDictionaryType
    */
  val ConversionType: scala.Double
  /**
    * @returns the language supported by the dictionary.
    * @see com.sun.star.lang.Locale
    */
  val Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** @returns the name of the dictionary. */
  val Name: java.lang.String
  /**
    * is used to add a conversion pair to the dictionary.
    * @param aLeftText the left text of the pair to be added.
    * @param aRightText the right text of the pair to be added.
    * @throws com::sun::star::lang::IllegalArgumentException if the arguments are invalid. For example if the specifications defined by the service implementin
    * @throws com::sun::star::container::ElementExistException if such an entry already exists.
    */
  def addEntry(aLeftText: java.lang.String, aRightText: java.lang.String): scala.Unit
  /** removes all entries from the dictionary. */
  def clear(): scala.Unit
  /**
    * @param eDirection specifies if all left or all right parts of the entries should be returned.
    * @returns a list of all left or right parts of the dictionaries entries.
    */
  def getConversionEntries(eDirection: ConversionDirection): stdLib.SafeArray[java.lang.String]
  /**
    * @returns the conversion type supported by the dictionary.
    * @see com.sun.star.linguistic2.ConversionDictionaryType
    */
  def getConversionType(): scala.Double
  /**
    * searches for entries or conversions that match the given text.
    *
    * The exact string to be looked for is the substring from the aText parameter that starts at position nStartPos and has the length nLength.
    * @param aText the text where the substring to be looked for will be taken from. Depending on the conversion direction parameter it specifies either the l
    * @param nStartPos the starting pos of the substring to be looked for.
    * @param nLength the length of the substring to be looked for.
    * @param eDirection specifies the direction of the conversion to look for. It is one of {@link com.sun.star.linguistic2.ConversionDirection} .
    * @param nTextConversionOptions Combination of {@link com.sun.star.i18n.TextConversionOption} values.
    * @returns the list of conversions found for the supplied text. If no nothing was found, it is empty.
    * @throws com::sun::star::lang::IllegalArgumentException if the locale is not supported by the dictionary or if nTextConversionOptions is invalid for the g
    */
  def getConversions(
    aText: java.lang.String,
    nStartPos: scala.Double,
    nLength: scala.Double,
    eDirection: ConversionDirection,
    nTextConversionOptions: scala.Double
  ): stdLib.SafeArray[java.lang.String]
  /**
    * @returns the language supported by the dictionary.
    * @see com.sun.star.lang.Locale
    */
  def getLocale(): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /**
    * returns the maximum number of characters used as left or right text in entries.
    * @param eDirection specifies if the left text or the right text of entries will be used.
    * @see com.sun.star.linguistic2.ConversionDirection
    */
  def getMaxCharCount(eDirection: ConversionDirection): scala.Double
  /** @returns the name of the dictionary. */
  def getName(): java.lang.String
  /** @returns `TRUE` if the dictionary is active, `FALSE` otherwise. */
  def isActive(): scala.Boolean
  /**
    * removes a conversion pair from the dictionary.
    * @param aLeftText the left text of the pair to be removed.
    * @param aRightText the right text of the pair to be removed.
    * @throws com::sun::star::container::NoSuchElementException if there is no such entry.
    */
  def removeEntry(aLeftText: java.lang.String, aRightText: java.lang.String): scala.Unit
  /**
    * specifies whether the dictionary should be used or not .
    * @param bActivate `TRUE` if the dictionary should be used, `FALSE` otherwise.
    */
  def setActive(bActivate: scala.Boolean): scala.Unit
}

object XConversionDictionary {
  @scala.inline
  def apply(
    ConversionType: scala.Double,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Name: java.lang.String,
    acquire: () => scala.Unit,
    addEntry: (java.lang.String, java.lang.String) => scala.Unit,
    clear: () => scala.Unit,
    getConversionEntries: ConversionDirection => stdLib.SafeArray[java.lang.String],
    getConversionType: () => scala.Double,
    getConversions: (java.lang.String, scala.Double, scala.Double, ConversionDirection, scala.Double) => stdLib.SafeArray[java.lang.String],
    getLocale: () => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    getMaxCharCount: ConversionDirection => scala.Double,
    getName: () => java.lang.String,
    isActive: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEntry: (java.lang.String, java.lang.String) => scala.Unit,
    setActive: scala.Boolean => scala.Unit
  ): XConversionDictionary = {
    val __obj = js.Dynamic.literal(ConversionType = ConversionType, Locale = Locale, Name = Name, acquire = js.Any.fromFunction0(acquire), addEntry = js.Any.fromFunction2(addEntry), clear = js.Any.fromFunction0(clear), getConversionEntries = js.Any.fromFunction1(getConversionEntries), getConversionType = js.Any.fromFunction0(getConversionType), getConversions = js.Any.fromFunction5(getConversions), getLocale = js.Any.fromFunction0(getLocale), getMaxCharCount = js.Any.fromFunction1(getMaxCharCount), getName = js.Any.fromFunction0(getName), isActive = js.Any.fromFunction0(isActive), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEntry = js.Any.fromFunction2(removeEntry), setActive = js.Any.fromFunction1(setActive))
  
    __obj.asInstanceOf[XConversionDictionary]
  }
}

