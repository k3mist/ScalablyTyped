package typings
package wicgDashMediasessionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var MediaSession: js.UndefOr[MediaSession] = js.undefined
}

object Window {
  @scala.inline
  def apply(MediaSession: MediaSession = null): Window = {
    val __obj = js.Dynamic.literal()
    if (MediaSession != null) __obj.updateDynamic("MediaSession")(MediaSession)
    __obj.asInstanceOf[Window]
  }
}

