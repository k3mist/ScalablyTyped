package typings
package atomLib.autocompleteDashPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextSuggestion
  extends SuggestionBase
     with AnySuggestion {
  /** The text which will be inserted into the editor, in place of the prefix. */
  var text: java.lang.String
}

