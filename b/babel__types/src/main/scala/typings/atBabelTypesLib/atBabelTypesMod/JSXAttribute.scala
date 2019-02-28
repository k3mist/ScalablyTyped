package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait JSXAttribute
  extends Immutable
     with BaseNode
     with JSX {
  var name: JSXIdentifier | JSXNamespacedName
  @JSName("type")
  var type_JSXAttribute: atBabelTypesLib.atBabelTypesLibStrings.JSXAttribute
  var value: JSXElement | JSXFragment | StringLiteral | JSXExpressionContainer | scala.Null
}

