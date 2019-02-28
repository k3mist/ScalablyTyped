package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructQuery
  extends Query
     with BaseQuery {
  var queryType: sparqljsLib.sparqljsLibStrings.CONSTRUCT
  var template: js.UndefOr[js.Array[Triple]] = js.undefined
}

