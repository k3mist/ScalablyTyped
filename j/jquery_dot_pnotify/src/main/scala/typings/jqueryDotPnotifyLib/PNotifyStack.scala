package typings
package jqueryDotPnotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNotifyStack extends js.Object {
  var context: js.UndefOr[jqueryLib.JQuery[stdLib.HTMLElement]] = js.undefined
  var dir1: js.UndefOr[java.lang.String] = js.undefined
  var dir2: js.UndefOr[java.lang.String] = js.undefined
  var firstpos1: js.UndefOr[scala.Double] = js.undefined
  var firstpos2: js.UndefOr[scala.Double] = js.undefined
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  var push: js.UndefOr[java.lang.String] = js.undefined
  var spacing1: js.UndefOr[scala.Double] = js.undefined
  var spacing2: js.UndefOr[scala.Double] = js.undefined
}

object PNotifyStack {
  @scala.inline
  def apply(
    context: jqueryLib.JQuery[stdLib.HTMLElement] = null,
    dir1: java.lang.String = null,
    dir2: java.lang.String = null,
    firstpos1: scala.Int | scala.Double = null,
    firstpos2: scala.Int | scala.Double = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    push: java.lang.String = null,
    spacing1: scala.Int | scala.Double = null,
    spacing2: scala.Int | scala.Double = null
  ): PNotifyStack = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (dir1 != null) __obj.updateDynamic("dir1")(dir1)
    if (dir2 != null) __obj.updateDynamic("dir2")(dir2)
    if (firstpos1 != null) __obj.updateDynamic("firstpos1")(firstpos1.asInstanceOf[js.Any])
    if (firstpos2 != null) __obj.updateDynamic("firstpos2")(firstpos2.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (push != null) __obj.updateDynamic("push")(push)
    if (spacing1 != null) __obj.updateDynamic("spacing1")(spacing1.asInstanceOf[js.Any])
    if (spacing2 != null) __obj.updateDynamic("spacing2")(spacing2.asInstanceOf[js.Any])
    __obj.asInstanceOf[PNotifyStack]
  }
}

