package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- estreeLib.estreeMod._Node because Already inherited */ trait Identifier
  extends BaseNode
     with Pattern {
  var name: java.lang.String
  @JSName("type")
  var type_Identifier: estreeLib.estreeLibStrings.Identifier
}

