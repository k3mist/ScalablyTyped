package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSHooks
  extends // Set to HTMLElement to minimize breaks but should probably be Element.
/* propertyName */ org.scalablytyped.runtime.StringDictionary[CSSHook[stdLib.HTMLElement]]

object CSSHooks {
  @scala.inline
  def apply(
    StringDictionary: // Set to HTMLElement to minimize breaks but should probably be Element.
  /* propertyName */ org.scalablytyped.runtime.StringDictionary[CSSHook[stdLib.HTMLElement]] = null
  ): CSSHooks = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CSSHooks]
  }
}

