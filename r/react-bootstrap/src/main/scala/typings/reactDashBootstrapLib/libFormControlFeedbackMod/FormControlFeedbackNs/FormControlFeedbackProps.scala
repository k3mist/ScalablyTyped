package typings
package reactDashBootstrapLib.libFormControlFeedbackMod.FormControlFeedbackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormControlFeedbackProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libFormControlFeedbackMod.FormControlFeedback] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
}

object FormControlFeedbackProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libFormControlFeedbackMod.FormControlFeedback] = null,
    bsClass: java.lang.String = null
  ): FormControlFeedbackProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    __obj.asInstanceOf[FormControlFeedbackProps]
  }
}

