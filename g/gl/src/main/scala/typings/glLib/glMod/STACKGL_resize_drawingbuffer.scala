package typings
package glLib.glMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait STACKGL_resize_drawingbuffer extends js.Object {
  def resize(width: stdLib.GLint, height: stdLib.GLint): scala.Unit
}

object STACKGL_resize_drawingbuffer {
  @scala.inline
  def apply(resize: (stdLib.GLint, stdLib.GLint) => scala.Unit): STACKGL_resize_drawingbuffer = {
    val __obj = js.Dynamic.literal(resize = js.Any.fromFunction2(resize))
  
    __obj.asInstanceOf[STACKGL_resize_drawingbuffer]
  }
}

