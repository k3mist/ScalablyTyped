package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusObject extends js.Object {
  /**
    * The error code, a key of `grpc.status`
    */
  var code: status
  /**
    * Human-readable description of the status
    */
  var details: java.lang.String
  /**
    * Trailing metadata sent with the status, if applicable
    */
  var metadata: Metadata
}

object StatusObject {
  @scala.inline
  def apply(code: status, details: java.lang.String, metadata: Metadata): StatusObject = {
    val __obj = js.Dynamic.literal(code = code, details = details, metadata = metadata)
  
    __obj.asInstanceOf[StatusObject]
  }
}

