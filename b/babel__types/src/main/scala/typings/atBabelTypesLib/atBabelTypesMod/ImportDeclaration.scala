package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ImportDeclaration
  extends Declaration
     with BaseNode
     with ModuleDeclaration
     with Statement {
  var importKind: atBabelTypesLib.atBabelTypesLibStrings.`type` | atBabelTypesLib.atBabelTypesLibStrings.typeof | atBabelTypesLib.atBabelTypesLibStrings.value | scala.Null
  var source: StringLiteral
  var specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier]
  @JSName("type")
  var type_ImportDeclaration: atBabelTypesLib.atBabelTypesLibStrings.ImportDeclaration
}

