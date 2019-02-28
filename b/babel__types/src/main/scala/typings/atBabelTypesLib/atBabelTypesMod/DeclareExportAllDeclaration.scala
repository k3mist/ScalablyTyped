package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait DeclareExportAllDeclaration
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var exportKind: (js.Tuple2[
    atBabelTypesLib.atBabelTypesLibStrings.`type`, 
    atBabelTypesLib.atBabelTypesLibStrings.value
  ]) | scala.Null
  var source: StringLiteral
  @JSName("type")
  var type_DeclareExportAllDeclaration: atBabelTypesLib.atBabelTypesLibStrings.DeclareExportAllDeclaration
}

