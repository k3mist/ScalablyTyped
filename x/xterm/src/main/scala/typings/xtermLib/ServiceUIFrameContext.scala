package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceUIFrameContext extends js.Object {
  def getCachedFrameMessage(key: java.lang.String): java.lang.String
  def postFrameMessage(key: java.lang.String, data: java.lang.String): scala.Unit
}

object ServiceUIFrameContext {
  @scala.inline
  def apply(
    getCachedFrameMessage: js.Function1[java.lang.String, java.lang.String],
    postFrameMessage: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): ServiceUIFrameContext = {
    val __obj = js.Dynamic.literal(getCachedFrameMessage = getCachedFrameMessage, postFrameMessage = postFrameMessage)
  
    __obj.asInstanceOf[ServiceUIFrameContext]
  }
}

