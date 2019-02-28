package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ForStatement
  extends BlockParent
     with BaseNode
     with For
     with Loop
     with Scopable
     with Statement {
  var body: Statement
  var init: VariableDeclaration | Expression | scala.Null
  var test: Expression | scala.Null
  @JSName("type")
  var type_ForStatement: atBabelTypesLib.atBabelTypesLibStrings.ForStatement
  var update: Expression | scala.Null
}

