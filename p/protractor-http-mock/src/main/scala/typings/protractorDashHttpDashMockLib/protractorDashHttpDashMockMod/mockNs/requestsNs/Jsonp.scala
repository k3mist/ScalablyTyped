package typings
package protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.mockNs.requestsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSONP request mock.
  */
trait Jsonp[TResponse]
  extends AllRequests[TResponse, js.Any] {
  var request: protractorDashHttpDashMockLib.Anon_Method
  var response: protractorDashHttpDashMockLib.Anon_Data[TResponse]
}

object Jsonp {
  @scala.inline
  def apply[TResponse](
    request: protractorDashHttpDashMockLib.Anon_Method,
    response: protractorDashHttpDashMockLib.Anon_Data[TResponse]
  ): Jsonp[TResponse] = {
    val __obj = js.Dynamic.literal(request = request, response = response)
  
    __obj.asInstanceOf[Jsonp[TResponse]]
  }
}

