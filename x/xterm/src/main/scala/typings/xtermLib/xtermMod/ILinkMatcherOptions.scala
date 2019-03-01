package typings
package xtermLib.xtermMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILinkMatcherOptions extends js.Object {
  /**
    * A callback that fires when the mouse leaves a link. Note that this can
    * happen even when tooltipCallback hasn't fired for the link yet.
    */
  var leaveCallback: js.UndefOr[
    js.Function2[
      /* event */ xtermLib.MouseEvent, 
      /* uri */ java.lang.String, 
      scala.Boolean | scala.Unit
    ]
  ] = js.undefined
  /**
    * The index of the link from the regex.match(text) call. This defaults to 0
    * (for regular expressions without capture groups).
    */
  var matchIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * The priority of the link matcher, this defines the order in which the link
    * matcher is evaluated relative to others, from highest to lowest. The
    * default value is 0.
    */
  var priority: js.UndefOr[scala.Double] = js.undefined
  /**
    * A callback that fires when the mouse hovers over a link for a moment.
    */
  var tooltipCallback: js.UndefOr[
    js.Function2[
      /* event */ xtermLib.MouseEvent, 
      /* uri */ java.lang.String, 
      scala.Boolean | scala.Unit
    ]
  ] = js.undefined
  /**
    * A callback that validates whether to create an individual link, pass
    * whether the link is valid to the callback.
    */
  var validationCallback: js.UndefOr[
    js.Function2[
      /* uri */ java.lang.String, 
      /* callback */ js.Function1[/* isValid */ scala.Boolean, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * A callback that fires when the mousedown and click events occur that
    * determines whether a link will be activated upon click. This enables
    * only activating a link when a certain modifier is held down, if not the
    * mouse event will continue propagation (eg. double click to select word).
    */
  var willLinkActivate: js.UndefOr[
    js.Function2[/* event */ xtermLib.MouseEvent, /* uri */ java.lang.String, scala.Boolean]
  ] = js.undefined
}

object ILinkMatcherOptions {
  @scala.inline
  def apply(
    leaveCallback: js.Function2[
      /* event */ xtermLib.MouseEvent, 
      /* uri */ java.lang.String, 
      scala.Boolean | scala.Unit
    ] = null,
    matchIndex: scala.Int | scala.Double = null,
    priority: scala.Int | scala.Double = null,
    tooltipCallback: js.Function2[
      /* event */ xtermLib.MouseEvent, 
      /* uri */ java.lang.String, 
      scala.Boolean | scala.Unit
    ] = null,
    validationCallback: js.Function2[
      /* uri */ java.lang.String, 
      /* callback */ js.Function1[/* isValid */ scala.Boolean, scala.Unit], 
      scala.Unit
    ] = null,
    willLinkActivate: js.Function2[/* event */ xtermLib.MouseEvent, /* uri */ java.lang.String, scala.Boolean] = null
  ): ILinkMatcherOptions = {
    val __obj = js.Dynamic.literal()
    if (leaveCallback != null) __obj.updateDynamic("leaveCallback")(leaveCallback)
    if (matchIndex != null) __obj.updateDynamic("matchIndex")(matchIndex.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (tooltipCallback != null) __obj.updateDynamic("tooltipCallback")(tooltipCallback)
    if (validationCallback != null) __obj.updateDynamic("validationCallback")(validationCallback)
    if (willLinkActivate != null) __obj.updateDynamic("willLinkActivate")(willLinkActivate)
    __obj.asInstanceOf[ILinkMatcherOptions]
  }
}

