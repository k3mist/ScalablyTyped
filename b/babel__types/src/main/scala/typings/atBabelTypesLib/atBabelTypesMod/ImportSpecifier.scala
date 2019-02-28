package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ImportSpecifier
  extends ModuleSpecifier
     with BaseNode {
  var importKind: atBabelTypesLib.atBabelTypesLibStrings.`type` | atBabelTypesLib.atBabelTypesLibStrings.typeof | scala.Null
  var imported: Identifier
  var local: Identifier
  @JSName("type")
  var type_ImportSpecifier: atBabelTypesLib.atBabelTypesLibStrings.ImportSpecifier
}

