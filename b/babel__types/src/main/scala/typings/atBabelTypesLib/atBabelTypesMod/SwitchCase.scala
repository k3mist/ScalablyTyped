package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchCase
  extends BaseNode
     with _Node {
  var consequent: js.Array[Statement]
  var test: Expression | scala.Null
  @JSName("type")
  var type_SwitchCase: atBabelTypesLib.atBabelTypesLibStrings.SwitchCase
}

