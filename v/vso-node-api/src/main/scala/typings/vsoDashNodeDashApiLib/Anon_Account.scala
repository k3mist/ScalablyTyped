package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Account extends js.Object {
  var account: scala.Double
  var all: scala.Double
  var collection: scala.Double
  var deployment: scala.Double
  var none: scala.Double
}

object Anon_Account {
  @scala.inline
  def apply(
    account: scala.Double,
    all: scala.Double,
    collection: scala.Double,
    deployment: scala.Double,
    none: scala.Double
  ): Anon_Account = {
    val __obj = js.Dynamic.literal(account = account, all = all, collection = collection, deployment = deployment, none = none)
  
    __obj.asInstanceOf[Anon_Account]
  }
}

