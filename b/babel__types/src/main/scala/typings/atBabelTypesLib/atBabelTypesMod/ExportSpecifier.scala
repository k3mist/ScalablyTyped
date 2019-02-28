package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ExportSpecifier
  extends ModuleSpecifier
     with BaseNode {
  var exported: Identifier
  var local: Identifier
  @JSName("type")
  var type_ExportSpecifier: atBabelTypesLib.atBabelTypesLibStrings.ExportSpecifier
}

