package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestBody[T /* <: Request */] extends js.Object {
  var context: RequestContext
  var request: T
  var session: Session
  var version: java.lang.String
}

object RequestBody {
  @scala.inline
  def apply[T /* <: Request */](context: RequestContext, request: T, session: Session, version: java.lang.String): RequestBody[T] = {
    val __obj = js.Dynamic.literal(context = context, request = request.asInstanceOf[js.Any], session = session, version = version)
  
    __obj.asInstanceOf[RequestBody[T]]
  }
}

