package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ObjectTypeIndexer
  extends Flow
     with BaseNode
     with UserWhitespacable {
  var id: Identifier | scala.Null
  var key: FlowType
  var static: scala.Boolean | scala.Null
  @JSName("type")
  var type_ObjectTypeIndexer: atBabelTypesLib.atBabelTypesLibStrings.ObjectTypeIndexer
  var value: FlowType
  var variance: Variance | scala.Null
}

