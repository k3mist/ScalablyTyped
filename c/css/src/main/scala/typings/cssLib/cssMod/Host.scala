package typings
package cssLib.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Host
  extends Node
     with AtRule {
  /** Array of nodes with the types rule, comment and any of the at-rule types. */
  var rules: js.UndefOr[js.Array[Rule | Comment | AtRule]] = js.undefined
}

object Host {
  @scala.inline
  def apply(
    parent: Node = null,
    position: cssLib.Anon_Content = null,
    rules: js.Array[Rule | Comment | AtRule] = null,
    `type`: java.lang.String = null
  ): Host = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (position != null) __obj.updateDynamic("position")(position)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Host]
  }
}

