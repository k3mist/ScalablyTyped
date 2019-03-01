package typings
package recaptcha2Lib.recaptcha2Mod.Recaptcha2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions[T] extends js.Object {
  var form: T
  var json: recaptcha2Lib.recaptcha2LibNumbers.`true`
  var method: recaptcha2Lib.recaptcha2LibStrings.POST
  var uri: java.lang.String
}

object RequestOptions {
  @scala.inline
  def apply[T](
    form: T,
    json: recaptcha2Lib.recaptcha2LibNumbers.`true`,
    method: recaptcha2Lib.recaptcha2LibStrings.POST,
    uri: java.lang.String
  ): RequestOptions[T] = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], json = json, method = method, uri = uri)
  
    __obj.asInstanceOf[RequestOptions[T]]
  }
}

