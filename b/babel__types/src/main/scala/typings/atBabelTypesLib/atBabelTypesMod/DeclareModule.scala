package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait DeclareModule
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var body: BlockStatement
  var id: Identifier | StringLiteral
  var kind: atBabelTypesLib.atBabelTypesLibStrings.CommonJS | atBabelTypesLib.atBabelTypesLibStrings.ES | scala.Null
  @JSName("type")
  var type_DeclareModule: atBabelTypesLib.atBabelTypesLibStrings.DeclareModule
}

