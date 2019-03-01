package typings
package davLib.davMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  /**
    * root url to resolve relative request urls with.
    */
  var baseUrl: java.lang.String
}

object ClientOptions {
  @scala.inline
  def apply(baseUrl: java.lang.String): ClientOptions = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl)
  
    __obj.asInstanceOf[ClientOptions]
  }
}

