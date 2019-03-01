package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterBufferProtocolRequest extends js.Object {
  var method: java.lang.String
  var referrer: java.lang.String
  var uploadData: js.Array[UploadData]
  var url: java.lang.String
}

object RegisterBufferProtocolRequest {
  @scala.inline
  def apply(
    method: java.lang.String,
    referrer: java.lang.String,
    uploadData: js.Array[UploadData],
    url: java.lang.String
  ): RegisterBufferProtocolRequest = {
    val __obj = js.Dynamic.literal(method = method, referrer = referrer, uploadData = uploadData, url = url)
  
    __obj.asInstanceOf[RegisterBufferProtocolRequest]
  }
}

