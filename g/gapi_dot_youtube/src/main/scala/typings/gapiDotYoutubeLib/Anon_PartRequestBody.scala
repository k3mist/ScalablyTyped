package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PartRequestBody extends js.Object {
  /**
    * HTTP Request Body
    */
  var RequestBody: java.lang.String
  /**
    * The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include. The part names that you can include in the parameter value are snippet and contentDetails.
    */
  var part: java.lang.String
}

object Anon_PartRequestBody {
  @scala.inline
  def apply(RequestBody: java.lang.String, part: java.lang.String): Anon_PartRequestBody = {
    val __obj = js.Dynamic.literal(RequestBody = RequestBody, part = part)
  
    __obj.asInstanceOf[Anon_PartRequestBody]
  }
}

