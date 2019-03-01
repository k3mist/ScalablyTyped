package typings
package k6Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: java.lang.String
  var cookies: js.Object
  var headers: js.Object
  var method: java.lang.String
  var url: java.lang.String
}

object Anon_Body {
  @scala.inline
  def apply(
    body: java.lang.String,
    cookies: js.Object,
    headers: js.Object,
    method: java.lang.String,
    url: java.lang.String
  ): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body, cookies = cookies, headers = headers, method = method, url = url)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

