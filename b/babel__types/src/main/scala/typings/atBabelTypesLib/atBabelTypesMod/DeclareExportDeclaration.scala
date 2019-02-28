package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait DeclareExportDeclaration
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var declaration: Flow | scala.Null
  var default: scala.Boolean | scala.Null
  var source: StringLiteral | scala.Null
  var specifiers: (js.Array[ExportSpecifier | ExportNamespaceSpecifier]) | scala.Null
  @JSName("type")
  var type_DeclareExportDeclaration: atBabelTypesLib.atBabelTypesLibStrings.DeclareExportDeclaration
}

