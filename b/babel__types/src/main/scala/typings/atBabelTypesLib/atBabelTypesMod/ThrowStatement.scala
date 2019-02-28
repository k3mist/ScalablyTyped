package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ThrowStatement
  extends CompletionStatement
     with BaseNode
     with Statement
     with Terminatorless {
  var argument: Expression
  @JSName("type")
  var type_ThrowStatement: atBabelTypesLib.atBabelTypesLibStrings.ThrowStatement
}

