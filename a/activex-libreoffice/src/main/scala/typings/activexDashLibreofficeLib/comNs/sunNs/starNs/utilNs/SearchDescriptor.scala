package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes what and how to search within a container. */
trait SearchDescriptor extends XSearchDescriptor {
  /** If `TRUE` , the search is done backwards in the document. */
  var SearchBackwards: scala.Boolean
  /** If `TRUE` , the case of the letters is important for the match. */
  var SearchCaseSensitive: scala.Boolean
  /**
    * If `TRUE` , the search string is evaluated as a regular expression.
    *
    * SearchRegularExpression, SearchWildcard and SearchSimilarity are mutually exclusive, only one can be `TRUE` at the same time.
    */
  var SearchRegularExpression: scala.Boolean
  /**
    * If `TRUE` , a "similarity search" is performed.
    *
    * In the case of a similarity search, the following properties specify the kind of similarity:
    *
    * SearchSimilarityRelaxSearchSimilarityRemoveSearchSimilarityAddSearchSimilarityExchange
    *
    * SearchRegularExpression, SearchWildcard and SearchSimilarity are mutually exclusive, only one can be `TRUE` at the same time.
    */
  var SearchSimilarity: scala.Boolean
  /** specifies the number of characters that must be added to match the search pattern. */
  var SearchSimilarityAdd: scala.Double
  /** This property specifies the number of characters that must be replaced to match the search pattern. */
  var SearchSimilarityExchange: scala.Double
  /**
    * If `TRUE` , all similarity rules are applied together.
    *
    * In the case of a relaxed similarity search, the following properties are applied together:
    *
    * SearchSimilarityRemoveSearchSimilarityAddSearchSimilarityExchange
    */
  var SearchSimilarityRelax: scala.Boolean
  /** This property specifies the number of characters that may be ignored to match the search pattern. */
  var SearchSimilarityRemove: scala.Double
  /** If `TRUE` , it is searched for positions where the paragraph style with the name of the search pattern is applied. */
  var SearchStyles: scala.Boolean
  /**
    * If `TRUE` , the search string is evaluated as a wildcard pattern.
    *
    * Wildcards are '*' (asterisk) for any sequence of characters, including an empty sequence, and '?' (question mark) for exactly one character. Escape
    * character is '\' (U+005C REVERSE SOLIDUS) aka backslash, it escapes the special meaning of a question mark, asterisk or escape character that follows
    * immediately after the escape character.
    *
    * SearchRegularExpression, SearchWildcard and SearchSimilarity are mutually exclusive, only one can be `TRUE` at the same time.
    * @since LibreOffice 5.2
    */
  var SearchWildcard: scala.Boolean
  /** If `TRUE` , only complete words will be found. */
  var SearchWords: scala.Boolean
}

object SearchDescriptor {
  @scala.inline
  def apply(
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    SearchBackwards: scala.Boolean,
    SearchCaseSensitive: scala.Boolean,
    SearchRegularExpression: scala.Boolean,
    SearchSimilarity: scala.Boolean,
    SearchSimilarityAdd: scala.Double,
    SearchSimilarityExchange: scala.Double,
    SearchSimilarityRelax: scala.Boolean,
    SearchSimilarityRemove: scala.Double,
    SearchString: java.lang.String,
    SearchStyles: scala.Boolean,
    SearchWildcard: scala.Boolean,
    SearchWords: scala.Boolean,
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getSearchString: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setSearchString: js.Function1[java.lang.String, scala.Unit]
  ): SearchDescriptor = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo, SearchBackwards = SearchBackwards, SearchCaseSensitive = SearchCaseSensitive, SearchRegularExpression = SearchRegularExpression, SearchSimilarity = SearchSimilarity, SearchSimilarityAdd = SearchSimilarityAdd, SearchSimilarityExchange = SearchSimilarityExchange, SearchSimilarityRelax = SearchSimilarityRelax, SearchSimilarityRemove = SearchSimilarityRemove, SearchString = SearchString, SearchStyles = SearchStyles, SearchWildcard = SearchWildcard, SearchWords = SearchWords, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getSearchString = getSearchString, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue, setSearchString = setSearchString)
  
    __obj.asInstanceOf[SearchDescriptor]
  }
}

