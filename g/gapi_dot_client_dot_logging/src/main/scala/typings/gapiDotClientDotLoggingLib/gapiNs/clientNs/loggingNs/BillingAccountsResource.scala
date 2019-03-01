package typings
package gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingAccountsResource extends js.Object {
  var exclusions: ExclusionsResource
  var logs: LogsResource
  var sinks: SinksResource
}

object BillingAccountsResource {
  @scala.inline
  def apply(exclusions: ExclusionsResource, logs: LogsResource, sinks: SinksResource): BillingAccountsResource = {
    val __obj = js.Dynamic.literal(exclusions = exclusions, logs = logs, sinks = sinks)
  
    __obj.asInstanceOf[BillingAccountsResource]
  }
}

