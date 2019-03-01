package typings
package atPulumiAwsLib.apigatewayExperimentalApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventHandlerRoute extends Route {
  var eventHandler: atPulumiAwsLib.lambdaLambdaMixinsMod.EventHandler[Request, Response]
  var method: Method
  var path: java.lang.String
}

object EventHandlerRoute {
  @scala.inline
  def apply(
    eventHandler: atPulumiAwsLib.lambdaLambdaMixinsMod.EventHandler[Request, Response],
    method: Method,
    path: java.lang.String
  ): EventHandlerRoute = {
    val __obj = js.Dynamic.literal(eventHandler = eventHandler.asInstanceOf[js.Any], method = method, path = path)
  
    __obj.asInstanceOf[EventHandlerRoute]
  }
}

