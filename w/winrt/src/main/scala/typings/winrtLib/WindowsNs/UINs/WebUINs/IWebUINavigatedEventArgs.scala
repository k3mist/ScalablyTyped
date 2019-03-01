package typings
package winrtLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebUINavigatedEventArgs extends js.Object {
  var navigatedOperation: WebUINavigatedOperation
}

object IWebUINavigatedEventArgs {
  @scala.inline
  def apply(navigatedOperation: WebUINavigatedOperation): IWebUINavigatedEventArgs = {
    val __obj = js.Dynamic.literal(navigatedOperation = navigatedOperation)
  
    __obj.asInstanceOf[IWebUINavigatedEventArgs]
  }
}

