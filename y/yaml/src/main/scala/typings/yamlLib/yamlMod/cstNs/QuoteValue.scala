package typings
package yamlLib.yamlMod.cstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuoteValue
  extends Scalar
     with Node {
  val strValue: scala.Null | java.lang.String | yamlLib.Anon_Errors
  @JSName("type")
  var type_QuoteValue: yamlLib.yamlLibStrings.QUOTE_DOUBLE | yamlLib.yamlLibStrings.QUOTE_SINGLE
}

