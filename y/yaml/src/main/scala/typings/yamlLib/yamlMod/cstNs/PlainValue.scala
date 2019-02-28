package typings
package yamlLib.yamlMod.cstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlainValue
  extends Scalar
     with Node {
  val strValue: java.lang.String | scala.Null
  @JSName("type")
  var type_PlainValue: yamlLib.yamlLibStrings.PLAIN
}

