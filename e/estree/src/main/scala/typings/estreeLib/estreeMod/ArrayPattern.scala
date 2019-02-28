package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayPattern
  extends BaseNode
     with Pattern {
  var elements: js.Array[Pattern]
  @JSName("type")
  var type_ArrayPattern: estreeLib.estreeLibStrings.ArrayPattern
}

