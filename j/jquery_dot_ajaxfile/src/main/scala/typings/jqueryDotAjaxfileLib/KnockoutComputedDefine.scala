package typings
package jqueryDotAjaxfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutComputedDefine[T] extends js.Object {
  var deferEvaluation: js.UndefOr[scala.Boolean] = js.undefined
  var disposeWhen: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var disposeWhenNodeIsRemoved: js.UndefOr[stdLib.Node] = js.undefined
  var owner: js.UndefOr[js.Any] = js.undefined
  var pure: js.UndefOr[scala.Boolean] = js.undefined
  var write: js.UndefOr[js.Function1[/* value */ T, scala.Unit]] = js.undefined
  def read(): T
}

object KnockoutComputedDefine {
  @scala.inline
  def apply[T](
    read: js.Function0[T],
    deferEvaluation: js.UndefOr[scala.Boolean] = js.undefined,
    disposeWhen: js.Function0[scala.Boolean] = null,
    disposeWhenNodeIsRemoved: stdLib.Node = null,
    owner: js.Any = null,
    pure: js.UndefOr[scala.Boolean] = js.undefined,
    write: js.Function1[/* value */ T, scala.Unit] = null
  ): KnockoutComputedDefine[T] = {
    val __obj = js.Dynamic.literal(read = read)
    if (!js.isUndefined(deferEvaluation)) __obj.updateDynamic("deferEvaluation")(deferEvaluation)
    if (disposeWhen != null) __obj.updateDynamic("disposeWhen")(disposeWhen)
    if (disposeWhenNodeIsRemoved != null) __obj.updateDynamic("disposeWhenNodeIsRemoved")(disposeWhenNodeIsRemoved)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure)
    if (write != null) __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[KnockoutComputedDefine[T]]
  }
}

