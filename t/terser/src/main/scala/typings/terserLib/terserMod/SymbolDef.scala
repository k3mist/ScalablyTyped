package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolDef extends js.Object {
  var eliminated: scala.Double
  var export: scala.Boolean
  var global: scala.Boolean
  var id: scala.Double
  var init: AST_SymbolRef
  var mangled_name: scala.Null | java.lang.String
  var name: java.lang.String
  var orig: js.Array[AST_SymbolRef]
  var references: js.Array[AST_SymbolRef]
  var replaced: scala.Double
  var scope: AST_Scope
  var undeclared: scala.Boolean
}

object SymbolDef {
  @scala.inline
  def apply(
    eliminated: scala.Double,
    export: scala.Boolean,
    global: scala.Boolean,
    id: scala.Double,
    init: AST_SymbolRef,
    name: java.lang.String,
    orig: js.Array[AST_SymbolRef],
    references: js.Array[AST_SymbolRef],
    replaced: scala.Double,
    scope: AST_Scope,
    undeclared: scala.Boolean,
    mangled_name: java.lang.String = null
  ): SymbolDef = {
    val __obj = js.Dynamic.literal(eliminated = eliminated, export = export, global = global, id = id, init = init, name = name, orig = orig, references = references, replaced = replaced, scope = scope, undeclared = undeclared)
    if (mangled_name != null) __obj.updateDynamic("mangled_name")(mangled_name)
    __obj.asInstanceOf[SymbolDef]
  }
}

