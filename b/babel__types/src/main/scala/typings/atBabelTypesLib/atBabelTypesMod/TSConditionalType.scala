package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TSConditionalType
  extends TSType
     with BaseNode {
  var checkType: TSType
  var extendsType: TSType
  var falseType: TSType
  var trueType: TSType
  @JSName("type")
  var type_TSConditionalType: atBabelTypesLib.atBabelTypesLibStrings.TSConditionalType
}

