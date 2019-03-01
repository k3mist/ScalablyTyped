package typings
package firefoxDashWebextDashBrowserLib.browserNs.contentScriptsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object that represents a content script registered programmatically */
trait RegisteredContentScript extends js.Object {
  /** Unregister a content script registered programmatically */
  def unregister(): js.Promise[_]
}

object RegisteredContentScript {
  @scala.inline
  def apply(unregister: js.Function0[js.Promise[_]]): RegisteredContentScript = {
    val __obj = js.Dynamic.literal(unregister = unregister)
  
    __obj.asInstanceOf[RegisteredContentScript]
  }
}

