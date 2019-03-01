package typings
package winrtLib.WindowsNs.ApplicationModelNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPaneQueryChangedEventArgs extends js.Object {
  var language: java.lang.String
  var linguisticDetails: SearchPaneQueryLinguisticDetails
  var queryText: java.lang.String
}

object ISearchPaneQueryChangedEventArgs {
  @scala.inline
  def apply(
    language: java.lang.String,
    linguisticDetails: SearchPaneQueryLinguisticDetails,
    queryText: java.lang.String
  ): ISearchPaneQueryChangedEventArgs = {
    val __obj = js.Dynamic.literal(language = language, linguisticDetails = linguisticDetails, queryText = queryText)
  
    __obj.asInstanceOf[ISearchPaneQueryChangedEventArgs]
  }
}

