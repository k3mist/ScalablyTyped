package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ReturnStatement
  extends CompletionStatement
     with BaseNode
     with Statement
     with Terminatorless {
  var argument: Expression | scala.Null
  @JSName("type")
  var type_ReturnStatement: atBabelTypesLib.atBabelTypesLibStrings.ReturnStatement
}

