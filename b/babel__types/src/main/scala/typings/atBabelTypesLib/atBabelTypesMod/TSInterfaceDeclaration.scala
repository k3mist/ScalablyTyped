package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TSInterfaceDeclaration
  extends Declaration
     with BaseNode
     with Statement {
  var body: TSInterfaceBody
  var declare: scala.Boolean | scala.Null
  var `extends`: js.Array[TSExpressionWithTypeArguments] | scala.Null
  var id: Identifier
  var typeParameters: TSTypeParameterDeclaration | scala.Null
  @JSName("type")
  var type_TSInterfaceDeclaration: atBabelTypesLib.atBabelTypesLibStrings.TSInterfaceDeclaration
}

