package typings
package jqueryDotContextmenuLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hide extends js.Object {
  var hide: js.UndefOr[js.Function1[/* options */ js.Any, scala.Boolean]] = js.undefined
  var show: js.UndefOr[js.Function1[/* options */ js.Any, scala.Boolean]] = js.undefined
}

object Anon_Hide {
  @scala.inline
  def apply(
    hide: js.Function1[/* options */ js.Any, scala.Boolean] = null,
    show: js.Function1[/* options */ js.Any, scala.Boolean] = null
  ): Anon_Hide = {
    val __obj = js.Dynamic.literal()
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (show != null) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_Hide]
  }
}

