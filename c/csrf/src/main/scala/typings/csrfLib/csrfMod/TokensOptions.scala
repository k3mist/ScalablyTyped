package typings
package csrfLib.csrfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokensOptions extends js.Object {
  /**
    * The string length of the salt (default: 8)
    */
  var saltLength: scala.Double
  /**
    * The byte length of the secret key (default: 18)
    */
  var secretLength: scala.Double
}

object TokensOptions {
  @scala.inline
  def apply(saltLength: scala.Double, secretLength: scala.Double): TokensOptions = {
    val __obj = js.Dynamic.literal(saltLength = saltLength, secretLength = secretLength)
  
    __obj.asInstanceOf[TokensOptions]
  }
}

