package typings
package yargsLib.yargsMod.yargsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionalOptions extends js.Object {
  var alias: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var choices: js.UndefOr[Choices] = js.undefined
  var coerce: js.UndefOr[js.Function1[/* arg */ js.Any, _]] = js.undefined
  var conflicts: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | (org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]])
  ] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var desc: js.UndefOr[java.lang.String] = js.undefined
  var describe: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var implies: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | (org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]])
  ] = js.undefined
  var normalize: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[PositionalOptionsType] = js.undefined
}

object PositionalOptions {
  @scala.inline
  def apply(
    alias: java.lang.String | js.Array[java.lang.String] = null,
    choices: Choices = null,
    coerce: js.Function1[/* arg */ js.Any, _] = null,
    conflicts: java.lang.String | js.Array[java.lang.String] | (org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]) = null,
    default: js.Any = null,
    desc: java.lang.String = null,
    describe: java.lang.String = null,
    description: java.lang.String = null,
    implies: java.lang.String | js.Array[java.lang.String] | (org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]) = null,
    normalize: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: PositionalOptionsType = null
  ): PositionalOptions = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (choices != null) __obj.updateDynamic("choices")(choices)
    if (coerce != null) __obj.updateDynamic("coerce")(coerce)
    if (conflicts != null) __obj.updateDynamic("conflicts")(conflicts.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default)
    if (desc != null) __obj.updateDynamic("desc")(desc)
    if (describe != null) __obj.updateDynamic("describe")(describe)
    if (description != null) __obj.updateDynamic("description")(description)
    if (implies != null) __obj.updateDynamic("implies")(implies.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PositionalOptions]
  }
}

