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
    arrayBuffer: js.Function0[js.Promise[stdLib.ArrayBuffer]],
    blob: js.Function0[js.Promise[Blob]],
    bodyUsed: scala.Boolean,
    formData: js.Function0[js.Promise[FormData]],
    json: js.Function0[js.Promise[_]],
    text: js.Function0[js.Promise[java.lang.String]]
  ): Body = {
    val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer, blob = blob, bodyUsed = bodyUsed, formData = formData, json = json, text = text)
  
    __obj.asInstanceOf[Body]
  }
}

