package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This augments {@link com.sun.star.util.SearchOptions} to be able to specify additional search algorithms for use with {@link
  * com.sun.star.util.XTextSearch2}
  * @since LibreOffice 5.2
  */
trait SearchOptions2 extends SearchOptions {
  /**
    * Search type, one of {@link com.sun.star.util.SearchAlgorithms2} constants. This is preferred over the content of the SearchAlgorithms {@link
    * SearchOptions.algorithmType} enum field.
    */
  var AlgorithmType2: scala.Double
  /**
    * The escape character to be used with a {@link com.sun.star.util.SearchAlgorithms2.WILDCARD} search.
    *
    * A Unicode character, if not 0 escapes the special meaning of a question mark, asterisk or escape character that follows immediately after the escape
    * character. If 0 defines no escape character is used.
    *
    * Common values are '\' (U+005C REVERSE SOLIDUS) aka backslash in text processing context, or '~' (U+007E TILDE) in spreadsheet processing context.
    */
  var WildcardEscapeCharacter: scala.Double
}

object SearchOptions2 {
  @scala.inline
  def apply(
    AlgorithmType2: scala.Double,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    WildcardEscapeCharacter: scala.Double,
    algorithmType: SearchAlgorithms,
    changedChars: scala.Double,
    deletedChars: scala.Double,
    insertedChars: scala.Double,
    replaceString: java.lang.String,
    searchFlag: scala.Double,
    searchString: java.lang.String,
    transliterateFlags: scala.Double
  ): SearchOptions2 = {
    val __obj = js.Dynamic.literal(AlgorithmType2 = AlgorithmType2, Locale = Locale, WildcardEscapeCharacter = WildcardEscapeCharacter, algorithmType = algorithmType, changedChars = changedChars, deletedChars = deletedChars, insertedChars = insertedChars, replaceString = replaceString, searchFlag = searchFlag, searchString = searchString, transliterateFlags = transliterateFlags)
  
    __obj.asInstanceOf[SearchOptions2]
  }
}

