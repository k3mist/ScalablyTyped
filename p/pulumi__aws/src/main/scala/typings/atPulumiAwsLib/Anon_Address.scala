package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: java.lang.String
  var availabilityZone: java.lang.String
  var id: java.lang.String
  var port: scala.Double
}

object Anon_Address {
  @scala.inline
  def apply(
    address: java.lang.String,
    availabilityZone: java.lang.String,
    id: java.lang.String,
    port: scala.Double
  ): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address, availabilityZone = availabilityZone, id = id, port = port)
  
    __obj.asInstanceOf[Anon_Address]
  }
}

