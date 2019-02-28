package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassBody
  extends BaseNode
     with _Node {
  var body: js.Array[
    ClassMethod | ClassPrivateMethod | ClassProperty | ClassPrivateProperty | TSDeclareMethod | TSIndexSignature
  ]
  @JSName("type")
  var type_ClassBody: atBabelTypesLib.atBabelTypesLibStrings.ClassBody
}

