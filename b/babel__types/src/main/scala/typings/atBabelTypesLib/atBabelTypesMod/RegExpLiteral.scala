package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait RegExpLiteral
  extends Expression
     with BaseNode
     with Literal {
  var flags: java.lang.String
  var pattern: java.lang.String
  @JSName("type")
  var type_RegExpLiteral: atBabelTypesLib.atBabelTypesLibStrings.RegExpLiteral
}

