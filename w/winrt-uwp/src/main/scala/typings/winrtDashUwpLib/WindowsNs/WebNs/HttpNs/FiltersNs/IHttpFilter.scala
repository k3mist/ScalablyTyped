package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.FiltersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface used to implement custom filters for an HttpClient instance. */
trait IHttpFilter
  extends winrtDashUwpLib.WindowsNs.FoundationNs.IClosable {
  /**
    * Send an HTTP request on the IHttpFilter instance as an asynchronous operation.
    * @param request The HTTP request message to send.
    * @return The object representing the asynchronous operation.
    */
  def sendRequestAsync(request: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpRequestMessage): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[
    winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpResponseMessage, 
    winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpProgress
  ]
}

object IHttpFilter {
  @scala.inline
  def apply(
    close: js.Function0[scala.Unit],
    sendRequestAsync: js.Function1[
      winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpRequestMessage, 
      winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[
        winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpResponseMessage, 
        winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpProgress
      ]
    ]
  ): IHttpFilter = {
    val __obj = js.Dynamic.literal(close = close, sendRequestAsync = sendRequestAsync)
  
    __obj.asInstanceOf[IHttpFilter]
  }
}

