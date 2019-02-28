package typings
package yamlLib.yamlMod.astNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alias
  extends Node
     with AstNode {
  @JSName("cstNode")
  var cstNode_Alias: js.UndefOr[yamlLib.yamlMod.cstNs.Alias] = js.undefined
  var source: AstNode
  var `type`: yamlLib.yamlLibStrings.ALIAS
}

