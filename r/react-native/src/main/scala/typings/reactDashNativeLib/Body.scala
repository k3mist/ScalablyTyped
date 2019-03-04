package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  val bodyUsed: scala.Boolean
  def arrayBuffer(): js.Promise[stdLib.ArrayBuffer]
  def blob(): js.Promise[Blob]
  def formData(): js.Promise[FormData]
  def json(): js.Promise[_]
  def text(): js.Promise[java.lang.String]
}

object Body {
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[stdLib.ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: scala.Boolean,
    formData: () => js.Promise[FormData],
    json: () => js.Promise[_],
    text: () => js.Promise[java.lang.String]
  ): Body = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed, formData = js.Any.fromFunction0(formData), json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
  
    __obj.asInstanceOf[Body]
  }
}

