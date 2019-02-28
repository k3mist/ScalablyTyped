package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TSParameterProperty
  extends LVal
     with BaseNode {
  var accessibility: atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` | scala.Null
  var parameter: Identifier | AssignmentPattern
  var readonly: scala.Boolean | scala.Null
  @JSName("type")
  var type_TSParameterProperty: atBabelTypesLib.atBabelTypesLibStrings.TSParameterProperty
}

