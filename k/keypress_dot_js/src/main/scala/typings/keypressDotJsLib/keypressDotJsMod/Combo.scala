package typings
package keypressDotJsLib.keypressDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Combo extends js.Object {
  var is_counting: js.UndefOr[scala.Boolean] = js.undefined
  var is_exclusive: js.UndefOr[scala.Boolean] = js.undefined
  var is_sequence: js.UndefOr[scala.Boolean] = js.undefined
  var is_solitary: js.UndefOr[scala.Boolean] = js.undefined
  var is_unordered: js.UndefOr[scala.Boolean] = js.undefined
  var keys: js.UndefOr[java.lang.String] = js.undefined
  var on_keydown: js.UndefOr[
    js.Function2[
      /* event */ js.UndefOr[stdLib.KeyboardEvent], 
      /* count */ js.UndefOr[scala.Double], 
      _
    ]
  ] = js.undefined
  var on_keyup: js.UndefOr[js.Function1[/* event */ js.UndefOr[stdLib.KeyboardEvent], _]] = js.undefined
  var on_release: js.UndefOr[js.Function1[/* event */ js.UndefOr[stdLib.KeyboardEvent], _]] = js.undefined
  var prevent_default: js.UndefOr[scala.Boolean] = js.undefined
  var prevent_repeat: js.UndefOr[scala.Boolean] = js.undefined
  var `this`: js.UndefOr[stdLib.Element] = js.undefined
}

object Combo {
  @scala.inline
  def apply(
    is_counting: js.UndefOr[scala.Boolean] = js.undefined,
    is_exclusive: js.UndefOr[scala.Boolean] = js.undefined,
    is_sequence: js.UndefOr[scala.Boolean] = js.undefined,
    is_solitary: js.UndefOr[scala.Boolean] = js.undefined,
    is_unordered: js.UndefOr[scala.Boolean] = js.undefined,
    keys: java.lang.String = null,
    on_keydown: js.Function2[
      /* event */ js.UndefOr[stdLib.KeyboardEvent], 
      /* count */ js.UndefOr[scala.Double], 
      _
    ] = null,
    on_keyup: js.Function1[/* event */ js.UndefOr[stdLib.KeyboardEvent], _] = null,
    on_release: js.Function1[/* event */ js.UndefOr[stdLib.KeyboardEvent], _] = null,
    prevent_default: js.UndefOr[scala.Boolean] = js.undefined,
    prevent_repeat: js.UndefOr[scala.Boolean] = js.undefined,
    `this`: stdLib.Element = null
  ): Combo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(is_counting)) __obj.updateDynamic("is_counting")(is_counting)
    if (!js.isUndefined(is_exclusive)) __obj.updateDynamic("is_exclusive")(is_exclusive)
    if (!js.isUndefined(is_sequence)) __obj.updateDynamic("is_sequence")(is_sequence)
    if (!js.isUndefined(is_solitary)) __obj.updateDynamic("is_solitary")(is_solitary)
    if (!js.isUndefined(is_unordered)) __obj.updateDynamic("is_unordered")(is_unordered)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (on_keydown != null) __obj.updateDynamic("on_keydown")(on_keydown)
    if (on_keyup != null) __obj.updateDynamic("on_keyup")(on_keyup)
    if (on_release != null) __obj.updateDynamic("on_release")(on_release)
    if (!js.isUndefined(prevent_default)) __obj.updateDynamic("prevent_default")(prevent_default)
    if (!js.isUndefined(prevent_repeat)) __obj.updateDynamic("prevent_repeat")(prevent_repeat)
    if (`this` != null) __obj.updateDynamic("this")(`this`)
    __obj.asInstanceOf[Combo]
  }
}

