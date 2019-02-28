package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait JSXFragment
  extends Expression
     with BaseNode
     with Immutable
     with JSX {
  var children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment]
  var closingFragment: JSXClosingFragment
  var openingFragment: JSXOpeningFragment
  @JSName("type")
  var type_JSXFragment: atBabelTypesLib.atBabelTypesLibStrings.JSXFragment
}

