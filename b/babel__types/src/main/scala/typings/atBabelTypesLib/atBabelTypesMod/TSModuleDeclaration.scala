package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TSModuleDeclaration
  extends Declaration
     with BaseNode
     with Statement {
  var body: TSModuleBlock | TSModuleDeclaration
  var declare: scala.Boolean | scala.Null
  var global: scala.Boolean | scala.Null
  var id: Identifier | StringLiteral
  @JSName("type")
  var type_TSModuleDeclaration: atBabelTypesLib.atBabelTypesLibStrings.TSModuleDeclaration
}

