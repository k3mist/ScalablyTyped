package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TSLiteralType
  extends TSType
     with BaseNode {
  var literal: NumericLiteral | StringLiteral | BooleanLiteral
  @JSName("type")
  var type_TSLiteralType: atBabelTypesLib.atBabelTypesLibStrings.TSLiteralType
}

