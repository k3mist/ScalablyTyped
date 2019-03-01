package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleRaws extends ContainerRaws {
  /**
    * The rule's full selector. If there are multiple comma-separated selectors,
    * the entire group will be included.
    */
  var selector: js.UndefOr[java.lang.String] = js.undefined
}

object RuleRaws {
  @scala.inline
  def apply(
    after: java.lang.String = null,
    afterName: java.lang.String = null,
    before: java.lang.String = null,
    between: java.lang.String = null,
    important: java.lang.String = null,
    indent: java.lang.String = null,
    left: java.lang.String = null,
    right: java.lang.String = null,
    selector: java.lang.String = null,
    semicolon: js.UndefOr[scala.Boolean] = js.undefined
  ): RuleRaws = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (afterName != null) __obj.updateDynamic("afterName")(afterName)
    if (before != null) __obj.updateDynamic("before")(before)
    if (between != null) __obj.updateDynamic("between")(between)
    if (important != null) __obj.updateDynamic("important")(important)
    if (indent != null) __obj.updateDynamic("indent")(indent)
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (!js.isUndefined(semicolon)) __obj.updateDynamic("semicolon")(semicolon)
    __obj.asInstanceOf[RuleRaws]
  }
}

