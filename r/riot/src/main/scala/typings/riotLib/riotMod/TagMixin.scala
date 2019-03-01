package typings
package riotLib.riotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagMixin extends js.Object {
  /**
    * Special method which can initialize the mixin when it's loaded to the tag.
    * This method is not accessible from the tag its mixed in
    */
  var init: js.UndefOr[js.ThisFunction0[/* this */ TagInterface, scala.Unit]] = js.undefined
}

object TagMixin {
  @scala.inline
  def apply(init: js.ThisFunction0[/* this */ TagInterface, scala.Unit] = null): TagMixin = {
    val __obj = js.Dynamic.literal()
    if (init != null) __obj.updateDynamic("init")(init)
    __obj.asInstanceOf[TagMixin]
  }
}

