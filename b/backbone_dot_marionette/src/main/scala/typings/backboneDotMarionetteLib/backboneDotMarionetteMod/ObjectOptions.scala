package typings
package backboneDotMarionetteLib.backboneDotMarionetteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectOptions
  extends RadioMixinOptions
     with /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Initialize is called immediately after the Object has been instantiated,
    * and is invoked with the same arguments that the constructor received.
    */
  var initialize: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], scala.Unit]] = js.undefined
}

object ObjectOptions {
  @scala.inline
  def apply(
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    channelName: java.lang.String = null,
    initialize: js.Function1[/* options */ js.UndefOr[ObjectOptions], scala.Unit] = null,
    radioEvents: js.Any = null,
    radioRequests: js.Any = null
  ): ObjectOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (channelName != null) __obj.updateDynamic("channelName")(channelName)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (radioEvents != null) __obj.updateDynamic("radioEvents")(radioEvents)
    if (radioRequests != null) __obj.updateDynamic("radioRequests")(radioRequests)
    __obj.asInstanceOf[ObjectOptions]
  }
}

