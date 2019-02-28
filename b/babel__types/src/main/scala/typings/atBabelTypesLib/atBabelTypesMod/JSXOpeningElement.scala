package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait JSXOpeningElement
  extends Immutable
     with BaseNode
     with JSX {
  var attributes: js.Array[JSXAttribute | JSXSpreadAttribute]
  var name: JSXIdentifier | JSXMemberExpression
  var selfClosing: scala.Boolean
  var typeParameters: TypeParameterInstantiation | TSTypeParameterInstantiation | scala.Null
  @JSName("type")
  var type_JSXOpeningElement: atBabelTypesLib.atBabelTypesLibStrings.JSXOpeningElement
}

