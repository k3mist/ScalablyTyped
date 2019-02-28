package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait LabeledStatement
  extends Statement
     with BaseNode {
  var body: Statement
  var label: Identifier
  @JSName("type")
  var type_LabeledStatement: atBabelTypesLib.atBabelTypesLibStrings.LabeledStatement
}

