package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ContinueStatement
  extends CompletionStatement
     with BaseNode
     with Statement
     with Terminatorless {
  var label: Identifier | scala.Null
  @JSName("type")
  var type_ContinueStatement: atBabelTypesLib.atBabelTypesLibStrings.ContinueStatement
}

