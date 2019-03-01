package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  /**
    * `true` if the connection is enabled, `false` otherwise.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The rule's identifier.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the rule.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The rule's order in relation to other rules. A rule with a lower order than another rule executes first.
    */
  var order: js.UndefOr[scala.Double] = js.undefined
  /**
    * The code to be executed when the rule runs.
    */
  var script: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The rule's execution stage.
    */
  var stage: js.UndefOr[java.lang.String] = js.undefined
}

object Rule {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    name: java.lang.String = null,
    order: scala.Int | scala.Double = null,
    script: java.lang.String = null,
    stage: java.lang.String = null
  ): Rule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script)
    if (stage != null) __obj.updateDynamic("stage")(stage)
    __obj.asInstanceOf[Rule]
  }
}

