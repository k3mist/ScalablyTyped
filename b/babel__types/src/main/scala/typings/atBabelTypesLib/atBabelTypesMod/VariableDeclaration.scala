package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait VariableDeclaration
  extends Declaration
     with BaseNode
     with Statement {
  var declarations: js.Array[VariableDeclarator]
  var declare: scala.Boolean | scala.Null
  var kind: atBabelTypesLib.atBabelTypesLibStrings.`var` | atBabelTypesLib.atBabelTypesLibStrings.let | atBabelTypesLib.atBabelTypesLibStrings.const
  @JSName("type")
  var type_VariableDeclaration: atBabelTypesLib.atBabelTypesLibStrings.VariableDeclaration
}

