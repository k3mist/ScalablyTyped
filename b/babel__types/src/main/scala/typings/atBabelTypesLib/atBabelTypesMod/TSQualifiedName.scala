package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TSQualifiedName
  extends TSEntityName
     with BaseNode {
  var left: TSEntityName
  var right: Identifier
  @JSName("type")
  var type_TSQualifiedName: atBabelTypesLib.atBabelTypesLibStrings.TSQualifiedName
}

